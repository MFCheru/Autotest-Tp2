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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 10);
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
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        try {
            boolean b8 = fixedOrderComparator4.addAsEqual((java.lang.Object) "", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) (short) 1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        try {
            boolean b15 = fixedOrderComparator4.addAsEqual((java.lang.Object) fixedOrderComparator13, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b7 = fixedOrderComparator4.add((java.lang.Object) 10.0d);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map map0 = null;
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        boolean b6 = fixedOrderComparator5.isLocked();
        fixedOrderComparator5.setUnknownObjectBehavior(0);
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) fixedOrderComparator5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            fixedOrderComparator5.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        try {
            int i3 = fixedOrderComparator0.compare(obj1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 0);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        try {
            boolean b9 = fixedOrderComparator4.addAsEqual((java.lang.Object) predicateUtils7, (java.lang.Object) predicateUtils8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator23.isLocked();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        boolean b28 = fixedOrderComparator23.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { fixedOrderComparator6, fixedOrderComparator18, b28, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        try {
            fixedOrderComparator31.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array30);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        defaultedMap1.clear();
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.String str31 = defaultedMap1.toString();
        java.lang.String str32 = defaultedMap1.toString();
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) '4');
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 2 + "'", obj18.equals(2));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.String str31 = defaultedMap1.toString();
        int i32 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b40 = fixedOrderComparator39.isLocked();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b44 = fixedOrderComparator39.add((java.lang.Object) 100.0f);
        boolean b45 = defaultedMap34.equals((java.lang.Object) fixedOrderComparator39);
        fixedOrderComparator39.setUnknownObjectBehavior(2);
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (short) 100);
        defaultedMap2.clear();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        boolean b51 = fixedOrderComparator50.isLocked();
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        boolean b55 = fixedOrderComparator50.add((java.lang.Object) 100.0f);
        boolean b56 = defaultedMap45.equals((java.lang.Object) fixedOrderComparator50);
        java.lang.Object obj58 = defaultedMap45.remove((java.lang.Object) 10.0d);
        boolean b59 = defaultedMap1.equals((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b20 = fixedOrderComparator19.isLocked();
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator19.add((java.lang.Object) 100.0f);
        boolean b25 = defaultedMap14.equals((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj27 = defaultedMap14.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator34.isLocked();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        boolean b39 = fixedOrderComparator34.add((java.lang.Object) 100.0f);
        boolean b40 = defaultedMap29.equals((java.lang.Object) fixedOrderComparator34);
        boolean b42 = defaultedMap29.containsKey((java.lang.Object) (-1L));
        defaultedMap14.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) 100.0d);
        java.lang.String str46 = defaultedMap14.toString();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj54 = defaultedMap14.remove((java.lang.Object) obj_array50);
        java.lang.String str55 = defaultedMap14.toString();
        java.lang.Object obj57 = defaultedMap14.get((java.lang.Object) (byte) 1);
        boolean b58 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 2 + "'", obj27.equals(2));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 2 + "'", obj45.equals(2));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection87 = defaultedMap1.values();
        java.util.Set set88 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(set88);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set18 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj51 = defaultedMap20.get((java.lang.Object) 100.0d);
        java.lang.String str52 = defaultedMap20.toString();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj60 = defaultedMap20.remove((java.lang.Object) obj_array56);
        java.util.Collection collection61 = defaultedMap20.values();
        boolean b62 = defaultedMap1.equals((java.lang.Object) collection61);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2 + "'", obj17.equals(2));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 2 + "'", obj33.equals(2));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 2 + "'", obj51.equals(2));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        java.util.Collection collection18 = defaultedMap1.values();
        boolean b20 = defaultedMap1.equals((java.lang.Object) 10.0d);
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        collections.Factory factory60 = null;
        try {
            java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator30.isLocked();
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator30.add((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap25.equals((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator45.add((java.lang.Object) 100.0f);
        boolean b51 = defaultedMap40.equals((java.lang.Object) fixedOrderComparator45);
        boolean b53 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        defaultedMap25.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj56 = defaultedMap25.get((java.lang.Object) 100.0d);
        java.lang.String str57 = defaultedMap25.toString();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj65 = defaultedMap25.remove((java.lang.Object) obj_array61);
        java.util.Collection collection66 = defaultedMap25.values();
        int i67 = fixedOrderComparator20.compare((java.lang.Object) (short) 10, (java.lang.Object) collection66);
        java.lang.Object obj68 = defaultedMap1.get((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 2 + "'", obj38.equals(2));
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 2 + "'", obj56.equals(2));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 2 + "'", obj68.equals(2));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        int i20 = fixedOrderComparator17.getUnknownObjectBehavior();
        try {
            fixedOrderComparator17.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.String str31 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b39 = fixedOrderComparator38.isLocked();
        fixedOrderComparator38.setUnknownObjectBehavior(0);
        boolean b43 = fixedOrderComparator38.add((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap33.equals((java.lang.Object) fixedOrderComparator38);
        java.lang.Object obj46 = defaultedMap33.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        boolean b54 = fixedOrderComparator53.isLocked();
        fixedOrderComparator53.setUnknownObjectBehavior(0);
        boolean b58 = fixedOrderComparator53.add((java.lang.Object) 100.0f);
        boolean b59 = defaultedMap48.equals((java.lang.Object) fixedOrderComparator53);
        boolean b61 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        defaultedMap33.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj64 = defaultedMap33.get((java.lang.Object) 100.0d);
        java.lang.String str65 = defaultedMap33.toString();
        java.lang.Object[] obj_array69 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array69);
        java.lang.Object obj73 = defaultedMap33.remove((java.lang.Object) obj_array69);
        boolean b74 = defaultedMap1.containsKey(obj73);
        collections.Transformer transformer75 = null;
        try {
            java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 2 + "'", obj46.equals(2));
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 2 + "'", obj64.equals(2));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b15 = fixedOrderComparator14.isLocked();
        fixedOrderComparator14.setUnknownObjectBehavior(0);
        boolean b19 = fixedOrderComparator14.add((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap9.equals((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) 100.0f);
        boolean b35 = defaultedMap24.equals((java.lang.Object) fixedOrderComparator29);
        boolean b37 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj40 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.lang.String str41 = defaultedMap9.toString();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj49 = defaultedMap9.remove((java.lang.Object) obj_array45);
        java.util.Collection collection50 = defaultedMap9.values();
        int i51 = fixedOrderComparator4.compare((java.lang.Object) (short) 10, (java.lang.Object) collection50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        int i53 = fixedOrderComparator52.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator52);
        java.lang.Object obj55 = new java.lang.Object();
        int i56 = fixedOrderComparator4.compare((java.lang.Object) defaultedMap54, obj55);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 2 + "'", obj22.equals(2));
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 2 + "'", obj40.equals(2));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(i56 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b7 = fixedOrderComparator4.add((java.lang.Object) 10.0d);
        boolean b9 = fixedOrderComparator4.add((java.lang.Object) '#');
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.util.Collection collection42 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) collection42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        int i45 = fixedOrderComparator44.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator44);
        java.util.Set set47 = defaultedMap46.keySet();
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap43.isEmpty();
        java.lang.String str50 = defaultedMap43.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        collections.Factory factory38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set18 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj51 = defaultedMap20.get((java.lang.Object) 100.0d);
        java.lang.String str52 = defaultedMap20.toString();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj60 = defaultedMap20.remove((java.lang.Object) obj_array56);
        java.util.Collection collection61 = defaultedMap20.values();
        boolean b62 = defaultedMap1.equals((java.lang.Object) collection61);
        java.util.Set set63 = defaultedMap1.keySet();
        boolean b64 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2 + "'", obj17.equals(2));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 2 + "'", obj33.equals(2));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 2 + "'", obj51.equals(2));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b18 = defaultedMap1.isEmpty();
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2 + "'", obj17.equals(2));
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection87 = defaultedMap1.values();
        java.lang.Object obj88 = null;
        java.lang.Object obj89 = defaultedMap1.get(obj88);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 2 + "'", obj89.equals(2));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        int i20 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(i21 == 2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        boolean b60 = defaultedMap44.isEmpty();
        java.util.Set set61 = defaultedMap44.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        int i63 = fixedOrderComparator62.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator62);
        int i65 = defaultedMap64.size();
        java.lang.Object obj66 = defaultedMap44.get((java.lang.Object) i65);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 2 + "'", obj66.equals(2));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator18.isLocked();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator30.isLocked();
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator30.add((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap25.equals((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator45.add((java.lang.Object) 100.0f);
        boolean b51 = defaultedMap40.equals((java.lang.Object) fixedOrderComparator45);
        boolean b53 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        defaultedMap25.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj56 = defaultedMap25.get((java.lang.Object) 100.0d);
        java.lang.String str57 = defaultedMap25.toString();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj65 = defaultedMap25.remove((java.lang.Object) obj_array61);
        java.lang.String str66 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b74 = fixedOrderComparator73.isLocked();
        fixedOrderComparator73.setUnknownObjectBehavior(0);
        boolean b78 = fixedOrderComparator73.add((java.lang.Object) 100.0f);
        boolean b79 = defaultedMap68.equals((java.lang.Object) fixedOrderComparator73);
        java.lang.Object obj81 = defaultedMap68.remove((java.lang.Object) 10.0d);
        defaultedMap68.clear();
        defaultedMap25.putAll((java.util.Map) defaultedMap68);
        java.lang.String str84 = defaultedMap68.toString();
        java.util.Set set85 = defaultedMap68.entrySet();
        try {
            boolean b86 = fixedOrderComparator18.addAsEqual(obj23, (java.lang.Object) defaultedMap68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 2 + "'", obj38.equals(2));
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 2 + "'", obj56.equals(2));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b7 = fixedOrderComparator4.add((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { fixedOrderComparator4 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator22.isLocked();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        boolean b27 = fixedOrderComparator22.add((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b42 = fixedOrderComparator37.add((java.lang.Object) 100.0f);
        boolean b43 = defaultedMap32.equals((java.lang.Object) fixedOrderComparator37);
        boolean b45 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        defaultedMap17.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj48 = defaultedMap17.get((java.lang.Object) 100.0d);
        java.lang.String str49 = defaultedMap17.toString();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object obj57 = defaultedMap17.remove((java.lang.Object) obj_array53);
        java.lang.String str58 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        try {
            int i61 = fixedOrderComparator9.compare((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 2 + "'", obj30.equals(2));
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 2 + "'", obj48.equals(2));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        boolean b60 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b60 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.util.Set set45 = defaultedMap1.entrySet();
        boolean b46 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 2 + "'", obj44.equals(2));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.util.Set set87 = defaultedMap44.keySet();
        collections.Transformer transformer88 = null;
        try {
            java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, transformer88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(set87);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b25 = fixedOrderComparator20.add((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator20);
        boolean b28 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1L);
        java.lang.Object obj32 = defaultedMap15.get((java.lang.Object) '4');
        int i33 = fixedOrderComparator6.compare((java.lang.Object) (short) 100, (java.lang.Object) '4');
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator();
        int i89 = fixedOrderComparator88.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator88);
        java.lang.Object obj91 = defaultedMap44.put((java.lang.Object) (byte) 1, (java.lang.Object) defaultedMap90);
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator();
        int i93 = fixedOrderComparator92.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator92);
        boolean b95 = defaultedMap44.equals((java.lang.Object) defaultedMap94);
        collections.Factory factory96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, factory96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(i89 == 2);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(i93 == 2);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b27 = fixedOrderComparator26.isLocked();
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator26.add((java.lang.Object) 100.0f);
        boolean b32 = defaultedMap21.equals((java.lang.Object) fixedOrderComparator26);
        java.lang.Object obj34 = defaultedMap21.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b42 = fixedOrderComparator41.isLocked();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        boolean b46 = fixedOrderComparator41.add((java.lang.Object) 100.0f);
        boolean b47 = defaultedMap36.equals((java.lang.Object) fixedOrderComparator41);
        boolean b49 = defaultedMap36.containsKey((java.lang.Object) (-1L));
        defaultedMap21.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj52 = defaultedMap21.get((java.lang.Object) 100.0d);
        boolean b54 = defaultedMap21.containsKey((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = defaultedMap21.put((java.lang.Object) (-1L), (java.lang.Object) 0.0f);
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 2 + "'", obj34.equals(2));
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 2 + "'", obj52.equals(2));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 2 + "'", obj58.equals(2));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection87 = defaultedMap1.values();
        collections.Factory factory88 = null;
        try {
            java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(collection87);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.String str31 = defaultedMap1.toString();
        java.lang.String str32 = defaultedMap1.toString();
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        int i20 = fixedOrderComparator17.getUnknownObjectBehavior();
        try {
            fixedOrderComparator17.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator9.isLocked();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        boolean b14 = fixedOrderComparator9.add((java.lang.Object) 100.0f);
        boolean b15 = defaultedMap4.equals((java.lang.Object) fixedOrderComparator9);
        boolean b17 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        fixedOrderComparator27.setUnknownObjectBehavior(0);
        boolean b32 = fixedOrderComparator27.add((java.lang.Object) 100.0f);
        boolean b33 = defaultedMap22.equals((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj35 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap20.containsValue(obj35);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b42 = fixedOrderComparator41.isLocked();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        boolean b46 = fixedOrderComparator41.add((java.lang.Object) 100.0f);
        java.lang.Object obj47 = defaultedMap4.put((java.lang.Object) defaultedMap20, (java.lang.Object) b46);
        java.util.Set set48 = defaultedMap4.keySet();
        boolean b49 = fixedOrderComparator0.add((java.lang.Object) set48);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        java.util.Collection collection18 = defaultedMap1.values();
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (short) 100);
        int i15 = fixedOrderComparator4.compare((java.lang.Object) b9, (java.lang.Object) (short) 100);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator23.isLocked();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        boolean b28 = fixedOrderComparator23.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { fixedOrderComparator6, fixedOrderComparator18, b28, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b34 = fixedOrderComparator31.add((java.lang.Object) defaultedMap33);
        try {
            fixedOrderComparator31.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator();
        int i89 = fixedOrderComparator88.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator88);
        java.lang.Object obj91 = defaultedMap44.put((java.lang.Object) (byte) 1, (java.lang.Object) defaultedMap90);
        defaultedMap90.clear();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(i89 == 2);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.lang.String str60 = defaultedMap44.toString();
        java.util.Set set61 = defaultedMap44.entrySet();
        int i62 = defaultedMap44.size();
        boolean b63 = defaultedMap44.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b15 = fixedOrderComparator14.isLocked();
        fixedOrderComparator14.setUnknownObjectBehavior(0);
        boolean b19 = fixedOrderComparator14.add((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap9.equals((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) 100.0f);
        boolean b35 = defaultedMap24.equals((java.lang.Object) fixedOrderComparator29);
        boolean b37 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj40 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.lang.String str41 = defaultedMap9.toString();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj49 = defaultedMap9.remove((java.lang.Object) obj_array45);
        java.util.Collection collection50 = defaultedMap9.values();
        int i51 = fixedOrderComparator4.compare((java.lang.Object) (short) 10, (java.lang.Object) collection50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        int i53 = fixedOrderComparator52.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator52);
        java.lang.Object obj55 = new java.lang.Object();
        int i56 = fixedOrderComparator4.compare((java.lang.Object) defaultedMap54, obj55);
        java.util.Set set57 = defaultedMap54.entrySet();
        java.util.Set set58 = defaultedMap54.entrySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 2 + "'", obj22.equals(2));
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 2 + "'", obj40.equals(2));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array37);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator12.isLocked();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b17 = fixedOrderComparator12.add((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj20 = defaultedMap7.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        fixedOrderComparator27.setUnknownObjectBehavior(0);
        boolean b32 = fixedOrderComparator27.add((java.lang.Object) 100.0f);
        boolean b33 = defaultedMap22.equals((java.lang.Object) fixedOrderComparator27);
        boolean b35 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj38 = defaultedMap7.get((java.lang.Object) 100.0d);
        java.lang.String str39 = defaultedMap7.toString();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj47 = defaultedMap7.remove((java.lang.Object) obj_array43);
        java.lang.String str48 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        fixedOrderComparator55.setUnknownObjectBehavior(0);
        boolean b60 = fixedOrderComparator55.add((java.lang.Object) 100.0f);
        boolean b61 = defaultedMap50.equals((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj63 = defaultedMap50.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        boolean b71 = fixedOrderComparator70.isLocked();
        fixedOrderComparator70.setUnknownObjectBehavior(0);
        boolean b75 = fixedOrderComparator70.add((java.lang.Object) 100.0f);
        boolean b76 = defaultedMap65.equals((java.lang.Object) fixedOrderComparator70);
        boolean b78 = defaultedMap65.containsKey((java.lang.Object) (-1L));
        defaultedMap50.putAll((java.util.Map) defaultedMap65);
        java.lang.Object obj81 = defaultedMap50.get((java.lang.Object) 100.0d);
        java.lang.String str82 = defaultedMap50.toString();
        java.lang.Object[] obj_array86 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array86);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array86);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array86);
        java.lang.Object obj90 = defaultedMap50.remove((java.lang.Object) obj_array86);
        java.util.Collection collection91 = defaultedMap50.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap50);
        defaultedMap7.clear();
        boolean b95 = defaultedMap7.equals((java.lang.Object) 100L);
        boolean b96 = fixedOrderComparator5.add((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 2 + "'", obj20.equals(2));
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 2 + "'", obj38.equals(2));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 2 + "'", obj63.equals(2));
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 2 + "'", obj81.equals(2));
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array86);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { defaultedMap1, 0.0d, fixedOrderComparator16, set22, predicate23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        try {
            boolean b30 = fixedOrderComparator26.addAsEqual((java.lang.Object) 10, (java.lang.Object) predicate29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.util.Collection collection42 = defaultedMap1.values();
        java.util.Set set43 = defaultedMap1.keySet();
        int i44 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        java.util.Collection collection18 = defaultedMap1.values();
        java.util.Set set19 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b27 = fixedOrderComparator26.isLocked();
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator26.add((java.lang.Object) 100.0f);
        boolean b32 = defaultedMap21.equals((java.lang.Object) fixedOrderComparator26);
        java.lang.Object obj34 = defaultedMap21.remove((java.lang.Object) 10.0d);
        defaultedMap21.clear();
        java.lang.Object obj37 = defaultedMap21.get((java.lang.Object) (byte) 10);
        java.util.Set set38 = defaultedMap21.entrySet();
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 2 + "'", obj37.equals(2));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b43 = fixedOrderComparator42.isLocked();
        boolean b45 = fixedOrderComparator42.add((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { fixedOrderComparator42 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object obj48 = defaultedMap34.remove((java.lang.Object) obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        try {
            boolean b57 = fixedOrderComparator49.addAsEqual((java.lang.Object) (-1.0d), (java.lang.Object) obj_array54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(obj_array54);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set18 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj33 = defaultedMap20.remove((java.lang.Object) 10.0d);
        defaultedMap20.clear();
        java.lang.Object obj36 = defaultedMap20.get((java.lang.Object) (byte) 10);
        java.util.Set set37 = defaultedMap20.keySet();
        java.util.Set set38 = defaultedMap20.keySet();
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) set38);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2 + "'", obj17.equals(2));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 2 + "'", obj36.equals(2));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b7 = fixedOrderComparator4.add((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { fixedOrderComparator4 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        java.util.Set set3 = defaultedMap2.keySet();
        boolean b5 = defaultedMap2.equals((java.lang.Object) true);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b25 = fixedOrderComparator20.add((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator20);
        java.lang.Object obj28 = defaultedMap15.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        boolean b40 = fixedOrderComparator35.add((java.lang.Object) 100.0f);
        boolean b41 = defaultedMap30.equals((java.lang.Object) fixedOrderComparator35);
        boolean b43 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        defaultedMap15.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj46 = defaultedMap15.get((java.lang.Object) 100.0d);
        java.lang.String str47 = defaultedMap15.toString();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj55 = defaultedMap15.remove((java.lang.Object) obj_array51);
        java.util.Collection collection56 = defaultedMap15.values();
        int i57 = fixedOrderComparator10.compare((java.lang.Object) (short) 10, (java.lang.Object) collection56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator58);
        java.lang.Object obj61 = new java.lang.Object();
        int i62 = fixedOrderComparator10.compare((java.lang.Object) defaultedMap60, obj61);
        java.lang.Object obj63 = defaultedMap2.get(obj61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array71 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        boolean b73 = fixedOrderComparator72.isLocked();
        fixedOrderComparator72.setUnknownObjectBehavior(0);
        boolean b77 = fixedOrderComparator72.add((java.lang.Object) 100.0f);
        boolean b78 = defaultedMap67.equals((java.lang.Object) fixedOrderComparator72);
        java.lang.Object obj80 = defaultedMap67.remove((java.lang.Object) 10.0d);
        boolean b81 = defaultedMap65.containsValue(obj80);
        int i82 = defaultedMap65.size();
        java.lang.Object[] obj_array83 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        java.lang.Object obj85 = defaultedMap65.remove((java.lang.Object) fixedOrderComparator84);
        boolean b86 = defaultedMap2.containsKey(obj85);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 2 + "'", obj28.equals(2));
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 2 + "'", obj46.equals(2));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator6.setUnknownObjectBehavior(2);
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap1.keySet();
        java.util.Set set18 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b25 = fixedOrderComparator20.add((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator20);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b42 = fixedOrderComparator37.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { fixedOrderComparator20, fixedOrderComparator32, b42, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b48 = fixedOrderComparator45.add((java.lang.Object) defaultedMap47);
        boolean b49 = defaultedMap1.equals((java.lang.Object) b48);
        java.util.Set set50 = defaultedMap1.entrySet();
        java.util.Set set51 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        int i8 = fixedOrderComparator4.getUnknownObjectBehavior();
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b49 = fixedOrderComparator48.isLocked();
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        boolean b53 = fixedOrderComparator48.add((java.lang.Object) 100.0f);
        boolean b54 = defaultedMap43.equals((java.lang.Object) fixedOrderComparator48);
        java.lang.Object obj56 = defaultedMap43.remove((java.lang.Object) 10.0d);
        defaultedMap43.clear();
        java.lang.Object obj59 = defaultedMap43.get((java.lang.Object) (byte) 10);
        java.util.Set set60 = defaultedMap43.entrySet();
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) defaultedMap43);
        defaultedMap1.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        boolean b76 = fixedOrderComparator71.add((java.lang.Object) 100.0f);
        boolean b77 = defaultedMap66.equals((java.lang.Object) fixedOrderComparator71);
        java.lang.Object obj79 = defaultedMap66.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array85 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        boolean b87 = fixedOrderComparator86.isLocked();
        fixedOrderComparator86.setUnknownObjectBehavior(0);
        boolean b91 = fixedOrderComparator86.add((java.lang.Object) 100.0f);
        boolean b92 = defaultedMap81.equals((java.lang.Object) fixedOrderComparator86);
        boolean b94 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        defaultedMap66.putAll((java.util.Map) defaultedMap81);
        collections.Predicate predicate96 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate97 = collections.PredicateUtils.truePredicate();
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate96, predicate97);
        java.util.Map map99 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate63, predicate96);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 2 + "'", obj59.equals(2));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 2 + "'", obj61.equals(2));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 2 + "'", obj79.equals(2));
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        defaultedMap1.clear();
        boolean b89 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b90 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.util.Set set16 = defaultedMap1.entrySet();
        int i17 = defaultedMap1.size();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        fixedOrderComparator6.setUnknownObjectBehavior(2);
        boolean b16 = fixedOrderComparator6.add((java.lang.Object) (byte) 1);
        int i17 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b25 = fixedOrderComparator20.add((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator20);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b42 = fixedOrderComparator37.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { fixedOrderComparator20, fixedOrderComparator32, b42, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b48 = fixedOrderComparator45.add((java.lang.Object) defaultedMap47);
        boolean b49 = defaultedMap1.equals((java.lang.Object) b48);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        boolean b53 = fixedOrderComparator52.isLocked();
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) fixedOrderComparator52);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 2 + "'", obj54.equals(2));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.lang.String str60 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection45 = defaultedMap1.values();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        boolean b51 = fixedOrderComparator50.isLocked();
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) b51);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        java.lang.Object obj33 = defaultedMap16.get((java.lang.Object) 2);
        java.lang.String str34 = defaultedMap16.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 2 + "'", obj33.equals(2));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        boolean b60 = defaultedMap44.isEmpty();
        int i61 = defaultedMap44.size();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i61 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator24.add((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap19.equals((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj32 = defaultedMap19.remove((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap17.containsValue(obj32);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b39 = fixedOrderComparator38.isLocked();
        fixedOrderComparator38.setUnknownObjectBehavior(0);
        boolean b43 = fixedOrderComparator38.add((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) b43);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        boolean b51 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b59 = fixedOrderComparator58.isLocked();
        fixedOrderComparator58.setUnknownObjectBehavior(0);
        boolean b63 = fixedOrderComparator58.add((java.lang.Object) 100.0f);
        boolean b64 = defaultedMap53.equals((java.lang.Object) fixedOrderComparator58);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array68);
        try {
            int i71 = fixedOrderComparator49.compare((java.lang.Object) fixedOrderComparator58, (java.lang.Object) obj_array68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(obj_array68);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        defaultedMap1.clear();
        java.util.Set set88 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(set88);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate(map16, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 2 + "'", obj3.equals(2));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        java.util.Set set3 = defaultedMap2.keySet();
        java.lang.String str4 = defaultedMap2.toString();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator44.add((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator44);
        boolean b52 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        boolean b57 = defaultedMap39.containsValue((java.lang.Object) fixedOrderComparator55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        defaultedMap16.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b67 = fixedOrderComparator66.isLocked();
        fixedOrderComparator66.setUnknownObjectBehavior(0);
        boolean b71 = fixedOrderComparator66.add((java.lang.Object) 100.0f);
        boolean b72 = defaultedMap61.equals((java.lang.Object) fixedOrderComparator66);
        java.util.Collection collection73 = defaultedMap61.values();
        defaultedMap61.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator();
        int i77 = fixedOrderComparator76.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator76);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator();
        int i80 = fixedOrderComparator79.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator79);
        java.util.Set set82 = defaultedMap81.keySet();
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array84 = new java.lang.Object[] { defaultedMap61, 0.0d, fixedOrderComparator76, set82, predicate83 };
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array84);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) fixedOrderComparator86);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(i77 == 2);
        org.junit.Assert.assertTrue(i80 == 2);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(obj_array84);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.util.Collection collection15 = defaultedMap3.values();
        defaultedMap3.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { defaultedMap3, 0.0d, fixedOrderComparator18, set24, predicate25 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator27);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj51 = defaultedMap20.get((java.lang.Object) 100.0d);
        java.lang.String str52 = defaultedMap20.toString();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj60 = defaultedMap20.remove((java.lang.Object) obj_array56);
        java.lang.String str61 = defaultedMap20.toString();
        defaultedMap20.clear();
        java.util.Collection collection63 = defaultedMap20.values();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap20);
        int i65 = defaultedMap20.size();
        java.lang.String str66 = defaultedMap20.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 2 + "'", obj18.equals(2));
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 2 + "'", obj33.equals(2));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 2 + "'", obj51.equals(2));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator24.add((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap19.equals((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj32 = defaultedMap19.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b40 = fixedOrderComparator39.isLocked();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b44 = fixedOrderComparator39.add((java.lang.Object) 100.0f);
        boolean b45 = defaultedMap34.equals((java.lang.Object) fixedOrderComparator39);
        boolean b47 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        defaultedMap19.putAll((java.util.Map) defaultedMap34);
        java.lang.String str49 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b57 = fixedOrderComparator56.isLocked();
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        boolean b61 = fixedOrderComparator56.add((java.lang.Object) 100.0f);
        boolean b62 = defaultedMap51.equals((java.lang.Object) fixedOrderComparator56);
        java.lang.Object obj64 = defaultedMap51.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        boolean b76 = fixedOrderComparator71.add((java.lang.Object) 100.0f);
        boolean b77 = defaultedMap66.equals((java.lang.Object) fixedOrderComparator71);
        boolean b79 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        defaultedMap51.putAll((java.util.Map) defaultedMap66);
        java.lang.Object obj82 = defaultedMap51.get((java.lang.Object) 100.0d);
        java.lang.String str83 = defaultedMap51.toString();
        java.lang.Object[] obj_array87 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array87);
        java.lang.Object obj91 = defaultedMap51.remove((java.lang.Object) obj_array87);
        boolean b92 = defaultedMap19.containsKey(obj91);
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) fixedOrderComparator17, (java.lang.Object) b92);
        int i94 = fixedOrderComparator17.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 2 + "'", obj64.equals(2));
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 2 + "'", obj82.equals(2));
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(i94 == 2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) 100.0f);
        boolean b35 = defaultedMap24.equals((java.lang.Object) fixedOrderComparator29);
        java.lang.Object obj37 = defaultedMap24.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap22.containsValue(obj37);
        java.util.Collection collection39 = defaultedMap22.values();
        java.util.Set set40 = defaultedMap22.entrySet();
        try {
            boolean b41 = fixedOrderComparator6.addAsEqual((java.lang.Object) obj_array16, (java.lang.Object) defaultedMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b14 = fixedOrderComparator13.isLocked();
        fixedOrderComparator13.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator13.add((java.lang.Object) 100.0f);
        boolean b19 = defaultedMap8.equals((java.lang.Object) fixedOrderComparator13);
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = fixedOrderComparator31.isLocked();
        fixedOrderComparator31.setUnknownObjectBehavior(0);
        boolean b36 = fixedOrderComparator31.add((java.lang.Object) 100.0f);
        boolean b37 = defaultedMap26.equals((java.lang.Object) fixedOrderComparator31);
        java.lang.Object obj39 = defaultedMap26.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap24.containsValue(obj39);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator45.add((java.lang.Object) 100.0f);
        java.lang.Object obj51 = defaultedMap8.put((java.lang.Object) defaultedMap24, (java.lang.Object) b50);
        java.util.Set set52 = defaultedMap8.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        int i54 = fixedOrderComparator53.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator53);
        java.util.Set set56 = defaultedMap55.keySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap55);
        boolean b58 = fixedOrderComparator6.add((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b15 = fixedOrderComparator10.add((java.lang.Object) 100.0f);
        boolean b16 = defaultedMap5.equals((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj18 = defaultedMap5.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        boolean b33 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        defaultedMap5.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj36 = defaultedMap5.get((java.lang.Object) 100.0d);
        java.lang.String str37 = defaultedMap5.toString();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj45 = defaultedMap5.remove((java.lang.Object) obj_array41);
        java.lang.String str46 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b48 = defaultedMap5.isEmpty();
        java.lang.String str49 = defaultedMap5.toString();
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) str49);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 2 + "'", obj3.equals(2));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 2 + "'", obj18.equals(2));
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 2 + "'", obj36.equals(2));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 2 + "'", obj50.equals(2));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator6.setUnknownObjectBehavior(1);
        boolean b9 = fixedOrderComparator6.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.util.Collection collection32 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b40 = fixedOrderComparator39.isLocked();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b44 = fixedOrderComparator39.add((java.lang.Object) 100.0f);
        boolean b45 = defaultedMap34.equals((java.lang.Object) fixedOrderComparator39);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b57 = fixedOrderComparator56.isLocked();
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        boolean b61 = fixedOrderComparator56.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { fixedOrderComparator39, fixedOrderComparator51, b61, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b67 = fixedOrderComparator64.add((java.lang.Object) defaultedMap66);
        boolean b68 = defaultedMap20.equals((java.lang.Object) b67);
        java.util.Set set69 = defaultedMap20.entrySet();
        java.lang.Object obj70 = defaultedMap1.get((java.lang.Object) set69);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 2 + "'", obj70.equals(2));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.util.Set set42 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        boolean b51 = fixedOrderComparator50.isLocked();
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        boolean b55 = fixedOrderComparator50.add((java.lang.Object) 100.0f);
        boolean b56 = defaultedMap45.equals((java.lang.Object) fixedOrderComparator50);
        java.lang.Object obj58 = defaultedMap45.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        boolean b66 = fixedOrderComparator65.isLocked();
        fixedOrderComparator65.setUnknownObjectBehavior(0);
        boolean b70 = fixedOrderComparator65.add((java.lang.Object) 100.0f);
        boolean b71 = defaultedMap60.equals((java.lang.Object) fixedOrderComparator65);
        boolean b73 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        defaultedMap45.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj76 = defaultedMap45.get((java.lang.Object) 100.0d);
        java.lang.String str77 = defaultedMap45.toString();
        java.lang.Object[] obj_array81 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array81);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array81);
        java.lang.Object obj85 = defaultedMap45.remove((java.lang.Object) obj_array81);
        java.util.Collection collection86 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) collection86);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator();
        int i89 = fixedOrderComparator88.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator88);
        java.util.Set set91 = defaultedMap90.keySet();
        defaultedMap87.putAll((java.util.Map) defaultedMap90);
        boolean b93 = defaultedMap87.isEmpty();
        java.util.Set set94 = defaultedMap87.entrySet();
        java.lang.Object obj95 = defaultedMap43.remove((java.lang.Object) defaultedMap87);
        java.util.Set set96 = defaultedMap43.entrySet();
        java.lang.Object obj98 = defaultedMap43.get((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 2 + "'", obj58.equals(2));
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 2 + "'", obj76.equals(2));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertTrue(i89 == 2);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertNotNull(obj98);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj51 = defaultedMap20.get((java.lang.Object) 100.0d);
        java.lang.String str52 = defaultedMap20.toString();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj60 = defaultedMap20.remove((java.lang.Object) obj_array56);
        java.lang.String str61 = defaultedMap20.toString();
        defaultedMap20.clear();
        java.util.Collection collection63 = defaultedMap20.values();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap20);
        java.util.Collection collection65 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 2 + "'", obj18.equals(2));
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 2 + "'", obj33.equals(2));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 2 + "'", obj51.equals(2));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        defaultedMap34.clear();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        int i43 = defaultedMap1.size();
        int i44 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b25 = fixedOrderComparator20.add((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator20);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b42 = fixedOrderComparator37.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { fixedOrderComparator20, fixedOrderComparator32, b42, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b48 = fixedOrderComparator45.add((java.lang.Object) defaultedMap47);
        boolean b49 = defaultedMap1.equals((java.lang.Object) b48);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.lang.Object obj53 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator44.add((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator44);
        boolean b52 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        boolean b57 = defaultedMap39.containsValue((java.lang.Object) fixedOrderComparator55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        defaultedMap16.putAll((java.util.Map) defaultedMap58);
        int i60 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b25 = fixedOrderComparator20.add((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator20);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b42 = fixedOrderComparator37.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { fixedOrderComparator20, fixedOrderComparator32, b42, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b48 = fixedOrderComparator45.add((java.lang.Object) defaultedMap47);
        boolean b49 = defaultedMap1.equals((java.lang.Object) b48);
        java.util.Set set50 = defaultedMap1.entrySet();
        java.util.Set set51 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator44.add((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator44);
        boolean b52 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        boolean b57 = defaultedMap39.containsValue((java.lang.Object) fixedOrderComparator55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        defaultedMap16.putAll((java.util.Map) defaultedMap58);
        boolean b60 = defaultedMap58.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b60 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b15 = fixedOrderComparator14.isLocked();
        fixedOrderComparator14.setUnknownObjectBehavior(0);
        boolean b19 = fixedOrderComparator14.add((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap9.equals((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) 100.0f);
        boolean b35 = defaultedMap24.equals((java.lang.Object) fixedOrderComparator29);
        boolean b37 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj40 = defaultedMap9.get((java.lang.Object) 100.0d);
        java.lang.String str41 = defaultedMap9.toString();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj49 = defaultedMap9.remove((java.lang.Object) obj_array45);
        java.lang.String str50 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        boolean b58 = fixedOrderComparator57.isLocked();
        fixedOrderComparator57.setUnknownObjectBehavior(0);
        boolean b62 = fixedOrderComparator57.add((java.lang.Object) 100.0f);
        boolean b63 = defaultedMap52.equals((java.lang.Object) fixedOrderComparator57);
        java.lang.Object obj65 = defaultedMap52.remove((java.lang.Object) 10.0d);
        defaultedMap52.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap52);
        boolean b68 = defaultedMap52.isEmpty();
        java.util.Set set69 = defaultedMap52.keySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array75 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        boolean b77 = fixedOrderComparator76.isLocked();
        fixedOrderComparator76.setUnknownObjectBehavior(0);
        boolean b81 = fixedOrderComparator76.add((java.lang.Object) 100.0f);
        boolean b82 = defaultedMap71.equals((java.lang.Object) fixedOrderComparator76);
        boolean b84 = defaultedMap71.containsKey((java.lang.Object) (-1L));
        defaultedMap71.clear();
        int i86 = fixedOrderComparator4.compare((java.lang.Object) defaultedMap52, (java.lang.Object) defaultedMap71);
        boolean b87 = fixedOrderComparator4.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 2 + "'", obj22.equals(2));
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 2 + "'", obj40.equals(2));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Set set44 = defaultedMap1.entrySet();
        collections.Transformer transformer45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set45 = defaultedMap44.entrySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.util.Collection collection15 = defaultedMap3.values();
        defaultedMap3.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { defaultedMap3, 0.0d, fixedOrderComparator18, set24, predicate25 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (short) 100);
        java.lang.Object obj34 = null;
        try {
            int i35 = fixedOrderComparator0.compare((java.lang.Object) (short) 100, obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Set set44 = defaultedMap1.entrySet();
        java.lang.String str45 = defaultedMap1.toString();
        java.util.Set set46 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator24.add((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap19.equals((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj32 = defaultedMap19.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b40 = fixedOrderComparator39.isLocked();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b44 = fixedOrderComparator39.add((java.lang.Object) 100.0f);
        boolean b45 = defaultedMap34.equals((java.lang.Object) fixedOrderComparator39);
        boolean b47 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        defaultedMap19.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj50 = defaultedMap19.get((java.lang.Object) 100.0d);
        java.lang.String str51 = defaultedMap19.toString();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object obj59 = defaultedMap19.remove((java.lang.Object) obj_array55);
        java.lang.String str60 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.util.Set set62 = defaultedMap19.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 2 + "'", obj50.equals(2));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(set62);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        boolean b44 = defaultedMap1.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        java.util.Set set38 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator45.add((java.lang.Object) 100.0f);
        boolean b51 = defaultedMap40.equals((java.lang.Object) fixedOrderComparator45);
        java.lang.Object obj53 = defaultedMap40.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        boolean b61 = fixedOrderComparator60.isLocked();
        fixedOrderComparator60.setUnknownObjectBehavior(0);
        boolean b65 = fixedOrderComparator60.add((java.lang.Object) 100.0f);
        boolean b66 = defaultedMap55.equals((java.lang.Object) fixedOrderComparator60);
        boolean b68 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        defaultedMap40.putAll((java.util.Map) defaultedMap55);
        defaultedMap55.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator();
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator71);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) (short) 100);
        java.lang.Object obj76 = defaultedMap55.remove((java.lang.Object) defaultedMap73);
        boolean b77 = defaultedMap16.containsValue(obj76);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 2 + "'", obj53.equals(2));
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator44.add((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator44);
        boolean b52 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        boolean b57 = defaultedMap39.containsValue((java.lang.Object) fixedOrderComparator55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        defaultedMap16.putAll((java.util.Map) defaultedMap58);
        java.util.Set set60 = defaultedMap58.keySet();
        java.util.Set set61 = defaultedMap58.keySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap35.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        defaultedMap35.clear();
        collections.Transformer transformer52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, transformer52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        boolean b44 = defaultedMap1.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate45, predicate46);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b53 = defaultedMap1.containsKey((java.lang.Object) obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        try {
            fixedOrderComparator54.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        defaultedMap16.clear();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator44.add((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator44);
        boolean b52 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        boolean b57 = defaultedMap39.containsValue((java.lang.Object) fixedOrderComparator55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        defaultedMap16.putAll((java.util.Map) defaultedMap58);
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) (short) -1);
        collections.Transformer transformer62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, transformer62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator22.isLocked();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        boolean b27 = fixedOrderComparator22.add((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj30 = defaultedMap17.remove((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap15.containsValue(obj30);
        int i32 = defaultedMap15.size();
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj35 = defaultedMap15.remove((java.lang.Object) fixedOrderComparator34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        try {
            boolean b37 = fixedOrderComparator6.addAsEqual((java.lang.Object) 0.0d, (java.lang.Object) defaultedMap36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        boolean b44 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        boolean b44 = defaultedMap1.isEmpty();
        java.lang.String str45 = defaultedMap1.toString();
        java.lang.String str46 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator24.add((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap19.equals((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj32 = defaultedMap19.remove((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap17.containsValue(obj32);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b39 = fixedOrderComparator38.isLocked();
        fixedOrderComparator38.setUnknownObjectBehavior(0);
        boolean b43 = fixedOrderComparator38.add((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) b43);
        boolean b45 = defaultedMap17.isEmpty();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        boolean b51 = fixedOrderComparator50.isLocked();
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        java.lang.Object obj56 = defaultedMap17.get((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 2 + "'", obj56.equals(2));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set18 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj51 = defaultedMap20.get((java.lang.Object) 100.0d);
        java.lang.String str52 = defaultedMap20.toString();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj60 = defaultedMap20.remove((java.lang.Object) obj_array56);
        java.util.Collection collection61 = defaultedMap20.values();
        boolean b62 = defaultedMap1.equals((java.lang.Object) collection61);
        boolean b64 = defaultedMap1.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2 + "'", obj17.equals(2));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 2 + "'", obj33.equals(2));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 2 + "'", obj51.equals(2));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) fixedOrderComparator22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator30.isLocked();
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator30.add((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap25.equals((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator45.add((java.lang.Object) 100.0f);
        boolean b51 = defaultedMap40.equals((java.lang.Object) fixedOrderComparator45);
        boolean b53 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        defaultedMap25.putAll((java.util.Map) defaultedMap40);
        java.lang.String str55 = defaultedMap25.toString();
        boolean b56 = fixedOrderComparator22.add((java.lang.Object) str55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap59.clear();
        java.util.Set set74 = defaultedMap59.entrySet();
        int i75 = defaultedMap59.size();
        try {
            int i76 = fixedOrderComparator22.compare((java.lang.Object) 1.0d, (java.lang.Object) i75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 2 + "'", obj23.equals(2));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 2 + "'", obj38.equals(2));
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(i75 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator45.add((java.lang.Object) 100.0f);
        boolean b51 = defaultedMap40.equals((java.lang.Object) fixedOrderComparator45);
        java.lang.Object obj53 = defaultedMap40.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        boolean b61 = fixedOrderComparator60.isLocked();
        fixedOrderComparator60.setUnknownObjectBehavior(0);
        boolean b65 = fixedOrderComparator60.add((java.lang.Object) 100.0f);
        boolean b66 = defaultedMap55.equals((java.lang.Object) fixedOrderComparator60);
        boolean b68 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        defaultedMap40.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj71 = defaultedMap40.get((java.lang.Object) 100.0d);
        java.lang.String str72 = defaultedMap40.toString();
        java.lang.Object[] obj_array76 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array76);
        java.lang.Object obj80 = defaultedMap40.remove((java.lang.Object) obj_array76);
        java.util.Collection collection81 = defaultedMap40.values();
        int i82 = fixedOrderComparator35.compare((java.lang.Object) (short) 10, (java.lang.Object) collection81);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection81);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 2 + "'", obj53.equals(2));
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 2 + "'", obj71.equals(2));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.String str31 = defaultedMap1.toString();
        int i32 = defaultedMap1.size();
        int i33 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { defaultedMap1, 0.0d, fixedOrderComparator16, set22, predicate23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        try {
            fixedOrderComparator26.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj_array24);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj37 = defaultedMap16.remove((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator44.add((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator44);
        boolean b52 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        boolean b57 = defaultedMap39.containsValue((java.lang.Object) fixedOrderComparator55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        defaultedMap16.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b67 = fixedOrderComparator66.isLocked();
        fixedOrderComparator66.setUnknownObjectBehavior(0);
        boolean b71 = fixedOrderComparator66.add((java.lang.Object) 100.0f);
        boolean b72 = defaultedMap61.equals((java.lang.Object) fixedOrderComparator66);
        java.lang.Object obj74 = defaultedMap61.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b82 = fixedOrderComparator81.isLocked();
        fixedOrderComparator81.setUnknownObjectBehavior(0);
        boolean b86 = fixedOrderComparator81.add((java.lang.Object) 100.0f);
        boolean b87 = defaultedMap76.equals((java.lang.Object) fixedOrderComparator81);
        boolean b89 = defaultedMap76.containsKey((java.lang.Object) (-1L));
        defaultedMap61.putAll((java.util.Map) defaultedMap76);
        defaultedMap76.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator();
        int i93 = fixedOrderComparator92.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator92);
        java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap94, (java.lang.Object) (short) 100);
        java.lang.Object obj97 = defaultedMap76.remove((java.lang.Object) defaultedMap94);
        java.util.Collection collection98 = defaultedMap76.values();
        java.lang.Object obj99 = defaultedMap58.get((java.lang.Object) collection98);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 2 + "'", obj74.equals(2));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(i93 == 2);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertNotNull(collection98);
        org.junit.Assert.assertNotNull(obj99);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.util.Set set16 = defaultedMap1.entrySet();
        int i17 = defaultedMap1.size();
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set18 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str20 = defaultedMap19.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2 + "'", obj17.equals(2));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.lang.String str60 = defaultedMap44.toString();
        boolean b61 = defaultedMap44.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        fixedOrderComparator27.setUnknownObjectBehavior(0);
        boolean b32 = fixedOrderComparator27.add((java.lang.Object) 100.0f);
        boolean b33 = defaultedMap22.equals((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj35 = defaultedMap22.remove((java.lang.Object) 10.0d);
        defaultedMap22.clear();
        java.lang.Object obj38 = defaultedMap22.get((java.lang.Object) (byte) 10);
        boolean b39 = defaultedMap22.isEmpty();
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 2 + "'", obj38.equals(2));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 2 + "'", obj40.equals(2));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        int i3 = defaultedMap2.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b15 = fixedOrderComparator10.add((java.lang.Object) 100.0f);
        boolean b16 = defaultedMap5.equals((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj18 = defaultedMap5.remove((java.lang.Object) 10.0d);
        defaultedMap5.clear();
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) (byte) 10);
        boolean b22 = defaultedMap5.isEmpty();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b33 = fixedOrderComparator32.isLocked();
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        boolean b37 = fixedOrderComparator32.add((java.lang.Object) 100.0f);
        boolean b38 = defaultedMap27.equals((java.lang.Object) fixedOrderComparator32);
        java.lang.Object obj40 = defaultedMap27.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        boolean b48 = fixedOrderComparator47.isLocked();
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        boolean b52 = fixedOrderComparator47.add((java.lang.Object) 100.0f);
        boolean b53 = defaultedMap42.equals((java.lang.Object) fixedOrderComparator47);
        boolean b55 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        defaultedMap27.putAll((java.util.Map) defaultedMap42);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate24, predicate58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        fixedOrderComparator67.setUnknownObjectBehavior(0);
        boolean b72 = fixedOrderComparator67.add((java.lang.Object) 100.0f);
        boolean b73 = defaultedMap62.equals((java.lang.Object) fixedOrderComparator67);
        boolean b75 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) 1L);
        java.util.Set set78 = defaultedMap62.keySet();
        boolean b79 = defaultedMap2.containsValue((java.lang.Object) set78);
        defaultedMap2.clear();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 2 + "'", obj21.equals(2));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 2 + "'", obj40.equals(2));
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.util.Set set42 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) set42);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 2 + "'", obj16.equals(2));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.String str31 = defaultedMap1.toString();
        java.lang.String str32 = defaultedMap1.toString();
        boolean b33 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { defaultedMap1, 0.0d, fixedOrderComparator16, set22, predicate23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        try {
            fixedOrderComparator26.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj_array24);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap35.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        boolean b58 = fixedOrderComparator57.isLocked();
        fixedOrderComparator57.setUnknownObjectBehavior(0);
        boolean b62 = fixedOrderComparator57.add((java.lang.Object) 100.0f);
        boolean b63 = defaultedMap52.equals((java.lang.Object) fixedOrderComparator57);
        boolean b65 = defaultedMap52.containsKey((java.lang.Object) (-1L));
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 1L);
        java.lang.Object obj69 = defaultedMap52.get((java.lang.Object) '4');
        defaultedMap52.clear();
        boolean b71 = defaultedMap1.equals((java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 2 + "'", obj69.equals(2));
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        int i18 = defaultedMap1.size();
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b67 = fixedOrderComparator66.isLocked();
        fixedOrderComparator66.setUnknownObjectBehavior(0);
        boolean b71 = fixedOrderComparator66.add((java.lang.Object) 100.0f);
        boolean b72 = defaultedMap61.equals((java.lang.Object) fixedOrderComparator66);
        java.lang.Object obj74 = defaultedMap61.remove((java.lang.Object) 10.0d);
        defaultedMap61.clear();
        java.lang.Object obj77 = defaultedMap61.get((java.lang.Object) (byte) 10);
        boolean b78 = defaultedMap61.isEmpty();
        java.lang.Object obj79 = null;
        boolean b80 = defaultedMap61.containsValue(obj79);
        boolean b81 = defaultedMap1.equals((java.lang.Object) b80);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 2 + "'", obj77.equals(2));
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator24.add((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap19.equals((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj32 = defaultedMap19.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b40 = fixedOrderComparator39.isLocked();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b44 = fixedOrderComparator39.add((java.lang.Object) 100.0f);
        boolean b45 = defaultedMap34.equals((java.lang.Object) fixedOrderComparator39);
        boolean b47 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        defaultedMap19.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate50, predicate52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.remove(obj15);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        int i18 = defaultedMap1.size();
        java.lang.String str19 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        java.util.Set set26 = defaultedMap21.entrySet();
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 2 + "'", obj23.equals(2));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.util.Collection collection42 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) collection42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        int i45 = fixedOrderComparator44.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator44);
        java.util.Set set47 = defaultedMap46.keySet();
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap43.isEmpty();
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { fixedOrderComparator8, fixedOrderComparator20, b30, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b36 = fixedOrderComparator33.add((java.lang.Object) defaultedMap35);
        boolean b37 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0.0f);
        boolean b42 = fixedOrderComparator33.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        boolean b52 = fixedOrderComparator51.isLocked();
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        boolean b56 = fixedOrderComparator51.add((java.lang.Object) 100.0f);
        boolean b57 = defaultedMap46.equals((java.lang.Object) fixedOrderComparator51);
        java.lang.Object obj59 = defaultedMap46.remove((java.lang.Object) 10.0d);
        boolean b60 = defaultedMap44.containsValue(obj59);
        int i61 = defaultedMap44.size();
        java.lang.String str62 = defaultedMap44.toString();
        boolean b63 = defaultedMap44.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator();
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator64);
        java.util.Set set67 = defaultedMap66.keySet();
        boolean b69 = defaultedMap66.equals((java.lang.Object) true);
        boolean b70 = fixedOrderComparator33.addAsEqual((java.lang.Object) b63, (java.lang.Object) defaultedMap66);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 2 + "'", obj41.equals(2));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Set set44 = defaultedMap1.entrySet();
        java.lang.String str45 = defaultedMap1.toString();
        int i46 = defaultedMap1.size();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj54 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator53);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator6.setUnknownObjectBehavior(1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b16 = fixedOrderComparator15.isLocked();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b20 = fixedOrderComparator15.add((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap10.equals((java.lang.Object) fixedOrderComparator15);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b33 = fixedOrderComparator32.isLocked();
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        boolean b37 = fixedOrderComparator32.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { fixedOrderComparator15, fixedOrderComparator27, b37, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b43 = fixedOrderComparator40.add((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        boolean b51 = fixedOrderComparator50.isLocked();
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        boolean b55 = fixedOrderComparator50.add((java.lang.Object) 100.0f);
        boolean b56 = defaultedMap45.equals((java.lang.Object) fixedOrderComparator50);
        java.lang.Object obj58 = defaultedMap45.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        boolean b66 = fixedOrderComparator65.isLocked();
        fixedOrderComparator65.setUnknownObjectBehavior(0);
        boolean b70 = fixedOrderComparator65.add((java.lang.Object) 100.0f);
        boolean b71 = defaultedMap60.equals((java.lang.Object) fixedOrderComparator65);
        boolean b73 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        defaultedMap45.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj76 = defaultedMap45.get((java.lang.Object) 100.0d);
        java.lang.String str77 = defaultedMap45.toString();
        java.lang.Object[] obj_array81 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array81);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array81);
        java.lang.Object obj85 = defaultedMap45.remove((java.lang.Object) obj_array81);
        java.lang.String str86 = defaultedMap45.toString();
        defaultedMap45.clear();
        boolean b88 = defaultedMap45.isEmpty();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate89, predicate90);
        java.lang.Object[] obj_array95 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator96 = new collections.comparators.FixedOrderComparator(obj_array95);
        boolean b97 = defaultedMap45.containsKey((java.lang.Object) obj_array95);
        collections.comparators.FixedOrderComparator fixedOrderComparator98 = new collections.comparators.FixedOrderComparator(obj_array95);
        int i99 = fixedOrderComparator6.compare((java.lang.Object) fixedOrderComparator40, (java.lang.Object) obj_array95);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 2 + "'", obj58.equals(2));
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 2 + "'", obj76.equals(2));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(obj_array95);
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue(i99 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator6.setUnknownObjectBehavior(1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b16 = fixedOrderComparator15.isLocked();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b20 = fixedOrderComparator15.add((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap10.equals((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator30.isLocked();
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator30.add((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap25.equals((java.lang.Object) fixedOrderComparator30);
        boolean b38 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        defaultedMap10.putAll((java.util.Map) defaultedMap25);
        defaultedMap25.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        int i42 = fixedOrderComparator41.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator41);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (short) 100);
        java.lang.Object obj46 = defaultedMap25.remove((java.lang.Object) defaultedMap43);
        java.util.Collection collection47 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        boolean b55 = fixedOrderComparator54.isLocked();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        boolean b59 = fixedOrderComparator54.add((java.lang.Object) 100.0f);
        boolean b60 = defaultedMap49.equals((java.lang.Object) fixedOrderComparator54);
        java.lang.Object obj62 = defaultedMap49.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        boolean b70 = fixedOrderComparator69.isLocked();
        fixedOrderComparator69.setUnknownObjectBehavior(0);
        boolean b74 = fixedOrderComparator69.add((java.lang.Object) 100.0f);
        boolean b75 = defaultedMap64.equals((java.lang.Object) fixedOrderComparator69);
        boolean b77 = defaultedMap64.containsKey((java.lang.Object) (-1L));
        defaultedMap49.putAll((java.util.Map) defaultedMap64);
        java.lang.Object obj80 = defaultedMap49.get((java.lang.Object) 100.0d);
        java.lang.String str81 = defaultedMap49.toString();
        java.lang.Object[] obj_array85 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array85);
        java.lang.Object obj89 = defaultedMap49.remove((java.lang.Object) obj_array85);
        java.lang.String str90 = defaultedMap49.toString();
        defaultedMap49.clear();
        boolean b92 = defaultedMap49.isEmpty();
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate93, predicate94);
        try {
            boolean b96 = fixedOrderComparator6.addAsEqual((java.lang.Object) collection47, (java.lang.Object) predicate94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 2 + "'", obj23.equals(2));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 2 + "'", obj62.equals(2));
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 2 + "'", obj80.equals(2));
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator23.isLocked();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        boolean b28 = fixedOrderComparator23.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { fixedOrderComparator6, fixedOrderComparator18, b28, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 2);
        boolean b34 = fixedOrderComparator31.add((java.lang.Object) defaultedMap33);
        int i35 = fixedOrderComparator31.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        java.util.Set set3 = defaultedMap2.keySet();
        boolean b5 = defaultedMap2.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator12.isLocked();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b17 = fixedOrderComparator12.add((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator12);
        boolean b20 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator30.isLocked();
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator30.add((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap25.equals((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj38 = defaultedMap25.remove((java.lang.Object) 10.0d);
        boolean b39 = defaultedMap23.containsValue(obj38);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator44.add((java.lang.Object) 100.0f);
        java.lang.Object obj50 = defaultedMap7.put((java.lang.Object) defaultedMap23, (java.lang.Object) b49);
        java.util.Set set51 = defaultedMap7.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 2 + "'", obj16.equals(2));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        boolean b69 = fixedOrderComparator64.add((java.lang.Object) 100.0f);
        boolean b70 = defaultedMap59.equals((java.lang.Object) fixedOrderComparator64);
        boolean b72 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj75 = defaultedMap44.get((java.lang.Object) 100.0d);
        java.lang.String str76 = defaultedMap44.toString();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object obj84 = defaultedMap44.remove((java.lang.Object) obj_array80);
        java.util.Collection collection85 = defaultedMap44.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        defaultedMap1.clear();
        java.lang.String str88 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 2 + "'", obj57.equals(2));
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 2 + "'", obj75.equals(2));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "{}" + "'", str88.equals("{}"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator23.isLocked();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        boolean b28 = fixedOrderComparator23.add((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { fixedOrderComparator6, fixedOrderComparator18, b28, (short) -1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array30);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set18 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator40);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj51 = defaultedMap20.get((java.lang.Object) 100.0d);
        java.lang.String str52 = defaultedMap20.toString();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj60 = defaultedMap20.remove((java.lang.Object) obj_array56);
        java.util.Collection collection61 = defaultedMap20.values();
        boolean b62 = defaultedMap1.equals((java.lang.Object) collection61);
        java.util.Set set63 = defaultedMap1.keySet();
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        boolean b76 = fixedOrderComparator71.add((java.lang.Object) 100.0f);
        boolean b77 = defaultedMap66.equals((java.lang.Object) fixedOrderComparator71);
        fixedOrderComparator71.setUnknownObjectBehavior(2);
        java.lang.Object obj80 = defaultedMap1.put(obj64, (java.lang.Object) fixedOrderComparator71);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2 + "'", obj17.equals(2));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 2 + "'", obj33.equals(2));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 2 + "'", obj51.equals(2));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        boolean b18 = defaultedMap1.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b31 = defaultedMap1.isEmpty();
        java.lang.String str32 = defaultedMap1.toString();
        boolean b34 = defaultedMap1.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b42 = fixedOrderComparator37.add((java.lang.Object) 100.0f);
        boolean b43 = defaultedMap32.equals((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj45 = defaultedMap32.remove((java.lang.Object) 10.0d);
        defaultedMap32.clear();
        boolean b47 = defaultedMap16.containsValue((java.lang.Object) defaultedMap32);
        int i48 = defaultedMap16.size();
        collections.Transformer transformer49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b7 = fixedOrderComparator4.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap1.containsValue(obj16);
        int i18 = defaultedMap1.size();
        java.lang.Object[] obj_array19 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator20);
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap1.equals(obj22);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection21 = defaultedMap20.values();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator21.add((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator21);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.String str33 = defaultedMap1.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) obj_array37);
        java.lang.String str42 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj57 = defaultedMap44.remove((java.lang.Object) 10.0d);
        defaultedMap44.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.util.Set set60 = defaultedMap44.keySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 2 + "'", obj14.equals(2));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 2 + "'", obj32.equals(2));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b15 = fixedOrderComparator10.add((java.lang.Object) 100.0f);
        boolean b16 = defaultedMap5.equals((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj18 = defaultedMap5.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator25.add((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator25);
        boolean b33 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        defaultedMap5.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj36 = defaultedMap5.get((java.lang.Object) 100.0d);
        java.lang.String str37 = defaultedMap5.toString();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj45 = defaultedMap5.remove((java.lang.Object) obj_array41);
        java.lang.String str46 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        boolean b54 = fixedOrderComparator53.isLocked();
        fixedOrderComparator53.setUnknownObjectBehavior(0);
        boolean b58 = fixedOrderComparator53.add((java.lang.Object) 100.0f);
        boolean b59 = defaultedMap48.equals((java.lang.Object) fixedOrderComparator53);
        java.lang.Object obj61 = defaultedMap48.remove((java.lang.Object) 10.0d);
        defaultedMap48.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap48);
        boolean b64 = defaultedMap48.isEmpty();
        java.util.Set set65 = defaultedMap48.keySet();
        boolean b66 = fixedOrderComparator0.add((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 2 + "'", obj18.equals(2));
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 2 + "'", obj36.equals(2));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator6.add((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection13 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { defaultedMap1, 0.0d, fixedOrderComparator16, set22, predicate23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator34.isLocked();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        boolean b39 = fixedOrderComparator34.add((java.lang.Object) 100.0f);
        boolean b40 = defaultedMap29.equals((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj42 = defaultedMap29.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, (byte) 100, 100L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator49.isLocked();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator49.add((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap44.equals((java.lang.Object) fixedOrderComparator49);
        boolean b57 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        defaultedMap29.putAll((java.util.Map) defaultedMap44);
        java.lang.String str59 = defaultedMap29.toString();
        boolean b60 = fixedOrderComparator27.add((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 2 + "'", obj42.equals(2));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b60 == false);
    }
}

