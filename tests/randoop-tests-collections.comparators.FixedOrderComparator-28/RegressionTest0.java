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
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
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
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        try {
            int i5 = fixedOrderComparator0.compare((java.lang.Object) false, (java.lang.Object) predicateUtils4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        try {
            int i7 = fixedOrderComparator0.compare((java.lang.Object) 10, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        boolean b3 = fixedOrderComparator2.isLocked();
        try {
            int i4 = fixedOrderComparator0.compare((java.lang.Object) (byte) 100, (java.lang.Object) b3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator7.add(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        try {
            boolean b29 = fixedOrderComparator7.addAsEqual(obj20, (java.lang.Object) fixedOrderComparator28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertNotNull(obj_array27);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        boolean b18 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection31 = defaultedMap20.values();
        java.lang.Object obj32 = defaultedMap4.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap20);
        try {
            int i33 = fixedOrderComparator0.compare((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        boolean b12 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        try {
            int i23 = fixedOrderComparator0.compare((java.lang.Object) b12, (java.lang.Object) defaultedMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 1.0d);
        boolean b20 = defaultedMap11.isEmpty();
        boolean b21 = defaultedMap11.isEmpty();
        try {
            int i22 = fixedOrderComparator8.compare((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        try {
            int i16 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator10, (java.lang.Object) fixedOrderComparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i22 = fixedOrderComparator20.getUnknownObjectBehavior();
        try {
            int i24 = fixedOrderComparator12.compare((java.lang.Object) i22, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(i22 == 2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection21 = defaultedMap10.values();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj32 = defaultedMap10.put((java.lang.Object) obj_array28, (java.lang.Object) i31);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate(map15, predicate16, predicate17);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map15, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj12 = null;
        boolean b13 = fixedOrderComparator11.add(obj12);
        java.lang.Object obj14 = defaultedMap1.remove(obj12);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = null;
        try {
            boolean b11 = fixedOrderComparator8.addAsEqual(obj9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b7 = fixedOrderComparator4.isLocked();
        java.lang.Object obj8 = defaultedMap2.put((java.lang.Object) (short) 1, (java.lang.Object) b7);
        java.lang.Object obj10 = defaultedMap2.get((java.lang.Object) 1.0d);
        boolean b11 = defaultedMap2.isEmpty();
        java.util.Set set12 = defaultedMap2.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        boolean b25 = defaultedMap15.isEmpty();
        boolean b26 = defaultedMap15.isEmpty();
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate13, predicate28);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map32 = collections.map.PredicatedMap.decorate(map0, predicate28, predicate31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        boolean b11 = fixedOrderComparator8.isLocked();
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) (short) 1, (java.lang.Object) b11);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1.0d);
        boolean b15 = defaultedMap6.isEmpty();
        java.util.Set set16 = defaultedMap6.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b24 = fixedOrderComparator21.isLocked();
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) (short) 1, (java.lang.Object) b24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 1.0d);
        boolean b28 = defaultedMap19.isEmpty();
        boolean b29 = defaultedMap19.isEmpty();
        boolean b30 = defaultedMap19.isEmpty();
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate17, predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate32, predicate35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        int i39 = fixedOrderComparator37.getUnknownObjectBehavior();
        try {
            int i40 = fixedOrderComparator0.compare((java.lang.Object) map36, (java.lang.Object) i39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 0 + "'", obj27.equals((byte) 0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        boolean b14 = defaultedMap5.isEmpty();
        boolean b15 = defaultedMap5.isEmpty();
        boolean b16 = defaultedMap5.isEmpty();
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate17, predicate18);
        java.util.Set set20 = defaultedMap5.keySet();
        try {
            boolean b21 = fixedOrderComparator0.addAsEqual((java.lang.Object) i3, (java.lang.Object) set20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj3 = null;
        boolean b4 = fixedOrderComparator2.add(obj3);
        boolean b5 = fixedOrderComparator2.isLocked();
        try {
            boolean b7 = fixedOrderComparator0.addAsEqual((java.lang.Object) b5, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        boolean b37 = defaultedMap3.containsValue((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = fixedOrderComparator41.isLocked();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap39.get((java.lang.Object) 1.0d);
        boolean b48 = defaultedMap39.isEmpty();
        java.util.Set set49 = defaultedMap39.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj55 = null;
        boolean b56 = fixedOrderComparator54.add(obj55);
        boolean b57 = fixedOrderComparator54.isLocked();
        java.lang.Object obj58 = defaultedMap52.put((java.lang.Object) (short) 1, (java.lang.Object) b57);
        java.lang.Object obj60 = defaultedMap52.get((java.lang.Object) 1.0d);
        boolean b61 = defaultedMap52.isEmpty();
        boolean b62 = defaultedMap52.isEmpty();
        boolean b63 = defaultedMap52.isEmpty();
        collections.Predicate predicate64 = null;
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate50, predicate65);
        java.lang.Object obj68 = defaultedMap3.get((java.lang.Object) predicate50);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{10=100}" + "'", str35.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte) 0 + "'", obj60.equals((byte) 0));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 0 + "'", obj68.equals((byte) 0));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate(map23, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        boolean b11 = fixedOrderComparator8.isLocked();
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) (short) 1, (java.lang.Object) b11);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1.0d);
        boolean b15 = defaultedMap6.isEmpty();
        boolean b16 = defaultedMap6.isEmpty();
        boolean b17 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b24 = fixedOrderComparator21.isLocked();
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) (short) 1, (java.lang.Object) b24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 1.0d);
        boolean b28 = defaultedMap19.isEmpty();
        boolean b29 = defaultedMap19.isEmpty();
        boolean b30 = defaultedMap19.isEmpty();
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate31, predicate32);
        defaultedMap6.putAll((java.util.Map) defaultedMap19);
        try {
            boolean b35 = fixedOrderComparator0.addAsEqual((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 0 + "'", obj27.equals((byte) 0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator5);
        boolean b8 = fixedOrderComparator5.isLocked();
        try {
            fixedOrderComparator5.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        java.util.Map map12 = null;
        try {
            defaultedMap1.putAll(map12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0f);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b27 = fixedOrderComparator24.isLocked();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) b27);
        boolean b29 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = null;
        boolean b35 = fixedOrderComparator33.add(obj34);
        boolean b36 = fixedOrderComparator33.isLocked();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) b36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) 1.0d);
        boolean b40 = defaultedMap31.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection42 = defaultedMap31.values();
        java.lang.Object obj43 = defaultedMap15.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap31);
        try {
            int i44 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap5, obj43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator5.add(obj6);
        boolean b8 = fixedOrderComparator5.isLocked();
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) b8);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) 1.0d);
        boolean b12 = defaultedMap3.isEmpty();
        boolean b13 = defaultedMap3.isEmpty();
        boolean b14 = defaultedMap3.isEmpty();
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        java.util.Set set30 = defaultedMap20.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate31, predicate46);
        java.lang.Object obj49 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) defaultedMap20);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap20);
        java.util.Collection collection51 = defaultedMap20.values();
        java.util.Collection collection52 = defaultedMap20.values();
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set27 = defaultedMap26.entrySet();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) defaultedMap26, (java.lang.Object) b38);
        int i40 = defaultedMap26.size();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) b6);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b7 = fixedOrderComparator4.isLocked();
        java.lang.Object obj8 = defaultedMap2.put((java.lang.Object) (short) 1, (java.lang.Object) b7);
        java.lang.Object obj10 = defaultedMap2.get((java.lang.Object) 1.0d);
        boolean b11 = defaultedMap2.isEmpty();
        boolean b12 = defaultedMap2.isEmpty();
        boolean b13 = defaultedMap2.isEmpty();
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b24 = fixedOrderComparator21.isLocked();
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) (short) 1, (java.lang.Object) b24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 1.0d);
        boolean b28 = defaultedMap19.isEmpty();
        java.util.Set set29 = defaultedMap19.keySet();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator34.isLocked();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) b37);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1.0d);
        boolean b41 = defaultedMap32.isEmpty();
        boolean b42 = defaultedMap32.isEmpty();
        boolean b43 = defaultedMap32.isEmpty();
        collections.Predicate predicate44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate30, predicate45);
        java.lang.Object obj48 = defaultedMap2.put((java.lang.Object) '#', (java.lang.Object) defaultedMap19);
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 0 + "'", obj27.equals((byte) 0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        boolean b14 = defaultedMap4.isEmpty();
        boolean b15 = defaultedMap4.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        defaultedMap4.putAll((java.util.Map) defaultedMap17);
        boolean b34 = defaultedMap17.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj40 = null;
        boolean b41 = fixedOrderComparator39.add(obj40);
        boolean b42 = fixedOrderComparator39.isLocked();
        java.lang.Object obj43 = defaultedMap37.put((java.lang.Object) (short) 1, (java.lang.Object) b42);
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 1.0d);
        boolean b46 = defaultedMap37.isEmpty();
        boolean b47 = defaultedMap37.isEmpty();
        boolean b48 = defaultedMap37.isEmpty();
        collections.Predicate predicate49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate49, predicate50);
        boolean b52 = defaultedMap17.containsValue((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 0 + "'", obj45.equals((byte) 0));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj53 = null;
        boolean b54 = fixedOrderComparator52.add(obj53);
        boolean b55 = fixedOrderComparator52.isLocked();
        java.lang.Object obj56 = defaultedMap50.put((java.lang.Object) (short) 1, (java.lang.Object) b55);
        java.lang.Object obj58 = defaultedMap50.get((java.lang.Object) 1.0d);
        boolean b59 = defaultedMap50.isEmpty();
        java.util.Set set60 = defaultedMap50.keySet();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj66 = null;
        boolean b67 = fixedOrderComparator65.add(obj66);
        boolean b68 = fixedOrderComparator65.isLocked();
        java.lang.Object obj69 = defaultedMap63.put((java.lang.Object) (short) 1, (java.lang.Object) b68);
        java.lang.Object obj71 = defaultedMap63.get((java.lang.Object) 1.0d);
        boolean b72 = defaultedMap63.isEmpty();
        boolean b73 = defaultedMap63.isEmpty();
        boolean b74 = defaultedMap63.isEmpty();
        collections.Predicate predicate75 = null;
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate61, predicate76);
        java.lang.Object obj79 = defaultedMap33.put((java.lang.Object) '#', (java.lang.Object) defaultedMap50);
        java.lang.Object obj80 = defaultedMap31.remove((java.lang.Object) defaultedMap50);
        boolean b81 = defaultedMap14.containsKey((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (byte) 0 + "'", obj58.equals((byte) 0));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (byte) 0 + "'", obj71.equals((byte) 0));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        boolean b18 = defaultedMap11.isEmpty();
        try {
            boolean b19 = fixedOrderComparator8.addAsEqual(obj9, (java.lang.Object) defaultedMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        boolean b31 = defaultedMap14.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        boolean b40 = defaultedMap33.isEmpty();
        java.util.Collection collection41 = defaultedMap33.values();
        boolean b42 = defaultedMap14.containsKey((java.lang.Object) collection41);
        defaultedMap14.clear();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection21 = defaultedMap10.values();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj32 = defaultedMap10.put((java.lang.Object) obj_array28, (java.lang.Object) i31);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{{10=100}={1=false}}" + "'", str30.equals("{{10=100}={1=false}}"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        java.util.Set set30 = defaultedMap1.keySet();
        int i31 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0f);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        boolean b11 = fixedOrderComparator8.isLocked();
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) (short) 1, (java.lang.Object) b11);
        boolean b13 = defaultedMap6.isEmpty();
        java.util.Collection collection14 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) collection14);
        try {
            int i16 = fixedOrderComparator0.compare((java.lang.Object) 10.0d, (java.lang.Object) collection14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        boolean b25 = defaultedMap15.isEmpty();
        boolean b26 = defaultedMap15.isEmpty();
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator34.isLocked();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) b37);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1.0d);
        boolean b41 = defaultedMap32.isEmpty();
        java.util.Set set42 = defaultedMap32.keySet();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b54 = defaultedMap45.isEmpty();
        boolean b55 = defaultedMap45.isEmpty();
        boolean b56 = defaultedMap45.isEmpty();
        collections.Predicate predicate57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate43, predicate58);
        java.lang.Object obj61 = defaultedMap15.put((java.lang.Object) '#', (java.lang.Object) defaultedMap32);
        java.lang.Object obj62 = defaultedMap13.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj64 = defaultedMap1.put((java.lang.Object) defaultedMap32, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        try {
            fixedOrderComparator12.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.equals(obj3);
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str21 = defaultedMap17.toString();
        try {
            boolean b22 = fixedOrderComparator0.addAsEqual((java.lang.Object) b15, (java.lang.Object) str21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{10=100}" + "'", str21.equals("{10=100}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection58 = defaultedMap47.values();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        java.lang.Object obj69 = defaultedMap47.put((java.lang.Object) obj_array65, (java.lang.Object) i68);
        java.lang.Object obj71 = defaultedMap1.put((java.lang.Object) obj_array65, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator();
        int i78 = fixedOrderComparator77.getUnknownObjectBehavior();
        java.lang.Object obj79 = defaultedMap73.remove((java.lang.Object) fixedOrderComparator77);
        boolean b80 = fixedOrderComparator77.isLocked();
        boolean b81 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator77);
        boolean b83 = fixedOrderComparator77.add((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(i78 == 2);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj12 = null;
        boolean b13 = fixedOrderComparator11.add(obj12);
        boolean b14 = fixedOrderComparator11.isLocked();
        java.lang.Object obj15 = defaultedMap9.put((java.lang.Object) (short) 1, (java.lang.Object) b14);
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) 1.0d);
        boolean b18 = defaultedMap9.isEmpty();
        java.util.Set set19 = defaultedMap9.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b27 = fixedOrderComparator24.isLocked();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) b27);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) 1.0d);
        boolean b31 = defaultedMap22.isEmpty();
        boolean b32 = defaultedMap22.isEmpty();
        boolean b33 = defaultedMap22.isEmpty();
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate20, predicate35);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate35, predicate38);
        boolean b41 = defaultedMap6.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj46 = null;
        boolean b47 = fixedOrderComparator45.add(obj46);
        boolean b48 = fixedOrderComparator45.isLocked();
        java.lang.Object obj49 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) b48);
        java.lang.Object obj51 = defaultedMap43.get((java.lang.Object) 1.0d);
        boolean b52 = defaultedMap43.isEmpty();
        boolean b53 = defaultedMap43.isEmpty();
        boolean b54 = defaultedMap43.isEmpty();
        collections.Predicate predicate55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj62 = null;
        boolean b63 = fixedOrderComparator61.add(obj62);
        boolean b64 = fixedOrderComparator61.isLocked();
        java.lang.Object obj65 = defaultedMap59.put((java.lang.Object) (short) 1, (java.lang.Object) b64);
        java.lang.Object obj67 = defaultedMap59.get((java.lang.Object) 1.0d);
        boolean b68 = defaultedMap59.isEmpty();
        boolean b69 = defaultedMap59.isEmpty();
        boolean b70 = defaultedMap59.isEmpty();
        collections.Predicate predicate71 = null;
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate71, predicate72);
        collections.Predicate predicate74 = null;
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map73, predicate74, predicate75);
        java.util.Map map77 = collections.map.DefaultedMap.decorate(map57, (java.lang.Object) map73);
        java.lang.Object obj78 = defaultedMap6.get((java.lang.Object) map57);
        boolean b79 = fixedOrderComparator4.add((java.lang.Object) defaultedMap6);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b79);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 0 + "'", obj17.equals((byte) 0));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 0 + "'", obj30.equals((byte) 0));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 0 + "'", obj51.equals((byte) 0));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (byte) 0 + "'", obj67.equals((byte) 0));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (byte) 0 + "'", obj78.equals((byte) 0));
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        java.util.Set set16 = defaultedMap1.keySet();
        boolean b17 = defaultedMap1.isEmpty();
        java.util.Set set18 = defaultedMap1.entrySet();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator5);
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj33 = null;
        boolean b34 = fixedOrderComparator32.add(obj33);
        boolean b35 = fixedOrderComparator32.isLocked();
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) (short) 1, (java.lang.Object) b35);
        java.lang.Object obj38 = defaultedMap30.get((java.lang.Object) 1.0d);
        boolean b39 = defaultedMap30.isEmpty();
        java.util.Set set40 = defaultedMap30.keySet();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj46 = null;
        boolean b47 = fixedOrderComparator45.add(obj46);
        boolean b48 = fixedOrderComparator45.isLocked();
        java.lang.Object obj49 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) b48);
        java.lang.Object obj51 = defaultedMap43.get((java.lang.Object) 1.0d);
        boolean b52 = defaultedMap43.isEmpty();
        boolean b53 = defaultedMap43.isEmpty();
        boolean b54 = defaultedMap43.isEmpty();
        collections.Predicate predicate55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate55, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate41, predicate56);
        java.lang.Object obj59 = defaultedMap13.put((java.lang.Object) '#', (java.lang.Object) defaultedMap30);
        java.lang.Object obj60 = defaultedMap11.remove((java.lang.Object) defaultedMap30);
        boolean b61 = defaultedMap1.equals((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 0 + "'", obj51.equals((byte) 0));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b27 = fixedOrderComparator24.isLocked();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) b27);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) 1.0d);
        boolean b31 = defaultedMap22.isEmpty();
        boolean b32 = defaultedMap22.isEmpty();
        boolean b33 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj38 = null;
        boolean b39 = fixedOrderComparator37.add(obj38);
        boolean b40 = fixedOrderComparator37.isLocked();
        java.lang.Object obj41 = defaultedMap35.put((java.lang.Object) (short) 1, (java.lang.Object) b40);
        java.lang.Object obj43 = defaultedMap35.get((java.lang.Object) 1.0d);
        boolean b44 = defaultedMap35.isEmpty();
        boolean b45 = defaultedMap35.isEmpty();
        boolean b46 = defaultedMap35.isEmpty();
        collections.Predicate predicate47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate47, predicate48);
        defaultedMap22.putAll((java.util.Map) defaultedMap35);
        boolean b52 = defaultedMap35.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj57 = null;
        boolean b58 = fixedOrderComparator56.add(obj57);
        boolean b59 = fixedOrderComparator56.isLocked();
        java.lang.Object obj60 = defaultedMap54.put((java.lang.Object) (short) 1, (java.lang.Object) b59);
        boolean b61 = defaultedMap54.isEmpty();
        java.util.Collection collection62 = defaultedMap54.values();
        boolean b63 = defaultedMap35.containsKey((java.lang.Object) collection62);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator();
        boolean b66 = fixedOrderComparator64.add((java.lang.Object) 1.0f);
        int i67 = fixedOrderComparator64.getUnknownObjectBehavior();
        java.lang.Object obj68 = defaultedMap35.get((java.lang.Object) fixedOrderComparator64);
        boolean b69 = defaultedMap10.equals((java.lang.Object) fixedOrderComparator64);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 0 + "'", obj30.equals((byte) 0));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(i67 == 2);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 0 + "'", obj68.equals((byte) 0));
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b27 = fixedOrderComparator24.isLocked();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) b27);
        boolean b29 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = null;
        boolean b35 = fixedOrderComparator33.add(obj34);
        boolean b36 = fixedOrderComparator33.isLocked();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) b36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) 1.0d);
        boolean b40 = defaultedMap31.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection42 = defaultedMap31.values();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        int i52 = fixedOrderComparator51.getUnknownObjectBehavior();
        java.lang.Object obj53 = defaultedMap31.put((java.lang.Object) obj_array49, (java.lang.Object) i52);
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        boolean b56 = defaultedMap31.containsKey((java.lang.Object) "");
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection21 = defaultedMap10.values();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj32 = defaultedMap10.put((java.lang.Object) obj_array28, (java.lang.Object) i31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i34 = fixedOrderComparator33.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i34 == 2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b27 = fixedOrderComparator24.isLocked();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) b27);
        boolean b29 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = null;
        boolean b35 = fixedOrderComparator33.add(obj34);
        boolean b36 = fixedOrderComparator33.isLocked();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) b36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) 1.0d);
        boolean b40 = defaultedMap31.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection42 = defaultedMap31.values();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        int i52 = fixedOrderComparator51.getUnknownObjectBehavior();
        java.lang.Object obj53 = defaultedMap31.put((java.lang.Object) obj_array49, (java.lang.Object) i52);
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj56 = null;
        boolean b57 = fixedOrderComparator55.add(obj56);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        boolean b66 = fixedOrderComparator55.add((java.lang.Object) obj_array64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b66);
        java.util.Collection collection68 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) b12);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        boolean b18 = defaultedMap11.isEmpty();
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b24 = fixedOrderComparator21.isLocked();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection28 = defaultedMap27.values();
        java.util.Set set29 = defaultedMap27.entrySet();
        boolean b30 = fixedOrderComparator21.addAsEqual(obj25, (java.lang.Object) set29);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap11.put(obj25, obj31);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection58 = defaultedMap47.values();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        java.lang.Object obj69 = defaultedMap47.put((java.lang.Object) obj_array65, (java.lang.Object) i68);
        java.lang.Object obj71 = defaultedMap1.put((java.lang.Object) obj_array65, (java.lang.Object) 10.0f);
        java.util.Set set72 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        boolean b18 = defaultedMap11.isEmpty();
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0d);
        boolean b27 = defaultedMap18.isEmpty();
        java.util.Set set28 = defaultedMap18.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = null;
        boolean b35 = fixedOrderComparator33.add(obj34);
        boolean b36 = fixedOrderComparator33.isLocked();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) b36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) 1.0d);
        boolean b40 = defaultedMap31.isEmpty();
        boolean b41 = defaultedMap31.isEmpty();
        boolean b42 = defaultedMap31.isEmpty();
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate29, predicate44);
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj52 = null;
        boolean b53 = fixedOrderComparator51.add(obj52);
        boolean b54 = fixedOrderComparator51.isLocked();
        java.lang.Object obj55 = defaultedMap49.put((java.lang.Object) (short) 1, (java.lang.Object) b54);
        java.lang.Object obj57 = defaultedMap49.get((java.lang.Object) 1.0d);
        java.util.Collection collection58 = defaultedMap49.values();
        boolean b59 = defaultedMap1.containsKey((java.lang.Object) collection58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator();
        int i61 = fixedOrderComparator60.getUnknownObjectBehavior();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator60);
        collections.Factory factory63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate(map62, factory63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (byte) 0 + "'", obj57.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i61 == 2);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        java.util.Set set30 = defaultedMap3.keySet();
        boolean b31 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{10=100}" + "'", str5.equals("{10=100}"));
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection21 = defaultedMap10.values();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj32 = defaultedMap10.put((java.lang.Object) obj_array28, (java.lang.Object) i31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection36 = defaultedMap35.values();
        java.util.Set set37 = defaultedMap35.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj39 = null;
        boolean b40 = fixedOrderComparator38.add(obj39);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b49 = fixedOrderComparator38.add((java.lang.Object) obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator50);
        boolean b52 = fixedOrderComparator50.isLocked();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) b52);
        try {
            boolean b54 = fixedOrderComparator33.addAsEqual((java.lang.Object) defaultedMap35, (java.lang.Object) b52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj53 = null;
        boolean b54 = fixedOrderComparator52.add(obj53);
        boolean b55 = fixedOrderComparator52.isLocked();
        java.lang.Object obj56 = defaultedMap50.put((java.lang.Object) (short) 1, (java.lang.Object) b55);
        java.lang.Object obj58 = defaultedMap50.get((java.lang.Object) 1.0d);
        boolean b59 = defaultedMap50.isEmpty();
        java.util.Set set60 = defaultedMap50.keySet();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj66 = null;
        boolean b67 = fixedOrderComparator65.add(obj66);
        boolean b68 = fixedOrderComparator65.isLocked();
        java.lang.Object obj69 = defaultedMap63.put((java.lang.Object) (short) 1, (java.lang.Object) b68);
        java.lang.Object obj71 = defaultedMap63.get((java.lang.Object) 1.0d);
        boolean b72 = defaultedMap63.isEmpty();
        boolean b73 = defaultedMap63.isEmpty();
        boolean b74 = defaultedMap63.isEmpty();
        collections.Predicate predicate75 = null;
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate61, predicate76);
        java.lang.Object obj79 = defaultedMap33.put((java.lang.Object) '#', (java.lang.Object) defaultedMap50);
        java.lang.Object obj80 = defaultedMap31.remove((java.lang.Object) defaultedMap50);
        java.util.Collection collection81 = defaultedMap50.values();
        java.lang.Object obj82 = null;
        java.lang.Object obj83 = defaultedMap50.get(obj82);
        boolean b84 = defaultedMap1.containsValue(obj82);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (byte) 0 + "'", obj58.equals((byte) 0));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (byte) 0 + "'", obj71.equals((byte) 0));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (byte) 0 + "'", obj83.equals((byte) 0));
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        java.util.Set set30 = defaultedMap3.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        boolean b37 = defaultedMap3.containsValue((java.lang.Object) defaultedMap31);
        int i38 = defaultedMap31.size();
        java.util.Collection collection39 = defaultedMap31.values();
        int i40 = defaultedMap31.size();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{10=100}" + "'", str35.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(i40 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        boolean b14 = defaultedMap5.isEmpty();
        java.util.Set set15 = defaultedMap5.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0d);
        boolean b27 = defaultedMap18.isEmpty();
        boolean b28 = defaultedMap18.isEmpty();
        boolean b29 = defaultedMap18.isEmpty();
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate31, predicate34);
        boolean b37 = defaultedMap2.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = fixedOrderComparator41.isLocked();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap39.get((java.lang.Object) 1.0d);
        boolean b48 = defaultedMap39.isEmpty();
        boolean b49 = defaultedMap39.isEmpty();
        boolean b50 = defaultedMap39.isEmpty();
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj58 = null;
        boolean b59 = fixedOrderComparator57.add(obj58);
        boolean b60 = fixedOrderComparator57.isLocked();
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) (short) 1, (java.lang.Object) b60);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) 1.0d);
        boolean b64 = defaultedMap55.isEmpty();
        boolean b65 = defaultedMap55.isEmpty();
        boolean b66 = defaultedMap55.isEmpty();
        collections.Predicate predicate67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate67, predicate68);
        collections.Predicate predicate70 = null;
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map69, predicate70, predicate71);
        java.util.Map map73 = collections.map.DefaultedMap.decorate(map53, (java.lang.Object) map69);
        java.lang.Object obj74 = defaultedMap2.get((java.lang.Object) map53);
        boolean b75 = fixedOrderComparator0.add((java.lang.Object) defaultedMap2);
        java.lang.Object obj77 = defaultedMap2.remove((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (byte) 0 + "'", obj63.equals((byte) 0));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 0 + "'", obj74.equals((byte) 0));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj32 = null;
        boolean b33 = fixedOrderComparator31.add(obj32);
        boolean b34 = fixedOrderComparator31.isLocked();
        java.lang.Object obj35 = defaultedMap29.put((java.lang.Object) (short) 1, (java.lang.Object) b34);
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) 1.0d);
        boolean b38 = defaultedMap29.isEmpty();
        boolean b39 = defaultedMap29.isEmpty();
        boolean b40 = defaultedMap29.isEmpty();
        collections.Predicate predicate41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate41, predicate42);
        collections.Predicate predicate44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map43, predicate44, predicate45);
        java.util.Map map47 = collections.map.DefaultedMap.decorate(map27, (java.lang.Object) map43);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) map47);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 0 + "'", obj37.equals((byte) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i19 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator17.isLocked();
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        try {
            boolean b24 = fixedOrderComparator7.addAsEqual((java.lang.Object) fixedOrderComparator17, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection58 = defaultedMap47.values();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        java.lang.Object obj69 = defaultedMap47.put((java.lang.Object) obj_array65, (java.lang.Object) i68);
        java.lang.Object obj71 = defaultedMap1.put((java.lang.Object) obj_array65, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator();
        int i78 = fixedOrderComparator77.getUnknownObjectBehavior();
        java.lang.Object obj79 = defaultedMap73.remove((java.lang.Object) fixedOrderComparator77);
        boolean b80 = fixedOrderComparator77.isLocked();
        boolean b81 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator77);
        try {
            fixedOrderComparator77.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(i78 == 2);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b5 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set8 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        java.util.Set set20 = defaultedMap10.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj26 = null;
        boolean b27 = fixedOrderComparator25.add(obj26);
        boolean b28 = fixedOrderComparator25.isLocked();
        java.lang.Object obj29 = defaultedMap23.put((java.lang.Object) (short) 1, (java.lang.Object) b28);
        java.lang.Object obj31 = defaultedMap23.get((java.lang.Object) 1.0d);
        boolean b32 = defaultedMap23.isEmpty();
        boolean b33 = defaultedMap23.isEmpty();
        boolean b34 = defaultedMap23.isEmpty();
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate21, predicate36);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate36, predicate39);
        boolean b42 = defaultedMap7.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj47 = null;
        boolean b48 = fixedOrderComparator46.add(obj47);
        boolean b49 = fixedOrderComparator46.isLocked();
        java.lang.Object obj50 = defaultedMap44.put((java.lang.Object) (short) 1, (java.lang.Object) b49);
        java.lang.Object obj52 = defaultedMap44.get((java.lang.Object) 1.0d);
        boolean b53 = defaultedMap44.isEmpty();
        boolean b54 = defaultedMap44.isEmpty();
        boolean b55 = defaultedMap44.isEmpty();
        collections.Predicate predicate56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate56, predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj63 = null;
        boolean b64 = fixedOrderComparator62.add(obj63);
        boolean b65 = fixedOrderComparator62.isLocked();
        java.lang.Object obj66 = defaultedMap60.put((java.lang.Object) (short) 1, (java.lang.Object) b65);
        java.lang.Object obj68 = defaultedMap60.get((java.lang.Object) 1.0d);
        boolean b69 = defaultedMap60.isEmpty();
        boolean b70 = defaultedMap60.isEmpty();
        boolean b71 = defaultedMap60.isEmpty();
        collections.Predicate predicate72 = null;
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate72, predicate73);
        collections.Predicate predicate75 = null;
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate(map74, predicate75, predicate76);
        java.util.Map map78 = collections.map.DefaultedMap.decorate(map58, (java.lang.Object) map74);
        java.lang.Object obj79 = defaultedMap7.get((java.lang.Object) map58);
        boolean b80 = fixedOrderComparator0.add(obj79);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 0 + "'", obj52.equals((byte) 0));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 0 + "'", obj68.equals((byte) 0));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) 0 + "'", obj79.equals((byte) 0));
        org.junit.Assert.assertTrue(b80 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        boolean b3 = fixedOrderComparator0.isLocked();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Set set8 = defaultedMap6.entrySet();
        boolean b9 = fixedOrderComparator0.addAsEqual(obj4, (java.lang.Object) set8);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "{{10=100}={1=false}}");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1.0d) + "'", obj6.equals((-1.0d)));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        java.util.Set set16 = defaultedMap1.keySet();
        boolean b17 = defaultedMap1.isEmpty();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection21 = defaultedMap10.values();
        java.util.Set set22 = defaultedMap10.entrySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        java.lang.Object obj16 = defaultedMap8.get((java.lang.Object) 1.0d);
        boolean b17 = defaultedMap8.isEmpty();
        boolean b18 = defaultedMap8.isEmpty();
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        boolean b31 = defaultedMap21.isEmpty();
        boolean b32 = defaultedMap21.isEmpty();
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate34);
        defaultedMap8.putAll((java.util.Map) defaultedMap21);
        boolean b37 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection40 = defaultedMap39.values();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str44 = defaultedMap43.toString();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) str44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        boolean b57 = defaultedMap47.isEmpty();
        boolean b58 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj63 = null;
        boolean b64 = fixedOrderComparator62.add(obj63);
        boolean b65 = fixedOrderComparator62.isLocked();
        java.lang.Object obj66 = defaultedMap60.put((java.lang.Object) (short) 1, (java.lang.Object) b65);
        java.lang.Object obj68 = defaultedMap60.get((java.lang.Object) 1.0d);
        boolean b69 = defaultedMap60.isEmpty();
        boolean b70 = defaultedMap60.isEmpty();
        boolean b71 = defaultedMap60.isEmpty();
        collections.Predicate predicate72 = null;
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate72, predicate73);
        defaultedMap47.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap39, (java.lang.Object) defaultedMap60);
        java.util.Set set77 = defaultedMap39.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{10=100}" + "'", str5.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 0 + "'", obj68.equals((byte) 0));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0d);
        boolean b27 = defaultedMap18.isEmpty();
        java.util.Set set28 = defaultedMap18.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = null;
        boolean b35 = fixedOrderComparator33.add(obj34);
        boolean b36 = fixedOrderComparator33.isLocked();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) b36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) 1.0d);
        boolean b40 = defaultedMap31.isEmpty();
        boolean b41 = defaultedMap31.isEmpty();
        boolean b42 = defaultedMap31.isEmpty();
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate29, predicate44);
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj52 = null;
        boolean b53 = fixedOrderComparator51.add(obj52);
        boolean b54 = fixedOrderComparator51.isLocked();
        java.lang.Object obj55 = defaultedMap49.put((java.lang.Object) (short) 1, (java.lang.Object) b54);
        java.lang.Object obj57 = defaultedMap49.get((java.lang.Object) 1.0d);
        java.util.Collection collection58 = defaultedMap49.values();
        boolean b59 = defaultedMap1.containsKey((java.lang.Object) collection58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj71 = null;
        boolean b72 = fixedOrderComparator70.add(obj71);
        boolean b73 = fixedOrderComparator70.isLocked();
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) (short) 1, (java.lang.Object) b73);
        boolean b75 = defaultedMap68.isEmpty();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj80 = null;
        boolean b81 = fixedOrderComparator79.add(obj80);
        boolean b82 = fixedOrderComparator79.isLocked();
        java.lang.Object obj83 = defaultedMap77.put((java.lang.Object) (short) 1, (java.lang.Object) b82);
        java.lang.Object obj85 = defaultedMap77.get((java.lang.Object) 1.0d);
        boolean b86 = defaultedMap77.isEmpty();
        defaultedMap68.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection88 = defaultedMap77.values();
        java.lang.Object obj89 = defaultedMap61.put((java.lang.Object) defaultedMap63, (java.lang.Object) defaultedMap77);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj91 = null;
        boolean b92 = fixedOrderComparator90.add(obj91);
        boolean b93 = fixedOrderComparator90.isLocked();
        boolean b94 = defaultedMap63.equals((java.lang.Object) fixedOrderComparator90);
        defaultedMap1.putAll((java.util.Map) defaultedMap63);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (byte) 0 + "'", obj57.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (byte) 0 + "'", obj85.equals((byte) 0));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Set set11 = defaultedMap1.keySet();
        java.util.Collection collection12 = defaultedMap1.values();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator12.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator5.add(obj6);
        boolean b8 = fixedOrderComparator5.isLocked();
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) b8);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) 1.0d);
        boolean b12 = defaultedMap3.isEmpty();
        boolean b13 = defaultedMap3.isEmpty();
        boolean b14 = defaultedMap3.isEmpty();
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        java.util.Set set30 = defaultedMap20.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate31, predicate46);
        java.lang.Object obj49 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) defaultedMap20);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap20);
        java.util.Collection collection51 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj56 = null;
        boolean b57 = fixedOrderComparator55.add(obj56);
        boolean b58 = fixedOrderComparator55.isLocked();
        java.lang.Object obj59 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) b58);
        java.lang.Object obj61 = defaultedMap53.get((java.lang.Object) 1.0d);
        boolean b62 = defaultedMap53.isEmpty();
        boolean b63 = defaultedMap53.isEmpty();
        boolean b64 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj69 = null;
        boolean b70 = fixedOrderComparator68.add(obj69);
        boolean b71 = fixedOrderComparator68.isLocked();
        java.lang.Object obj72 = defaultedMap66.put((java.lang.Object) (short) 1, (java.lang.Object) b71);
        java.lang.Object obj74 = defaultedMap66.get((java.lang.Object) 1.0d);
        boolean b75 = defaultedMap66.isEmpty();
        boolean b76 = defaultedMap66.isEmpty();
        boolean b77 = defaultedMap66.isEmpty();
        collections.Predicate predicate78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate78, predicate79);
        defaultedMap53.putAll((java.util.Map) defaultedMap66);
        boolean b83 = defaultedMap66.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj88 = null;
        boolean b89 = fixedOrderComparator87.add(obj88);
        boolean b90 = fixedOrderComparator87.isLocked();
        java.lang.Object obj91 = defaultedMap85.put((java.lang.Object) (short) 1, (java.lang.Object) b90);
        boolean b92 = defaultedMap85.isEmpty();
        java.util.Collection collection93 = defaultedMap85.values();
        boolean b94 = defaultedMap66.containsKey((java.lang.Object) collection93);
        java.lang.Object obj95 = defaultedMap1.get((java.lang.Object) b94);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (byte) 0 + "'", obj61.equals((byte) 0));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 0 + "'", obj74.equals((byte) 0));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + (-1.0d) + "'", obj95.equals((-1.0d)));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.lang.String str14 = defaultedMap13.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = null;
        boolean b35 = fixedOrderComparator33.add(obj34);
        boolean b36 = fixedOrderComparator33.isLocked();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) b36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) 1.0d);
        boolean b40 = defaultedMap31.isEmpty();
        boolean b41 = defaultedMap31.isEmpty();
        boolean b42 = defaultedMap31.isEmpty();
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj51 = null;
        boolean b52 = fixedOrderComparator50.add(obj51);
        boolean b53 = fixedOrderComparator50.isLocked();
        java.lang.Object obj54 = defaultedMap48.put((java.lang.Object) (short) 1, (java.lang.Object) b53);
        java.lang.Object obj56 = defaultedMap48.get((java.lang.Object) 1.0d);
        boolean b57 = defaultedMap48.isEmpty();
        java.util.Set set58 = defaultedMap48.keySet();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj64 = null;
        boolean b65 = fixedOrderComparator63.add(obj64);
        boolean b66 = fixedOrderComparator63.isLocked();
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) (short) 1, (java.lang.Object) b66);
        java.lang.Object obj69 = defaultedMap61.get((java.lang.Object) 1.0d);
        boolean b70 = defaultedMap61.isEmpty();
        boolean b71 = defaultedMap61.isEmpty();
        boolean b72 = defaultedMap61.isEmpty();
        collections.Predicate predicate73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate59, predicate74);
        java.lang.Object obj77 = defaultedMap31.put((java.lang.Object) '#', (java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj82 = null;
        boolean b83 = fixedOrderComparator81.add(obj82);
        boolean b84 = fixedOrderComparator81.isLocked();
        java.lang.Object obj85 = defaultedMap79.put((java.lang.Object) (short) 1, (java.lang.Object) b84);
        java.lang.Object obj87 = defaultedMap79.get((java.lang.Object) 1.0d);
        boolean b88 = defaultedMap79.isEmpty();
        boolean b89 = defaultedMap79.isEmpty();
        boolean b90 = defaultedMap79.isEmpty();
        collections.Predicate predicate91 = null;
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate91, predicate92);
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate91, predicate94);
        java.lang.Object obj96 = defaultedMap1.get((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 0 + "'", obj56.equals((byte) 0));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (byte) 0 + "'", obj69.equals((byte) 0));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + (byte) 0 + "'", obj87.equals((byte) 0));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + "" + "'", obj96.equals(""));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        boolean b3 = fixedOrderComparator0.isLocked();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Set set8 = defaultedMap6.entrySet();
        boolean b9 = fixedOrderComparator0.addAsEqual(obj4, (java.lang.Object) set8);
        boolean b10 = fixedOrderComparator0.isLocked();
        int i11 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        boolean b25 = defaultedMap15.isEmpty();
        boolean b26 = defaultedMap15.isEmpty();
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator34.isLocked();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) b37);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1.0d);
        boolean b41 = defaultedMap32.isEmpty();
        java.util.Set set42 = defaultedMap32.keySet();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b54 = defaultedMap45.isEmpty();
        boolean b55 = defaultedMap45.isEmpty();
        boolean b56 = defaultedMap45.isEmpty();
        collections.Predicate predicate57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate43, predicate58);
        java.lang.Object obj61 = defaultedMap15.put((java.lang.Object) '#', (java.lang.Object) defaultedMap32);
        java.lang.Object obj62 = defaultedMap13.remove((java.lang.Object) defaultedMap32);
        java.util.Collection collection63 = defaultedMap32.values();
        boolean b64 = defaultedMap1.equals((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) b64);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        java.util.Collection collection38 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        int i46 = fixedOrderComparator45.getUnknownObjectBehavior();
        int i47 = fixedOrderComparator45.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) fixedOrderComparator45);
        boolean b52 = fixedOrderComparator45.isLocked();
        try {
            fixedOrderComparator45.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 0 + "'", obj51.equals((byte) 0));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.equals(obj3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b27 = fixedOrderComparator24.isLocked();
        java.lang.Object obj28 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) b27);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) 1.0d);
        boolean b31 = defaultedMap22.isEmpty();
        boolean b32 = defaultedMap22.isEmpty();
        boolean b33 = defaultedMap22.isEmpty();
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate34, predicate35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection40 = defaultedMap39.values();
        boolean b41 = defaultedMap39.isEmpty();
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 0 + "'", obj30.equals((byte) 0));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 1.0d);
        boolean b21 = defaultedMap12.isEmpty();
        boolean b22 = defaultedMap12.isEmpty();
        boolean b23 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj40 = null;
        boolean b41 = fixedOrderComparator39.add(obj40);
        boolean b42 = fixedOrderComparator39.isLocked();
        java.lang.Object obj43 = defaultedMap37.put((java.lang.Object) (short) 1, (java.lang.Object) b42);
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 1.0d);
        boolean b46 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set49 = defaultedMap48.entrySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj54 = null;
        boolean b55 = fixedOrderComparator53.add(obj54);
        boolean b56 = fixedOrderComparator53.isLocked();
        java.lang.Object obj57 = defaultedMap51.put((java.lang.Object) (short) 1, (java.lang.Object) b56);
        java.lang.Object obj59 = defaultedMap51.get((java.lang.Object) 1.0d);
        boolean b60 = defaultedMap51.isEmpty();
        java.util.Set set61 = defaultedMap51.keySet();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj67 = null;
        boolean b68 = fixedOrderComparator66.add(obj67);
        boolean b69 = fixedOrderComparator66.isLocked();
        java.lang.Object obj70 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) b69);
        java.lang.Object obj72 = defaultedMap64.get((java.lang.Object) 1.0d);
        boolean b73 = defaultedMap64.isEmpty();
        boolean b74 = defaultedMap64.isEmpty();
        boolean b75 = defaultedMap64.isEmpty();
        collections.Predicate predicate76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate76, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate62, predicate77);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate77, predicate80);
        java.lang.Object obj82 = defaultedMap37.get((java.lang.Object) predicate77);
        java.util.Collection collection83 = defaultedMap37.values();
        boolean b84 = defaultedMap1.containsKey((java.lang.Object) collection83);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 0 + "'", obj45.equals((byte) 0));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (byte) 0 + "'", obj59.equals((byte) 0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 0 + "'", obj72.equals((byte) 0));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (byte) 0 + "'", obj82.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator7.add(obj9);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b13 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator5);
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        java.util.Set set24 = defaultedMap14.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj30 = null;
        boolean b31 = fixedOrderComparator29.add(obj30);
        boolean b32 = fixedOrderComparator29.isLocked();
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) (short) 1, (java.lang.Object) b32);
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) 1.0d);
        boolean b36 = defaultedMap27.isEmpty();
        boolean b37 = defaultedMap27.isEmpty();
        boolean b38 = defaultedMap27.isEmpty();
        collections.Predicate predicate39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate25, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate40, predicate43);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) predicate43);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 0 + "'", obj45.equals((byte) 0));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        java.util.Set set11 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        boolean b25 = defaultedMap15.isEmpty();
        boolean b26 = defaultedMap15.isEmpty();
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator34.isLocked();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) b37);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1.0d);
        boolean b41 = defaultedMap32.isEmpty();
        java.util.Set set42 = defaultedMap32.keySet();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b54 = defaultedMap45.isEmpty();
        boolean b55 = defaultedMap45.isEmpty();
        boolean b56 = defaultedMap45.isEmpty();
        collections.Predicate predicate57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate43, predicate58);
        java.lang.Object obj61 = defaultedMap15.put((java.lang.Object) '#', (java.lang.Object) defaultedMap32);
        java.lang.Object obj62 = defaultedMap13.remove((java.lang.Object) defaultedMap32);
        java.util.Collection collection63 = defaultedMap32.values();
        boolean b64 = defaultedMap10.equals((java.lang.Object) collection63);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) set7);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator7.add(obj9);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b3 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.util.Collection collection37 = defaultedMap1.values();
        java.util.Collection collection38 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator30.add(obj31);
        boolean b33 = fixedOrderComparator30.isLocked();
        boolean b34 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator30);
        int i35 = fixedOrderComparator30.getUnknownObjectBehavior();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        java.util.Collection collection26 = defaultedMap17.values();
        defaultedMap17.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        int i12 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        boolean b3 = fixedOrderComparator0.isLocked();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Set set8 = defaultedMap6.entrySet();
        boolean b9 = fixedOrderComparator0.addAsEqual(obj4, (java.lang.Object) set8);
        boolean b10 = fixedOrderComparator0.isLocked();
        boolean b11 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 1.0d);
        boolean b21 = defaultedMap12.isEmpty();
        boolean b22 = defaultedMap12.isEmpty();
        boolean b23 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        int i36 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap5.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) str6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        java.util.Set set16 = defaultedMap1.keySet();
        boolean b17 = defaultedMap1.isEmpty();
        boolean b18 = defaultedMap1.isEmpty();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        boolean b34 = defaultedMap25.isEmpty();
        java.util.Set set35 = defaultedMap25.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) 1.0d);
        boolean b47 = defaultedMap38.isEmpty();
        boolean b48 = defaultedMap38.isEmpty();
        boolean b49 = defaultedMap38.isEmpty();
        collections.Predicate predicate50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate36, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate51, predicate54);
        boolean b56 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj63 = defaultedMap60.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj68 = null;
        boolean b69 = fixedOrderComparator67.add(obj68);
        boolean b70 = fixedOrderComparator67.isLocked();
        java.lang.Object obj71 = defaultedMap65.put((java.lang.Object) (short) 1, (java.lang.Object) b70);
        boolean b72 = defaultedMap65.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj77 = null;
        boolean b78 = fixedOrderComparator76.add(obj77);
        boolean b79 = fixedOrderComparator76.isLocked();
        java.lang.Object obj80 = defaultedMap74.put((java.lang.Object) (short) 1, (java.lang.Object) b79);
        java.lang.Object obj82 = defaultedMap74.get((java.lang.Object) 1.0d);
        boolean b83 = defaultedMap74.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap74);
        java.util.Collection collection85 = defaultedMap74.values();
        java.lang.Object obj86 = defaultedMap58.put((java.lang.Object) defaultedMap60, (java.lang.Object) defaultedMap74);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj88 = null;
        boolean b89 = fixedOrderComparator87.add(obj88);
        boolean b90 = fixedOrderComparator87.isLocked();
        boolean b91 = defaultedMap60.equals((java.lang.Object) fixedOrderComparator87);
        java.lang.Object obj92 = defaultedMap22.get((java.lang.Object) defaultedMap60);
        collections.Transformer transformer93 = null;
        try {
            java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, transformer93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (byte) 0 + "'", obj82.equals((byte) 0));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (byte) 0 + "'", obj92.equals((byte) 0));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        boolean b37 = defaultedMap3.containsValue((java.lang.Object) defaultedMap31);
        int i38 = defaultedMap31.size();
        java.util.Collection collection39 = defaultedMap31.values();
        java.util.Collection collection40 = defaultedMap31.values();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{10=100}" + "'", str35.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        boolean b9 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj33 = null;
        boolean b34 = fixedOrderComparator32.add(obj33);
        boolean b35 = fixedOrderComparator32.isLocked();
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) (short) 1, (java.lang.Object) b35);
        boolean b37 = defaultedMap30.isEmpty();
        java.util.Collection collection38 = defaultedMap30.values();
        boolean b39 = defaultedMap20.containsValue((java.lang.Object) defaultedMap30);
        java.util.Collection collection40 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj45 = null;
        boolean b46 = fixedOrderComparator44.add(obj45);
        boolean b47 = fixedOrderComparator44.isLocked();
        java.lang.Object obj48 = defaultedMap42.put((java.lang.Object) (short) 1, (java.lang.Object) b47);
        java.lang.Object obj50 = defaultedMap42.get((java.lang.Object) 1.0d);
        boolean b51 = defaultedMap42.isEmpty();
        boolean b52 = defaultedMap42.isEmpty();
        boolean b53 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj58 = null;
        boolean b59 = fixedOrderComparator57.add(obj58);
        boolean b60 = fixedOrderComparator57.isLocked();
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) (short) 1, (java.lang.Object) b60);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) 1.0d);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj69 = null;
        boolean b70 = fixedOrderComparator68.add(obj69);
        boolean b71 = fixedOrderComparator68.isLocked();
        java.lang.Object obj72 = defaultedMap66.put((java.lang.Object) (short) 1, (java.lang.Object) b71);
        java.lang.Object obj74 = defaultedMap66.get((java.lang.Object) 1.0d);
        boolean b75 = defaultedMap66.isEmpty();
        boolean b76 = defaultedMap66.isEmpty();
        boolean b77 = defaultedMap66.isEmpty();
        collections.Predicate predicate78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate78, predicate79);
        collections.Predicate predicate81 = null;
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate(map80, predicate81, predicate82);
        java.lang.Object obj84 = defaultedMap42.get((java.lang.Object) map83);
        try {
            boolean b85 = fixedOrderComparator17.addAsEqual((java.lang.Object) collection40, obj84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 0 + "'", obj50.equals((byte) 0));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (byte) 0 + "'", obj63.equals((byte) 0));
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 0 + "'", obj74.equals((byte) 0));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) 0 + "'", obj84.equals((byte) 0));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        boolean b9 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        java.util.Set set30 = defaultedMap20.keySet();
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap20.containsKey(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        boolean b52 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj57 = null;
        boolean b58 = fixedOrderComparator56.add(obj57);
        boolean b59 = fixedOrderComparator56.isLocked();
        java.lang.Object obj60 = defaultedMap54.put((java.lang.Object) (short) 1, (java.lang.Object) b59);
        java.lang.Object obj62 = defaultedMap54.get((java.lang.Object) 1.0d);
        boolean b63 = defaultedMap54.isEmpty();
        defaultedMap45.putAll((java.util.Map) defaultedMap54);
        java.util.Collection collection65 = defaultedMap54.values();
        java.lang.Object obj66 = defaultedMap38.put((java.lang.Object) defaultedMap40, (java.lang.Object) defaultedMap54);
        java.util.Set set67 = defaultedMap38.keySet();
        java.lang.Object obj68 = defaultedMap34.get((java.lang.Object) defaultedMap38);
        try {
            int i69 = fixedOrderComparator17.compare(obj31, (java.lang.Object) defaultedMap34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (byte) 0 + "'", obj62.equals((byte) 0));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "" + "'", obj68.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        boolean b16 = fixedOrderComparator12.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate29);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate(map31, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{1=false}" + "'", str11.equals("{1=false}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        boolean b37 = defaultedMap3.containsValue((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        java.util.Set set39 = defaultedMap31.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{10=100}" + "'", str35.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b13 = fixedOrderComparator12.isLocked();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.util.Set set37 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj49 = null;
        boolean b50 = fixedOrderComparator48.add(obj49);
        boolean b51 = fixedOrderComparator48.isLocked();
        java.lang.Object obj52 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) b51);
        java.lang.Object obj54 = defaultedMap46.get((java.lang.Object) 1.0d);
        boolean b55 = defaultedMap46.isEmpty();
        boolean b56 = defaultedMap46.isEmpty();
        boolean b57 = defaultedMap46.isEmpty();
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate58, predicate59);
        defaultedMap33.putAll((java.util.Map) defaultedMap46);
        boolean b63 = defaultedMap46.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj68 = null;
        boolean b69 = fixedOrderComparator67.add(obj68);
        boolean b70 = fixedOrderComparator67.isLocked();
        java.lang.Object obj71 = defaultedMap65.put((java.lang.Object) (short) 1, (java.lang.Object) b70);
        boolean b72 = defaultedMap65.isEmpty();
        java.util.Collection collection73 = defaultedMap65.values();
        boolean b74 = defaultedMap46.containsKey((java.lang.Object) collection73);
        boolean b75 = defaultedMap1.containsKey((java.lang.Object) collection73);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{1=false}" + "'", str11.equals("{1=false}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 0 + "'", obj54.equals((byte) 0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b14 = fixedOrderComparator13.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj14 = defaultedMap2.remove((java.lang.Object) fixedOrderComparator13);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator14.add((java.lang.Object) obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator26);
        boolean b28 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) b28);
        java.lang.Object obj30 = defaultedMap13.remove((java.lang.Object) b28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator34.isLocked();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) b37);
        defaultedMap13.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b54 = defaultedMap45.isEmpty();
        boolean b55 = defaultedMap45.isEmpty();
        boolean b56 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj61 = null;
        boolean b62 = fixedOrderComparator60.add(obj61);
        boolean b63 = fixedOrderComparator60.isLocked();
        java.lang.Object obj64 = defaultedMap58.put((java.lang.Object) (short) 1, (java.lang.Object) b63);
        java.lang.Object obj66 = defaultedMap58.get((java.lang.Object) 1.0d);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 1.0d);
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set71 = defaultedMap70.entrySet();
        java.lang.Object[] obj_array78 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array78);
        int i80 = fixedOrderComparator79.getUnknownObjectBehavior();
        int i81 = fixedOrderComparator79.getUnknownObjectBehavior();
        boolean b82 = fixedOrderComparator79.isLocked();
        java.lang.Object obj83 = defaultedMap45.put((java.lang.Object) defaultedMap70, (java.lang.Object) b82);
        boolean b84 = defaultedMap41.containsKey((java.lang.Object) defaultedMap45);
        java.lang.Object obj85 = defaultedMap13.get((java.lang.Object) b84);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (byte) 0 + "'", obj66.equals((byte) 0));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(obj_array78);
        org.junit.Assert.assertTrue(i80 == 2);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj12);
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator14.add((java.lang.Object) obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator27);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str18 = defaultedMap17.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) str18);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        boolean b14 = defaultedMap5.isEmpty();
        java.util.Set set15 = defaultedMap5.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0d);
        boolean b27 = defaultedMap18.isEmpty();
        boolean b28 = defaultedMap18.isEmpty();
        boolean b29 = defaultedMap18.isEmpty();
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate31, predicate34);
        boolean b37 = defaultedMap2.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = fixedOrderComparator41.isLocked();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap39.get((java.lang.Object) 1.0d);
        boolean b48 = defaultedMap39.isEmpty();
        boolean b49 = defaultedMap39.isEmpty();
        boolean b50 = defaultedMap39.isEmpty();
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj58 = null;
        boolean b59 = fixedOrderComparator57.add(obj58);
        boolean b60 = fixedOrderComparator57.isLocked();
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) (short) 1, (java.lang.Object) b60);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) 1.0d);
        boolean b64 = defaultedMap55.isEmpty();
        boolean b65 = defaultedMap55.isEmpty();
        boolean b66 = defaultedMap55.isEmpty();
        collections.Predicate predicate67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate67, predicate68);
        collections.Predicate predicate70 = null;
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map69, predicate70, predicate71);
        java.util.Map map73 = collections.map.DefaultedMap.decorate(map53, (java.lang.Object) map69);
        java.lang.Object obj74 = defaultedMap2.get((java.lang.Object) map53);
        boolean b75 = fixedOrderComparator0.add((java.lang.Object) defaultedMap2);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj80 = null;
        boolean b81 = fixedOrderComparator79.add(obj80);
        boolean b82 = fixedOrderComparator79.isLocked();
        java.lang.Object obj83 = defaultedMap77.put((java.lang.Object) (short) 1, (java.lang.Object) b82);
        boolean b84 = defaultedMap77.isEmpty();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj89 = null;
        boolean b90 = fixedOrderComparator88.add(obj89);
        boolean b91 = fixedOrderComparator88.isLocked();
        java.lang.Object obj92 = defaultedMap86.put((java.lang.Object) (short) 1, (java.lang.Object) b91);
        java.lang.Object obj94 = defaultedMap86.get((java.lang.Object) 1.0d);
        boolean b95 = defaultedMap86.isEmpty();
        defaultedMap77.putAll((java.util.Map) defaultedMap86);
        java.util.Collection collection97 = defaultedMap86.values();
        boolean b98 = fixedOrderComparator0.add((java.lang.Object) collection97);
        boolean b99 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (byte) 0 + "'", obj63.equals((byte) 0));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 0 + "'", obj74.equals((byte) 0));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + (byte) 0 + "'", obj94.equals((byte) 0));
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertNotNull(collection97);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        int i46 = fixedOrderComparator45.getUnknownObjectBehavior();
        int i47 = fixedOrderComparator45.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) fixedOrderComparator45);
        try {
            fixedOrderComparator45.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 0 + "'", obj51.equals((byte) 0));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        java.util.Set set25 = defaultedMap15.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator30.add(obj31);
        boolean b33 = fixedOrderComparator30.isLocked();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) (short) 1, (java.lang.Object) b33);
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) 1.0d);
        boolean b37 = defaultedMap28.isEmpty();
        boolean b38 = defaultedMap28.isEmpty();
        boolean b39 = defaultedMap28.isEmpty();
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate26, predicate41);
        boolean b44 = fixedOrderComparator13.add((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection58 = defaultedMap47.values();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        java.lang.Object obj69 = defaultedMap47.put((java.lang.Object) obj_array65, (java.lang.Object) i68);
        java.lang.Object obj71 = defaultedMap1.put((java.lang.Object) obj_array65, (java.lang.Object) 10.0f);
        java.util.Set set72 = defaultedMap1.keySet();
        java.util.Set set73 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(set73);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b10 = fixedOrderComparator7.isLocked();
        boolean b11 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set32 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        boolean b39 = fixedOrderComparator36.isLocked();
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) (short) 1, (java.lang.Object) b39);
        java.lang.Object obj42 = defaultedMap34.get((java.lang.Object) 1.0d);
        boolean b43 = defaultedMap34.isEmpty();
        java.util.Set set44 = defaultedMap34.keySet();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        boolean b57 = defaultedMap47.isEmpty();
        boolean b58 = defaultedMap47.isEmpty();
        collections.Predicate predicate59 = null;
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate45, predicate60);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate60, predicate63);
        java.lang.Object obj65 = defaultedMap17.get((java.lang.Object) predicate60);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 0 + "'", obj65.equals((byte) 0));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b10 = fixedOrderComparator7.isLocked();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b13 = fixedOrderComparator7.isLocked();
        boolean b14 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection13 = defaultedMap12.values();
        boolean b14 = defaultedMap12.isEmpty();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 0 + "'", obj15.equals((byte) 0));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 0 + "'", obj10.equals((byte) 0));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        java.util.Set set28 = defaultedMap13.keySet();
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) set28);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{1=false}" + "'", str11.equals("{1=false}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection13 = defaultedMap12.values();
        boolean b14 = defaultedMap12.isEmpty();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        int i16 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        boolean b25 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj30 = null;
        boolean b31 = fixedOrderComparator29.add(obj30);
        boolean b32 = fixedOrderComparator29.isLocked();
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) (short) 1, (java.lang.Object) b32);
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) 1.0d);
        boolean b36 = defaultedMap27.isEmpty();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection38 = defaultedMap27.values();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        java.lang.Object obj49 = defaultedMap27.put((java.lang.Object) obj_array45, (java.lang.Object) i48);
        defaultedMap12.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 0 + "'", obj15.equals((byte) 0));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection13 = defaultedMap12.values();
        boolean b14 = defaultedMap12.isEmpty();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        int i16 = defaultedMap12.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator17.add((java.lang.Object) obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (short) 1);
        boolean b33 = defaultedMap12.containsValue((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 0 + "'", obj15.equals((byte) 0));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection21 = defaultedMap10.values();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj32 = defaultedMap10.put((java.lang.Object) obj_array28, (java.lang.Object) i31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj36 = new java.lang.Object();
        boolean b37 = fixedOrderComparator35.add(obj36);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        boolean b31 = defaultedMap14.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj38 = null;
        boolean b39 = fixedOrderComparator37.add(obj38);
        boolean b40 = fixedOrderComparator37.isLocked();
        java.lang.Object obj41 = defaultedMap35.put((java.lang.Object) (short) 1, (java.lang.Object) b40);
        java.lang.Object obj43 = defaultedMap35.get((java.lang.Object) 1.0d);
        java.util.Collection collection44 = defaultedMap35.values();
        java.lang.Object obj45 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) defaultedMap35);
        java.util.Set set46 = defaultedMap35.entrySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set27 = defaultedMap26.entrySet();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) defaultedMap26, (java.lang.Object) b38);
        java.util.Set set40 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate(map15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map15);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        boolean b19 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection32 = defaultedMap21.values();
        java.lang.Object obj33 = defaultedMap5.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap21);
        java.util.Set set34 = defaultedMap5.keySet();
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Collection collection36 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        java.util.Collection collection26 = defaultedMap17.values();
        defaultedMap17.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Set set29 = defaultedMap17.entrySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set27 = defaultedMap26.entrySet();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) defaultedMap26, (java.lang.Object) b38);
        defaultedMap26.clear();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        java.util.Set set16 = defaultedMap1.keySet();
        boolean b17 = defaultedMap1.isEmpty();
        boolean b18 = defaultedMap1.isEmpty();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        boolean b34 = defaultedMap25.isEmpty();
        java.util.Set set35 = defaultedMap25.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) 1.0d);
        boolean b47 = defaultedMap38.isEmpty();
        boolean b48 = defaultedMap38.isEmpty();
        boolean b49 = defaultedMap38.isEmpty();
        collections.Predicate predicate50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate36, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate51, predicate54);
        boolean b56 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        java.util.Collection collection57 = defaultedMap22.values();
        collections.Factory factory58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, factory58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        int i46 = fixedOrderComparator45.getUnknownObjectBehavior();
        int i47 = fixedOrderComparator45.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) fixedOrderComparator45);
        java.util.Set set52 = defaultedMap1.keySet();
        java.util.Collection collection53 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 0 + "'", obj51.equals((byte) 0));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator5);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) ' ');
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 1.0d);
        java.util.Collection collection21 = defaultedMap12.values();
        java.util.Set set22 = defaultedMap12.keySet();
        java.util.Collection collection23 = defaultedMap12.values();
        boolean b24 = defaultedMap12.isEmpty();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array9);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 1.0d);
        boolean b20 = defaultedMap11.isEmpty();
        boolean b21 = defaultedMap11.isEmpty();
        boolean b22 = defaultedMap11.isEmpty();
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate23, predicate24);
        java.util.Set set26 = defaultedMap11.keySet();
        boolean b27 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj49 = null;
        boolean b50 = fixedOrderComparator48.add(obj49);
        boolean b51 = fixedOrderComparator48.isLocked();
        java.lang.Object obj52 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) b51);
        java.lang.Object obj54 = defaultedMap46.get((java.lang.Object) 1.0d);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 1.0d);
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set59 = defaultedMap58.entrySet();
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        int i69 = fixedOrderComparator67.getUnknownObjectBehavior();
        boolean b70 = fixedOrderComparator67.isLocked();
        java.lang.Object obj71 = defaultedMap33.put((java.lang.Object) defaultedMap58, (java.lang.Object) b70);
        boolean b72 = defaultedMap29.containsKey((java.lang.Object) defaultedMap33);
        java.lang.Object obj73 = defaultedMap1.put((java.lang.Object) b27, (java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 0 + "'", obj54.equals((byte) 0));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertTrue(i69 == 2);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection58 = defaultedMap47.values();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        java.lang.Object obj69 = defaultedMap47.put((java.lang.Object) obj_array65, (java.lang.Object) i68);
        java.lang.Object obj71 = defaultedMap1.put((java.lang.Object) obj_array65, (java.lang.Object) 10.0f);
        java.util.Set set72 = defaultedMap1.keySet();
        java.util.Set set73 = defaultedMap1.entrySet();
        int i74 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(i74 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection21 = defaultedMap10.values();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj32 = defaultedMap10.put((java.lang.Object) obj_array28, (java.lang.Object) i31);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.lang.Object obj43 = defaultedMap10.remove((java.lang.Object) fixedOrderComparator42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b54 = defaultedMap45.isEmpty();
        boolean b55 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj60 = null;
        boolean b61 = fixedOrderComparator59.add(obj60);
        boolean b62 = fixedOrderComparator59.isLocked();
        java.lang.Object obj63 = defaultedMap57.put((java.lang.Object) (short) 1, (java.lang.Object) b62);
        java.lang.Object obj65 = defaultedMap57.get((java.lang.Object) 1.0d);
        boolean b66 = defaultedMap57.isEmpty();
        boolean b67 = defaultedMap57.isEmpty();
        boolean b68 = defaultedMap57.isEmpty();
        collections.Predicate predicate69 = null;
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate69, predicate70);
        collections.Predicate predicate72 = null;
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate(map71, predicate72, predicate73);
        defaultedMap45.putAll(map74);
        boolean b76 = fixedOrderComparator42.add((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 0 + "'", obj65.equals((byte) 0));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b76 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b6 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 1.0d);
        boolean b20 = defaultedMap11.isEmpty();
        java.util.Set set21 = defaultedMap11.keySet();
        java.lang.Object obj22 = defaultedMap8.get((java.lang.Object) defaultedMap11);
        java.util.Set set23 = defaultedMap8.entrySet();
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) defaultedMap8);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        boolean b34 = defaultedMap25.isEmpty();
        boolean b35 = defaultedMap25.isEmpty();
        boolean b36 = defaultedMap25.isEmpty();
        collections.Predicate predicate37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate37, predicate38);
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate(map39, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) map42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b54 = defaultedMap45.isEmpty();
        boolean b55 = defaultedMap45.isEmpty();
        boolean b56 = defaultedMap45.isEmpty();
        collections.Predicate predicate57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj64 = null;
        boolean b65 = fixedOrderComparator63.add(obj64);
        boolean b66 = fixedOrderComparator63.isLocked();
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) (short) 1, (java.lang.Object) b66);
        java.lang.Object obj69 = defaultedMap61.get((java.lang.Object) 1.0d);
        java.util.Collection collection70 = defaultedMap61.values();
        defaultedMap61.clear();
        defaultedMap45.putAll((java.util.Map) defaultedMap61);
        java.util.Set set73 = defaultedMap45.entrySet();
        boolean b74 = defaultedMap1.equals((java.lang.Object) defaultedMap45);
        java.util.Set set75 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (byte) 0 + "'", obj69.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate27);
        java.util.Set set30 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator34.isLocked();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) b37);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1.0d);
        boolean b41 = defaultedMap32.isEmpty();
        java.lang.String str42 = defaultedMap32.toString();
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap32);
        boolean b44 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{1=false}" + "'", str42.equals("{1=false}"));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        boolean b19 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection32 = defaultedMap21.values();
        java.lang.Object obj33 = defaultedMap5.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap21);
        java.util.Set set34 = defaultedMap5.keySet();
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj40 = null;
        boolean b41 = fixedOrderComparator39.add(obj40);
        boolean b42 = fixedOrderComparator39.isLocked();
        java.lang.Object obj43 = defaultedMap37.put((java.lang.Object) (short) 1, (java.lang.Object) b42);
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        boolean b54 = defaultedMap47.isEmpty();
        java.util.Collection collection55 = defaultedMap47.values();
        boolean b56 = defaultedMap37.containsValue((java.lang.Object) defaultedMap47);
        collections.Predicate predicate57 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj62 = null;
        boolean b63 = fixedOrderComparator61.add(obj62);
        boolean b64 = fixedOrderComparator61.isLocked();
        java.lang.Object obj65 = defaultedMap59.put((java.lang.Object) (short) 1, (java.lang.Object) b64);
        java.lang.Object obj67 = defaultedMap59.get((java.lang.Object) 1.0d);
        boolean b68 = defaultedMap59.isEmpty();
        boolean b69 = defaultedMap59.isEmpty();
        boolean b70 = defaultedMap59.isEmpty();
        collections.Predicate predicate71 = null;
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate57, predicate72);
        defaultedMap1.putAll(map74);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 0 + "'", obj45.equals((byte) 0));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (byte) 0 + "'", obj67.equals((byte) 0));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = fixedOrderComparator41.isLocked();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) b44);
        boolean b46 = defaultedMap39.isEmpty();
        java.util.Collection collection47 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) collection47);
        boolean b49 = defaultedMap1.equals((java.lang.Object) defaultedMap48);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj51 = null;
        boolean b52 = fixedOrderComparator50.add(obj51);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        boolean b61 = fixedOrderComparator50.add((java.lang.Object) obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array59);
        boolean b64 = defaultedMap1.containsValue((java.lang.Object) obj_array59);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        defaultedMap1.putAll(map30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        defaultedMap1.clear();
        int i12 = defaultedMap1.size();
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        int i46 = fixedOrderComparator45.getUnknownObjectBehavior();
        int i47 = fixedOrderComparator45.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator45.isLocked();
        fixedOrderComparator45.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) fixedOrderComparator45);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj56 = null;
        boolean b57 = fixedOrderComparator55.add(obj56);
        boolean b58 = fixedOrderComparator55.isLocked();
        java.lang.Object obj59 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) b58);
        boolean b60 = defaultedMap53.isEmpty();
        java.util.Collection collection61 = defaultedMap53.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) collection61);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection66 = defaultedMap65.values();
        boolean b67 = defaultedMap65.isEmpty();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str70 = defaultedMap69.toString();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) str70);
        defaultedMap62.putAll((java.util.Map) defaultedMap65);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj77 = null;
        boolean b78 = fixedOrderComparator76.add(obj77);
        boolean b79 = fixedOrderComparator76.isLocked();
        java.lang.Object obj80 = defaultedMap74.put((java.lang.Object) (short) 1, (java.lang.Object) b79);
        boolean b81 = defaultedMap74.isEmpty();
        java.lang.Object obj83 = defaultedMap74.remove((java.lang.Object) (short) 0);
        boolean b84 = defaultedMap65.containsKey(obj83);
        java.lang.Object obj85 = null;
        java.lang.Object obj86 = defaultedMap65.remove(obj85);
        java.lang.Object obj87 = defaultedMap1.get(obj86);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 0 + "'", obj51.equals((byte) 0));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + (byte) 0 + "'", obj87.equals((byte) 0));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        int i38 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        java.util.Collection collection26 = defaultedMap17.values();
        defaultedMap17.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Set set29 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b43 = fixedOrderComparator42.isLocked();
        java.lang.Object obj44 = defaultedMap31.get((java.lang.Object) fixedOrderComparator42);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) fixedOrderComparator42);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 0 + "'", obj45.equals((byte) 0));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        java.lang.Object obj16 = defaultedMap8.get((java.lang.Object) 1.0d);
        boolean b17 = defaultedMap8.isEmpty();
        boolean b18 = defaultedMap8.isEmpty();
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        boolean b31 = defaultedMap21.isEmpty();
        boolean b32 = defaultedMap21.isEmpty();
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate34);
        defaultedMap8.putAll((java.util.Map) defaultedMap21);
        boolean b37 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{10=100}" + "'", str5.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        boolean b19 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection32 = defaultedMap21.values();
        java.lang.Object obj33 = defaultedMap5.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap21);
        java.util.Set set34 = defaultedMap5.keySet();
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj40 = null;
        boolean b41 = fixedOrderComparator39.add(obj40);
        boolean b42 = fixedOrderComparator39.isLocked();
        java.lang.Object obj43 = defaultedMap37.put((java.lang.Object) (short) 1, (java.lang.Object) b42);
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 1.0d);
        boolean b46 = defaultedMap37.isEmpty();
        boolean b47 = defaultedMap37.isEmpty();
        boolean b48 = defaultedMap37.isEmpty();
        collections.Predicate predicate49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate49, predicate50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj57 = null;
        boolean b58 = fixedOrderComparator56.add(obj57);
        boolean b59 = fixedOrderComparator56.isLocked();
        java.lang.Object obj60 = defaultedMap54.put((java.lang.Object) (short) 1, (java.lang.Object) b59);
        java.lang.Object obj62 = defaultedMap54.get((java.lang.Object) 1.0d);
        boolean b63 = defaultedMap54.isEmpty();
        java.util.Set set64 = defaultedMap54.keySet();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj70 = null;
        boolean b71 = fixedOrderComparator69.add(obj70);
        boolean b72 = fixedOrderComparator69.isLocked();
        java.lang.Object obj73 = defaultedMap67.put((java.lang.Object) (short) 1, (java.lang.Object) b72);
        java.lang.Object obj75 = defaultedMap67.get((java.lang.Object) 1.0d);
        boolean b76 = defaultedMap67.isEmpty();
        boolean b77 = defaultedMap67.isEmpty();
        boolean b78 = defaultedMap67.isEmpty();
        collections.Predicate predicate79 = null;
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate65, predicate80);
        java.lang.Object obj83 = defaultedMap37.put((java.lang.Object) '#', (java.lang.Object) defaultedMap54);
        boolean b84 = defaultedMap1.containsKey(obj83);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 0 + "'", obj45.equals((byte) 0));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (byte) 0 + "'", obj62.equals((byte) 0));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (byte) 0 + "'", obj75.equals((byte) 0));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b6 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 1.0d);
        boolean b20 = defaultedMap11.isEmpty();
        java.util.Set set21 = defaultedMap11.keySet();
        java.lang.Object obj22 = defaultedMap8.get((java.lang.Object) defaultedMap11);
        java.util.Set set23 = defaultedMap8.entrySet();
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) defaultedMap8);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        boolean b39 = fixedOrderComparator36.isLocked();
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) (short) 1, (java.lang.Object) b39);
        java.lang.Object obj42 = defaultedMap34.get((java.lang.Object) 1.0d);
        boolean b43 = defaultedMap34.isEmpty();
        boolean b44 = defaultedMap34.isEmpty();
        boolean b45 = defaultedMap34.isEmpty();
        collections.Predicate predicate46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj53 = null;
        boolean b54 = fixedOrderComparator52.add(obj53);
        boolean b55 = fixedOrderComparator52.isLocked();
        java.lang.Object obj56 = defaultedMap50.put((java.lang.Object) (short) 1, (java.lang.Object) b55);
        java.lang.Object obj58 = defaultedMap50.get((java.lang.Object) 1.0d);
        boolean b59 = defaultedMap50.isEmpty();
        boolean b60 = defaultedMap50.isEmpty();
        boolean b61 = defaultedMap50.isEmpty();
        collections.Predicate predicate62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate62, predicate63);
        collections.Predicate predicate65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate(map64, predicate65, predicate66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate(map48, (java.lang.Object) map64);
        boolean b69 = fixedOrderComparator32.add((java.lang.Object) map68);
        boolean b70 = defaultedMap8.equals((java.lang.Object) b69);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0d) + "'", obj22.equals((-1.0d)));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (byte) 0 + "'", obj58.equals((byte) 0));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator5.add(obj6);
        boolean b8 = fixedOrderComparator5.isLocked();
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) b8);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) 1.0d);
        boolean b12 = defaultedMap3.isEmpty();
        boolean b13 = defaultedMap3.isEmpty();
        boolean b14 = defaultedMap3.isEmpty();
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        java.util.Set set30 = defaultedMap20.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate31, predicate46);
        java.lang.Object obj49 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) defaultedMap20);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap20);
        java.util.Collection collection51 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str54 = defaultedMap53.toString();
        java.lang.Object obj55 = defaultedMap20.get((java.lang.Object) str54);
        boolean b56 = defaultedMap20.isEmpty();
        collections.Factory factory57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, factory57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        java.lang.Object obj16 = defaultedMap8.get((java.lang.Object) 1.0d);
        boolean b17 = defaultedMap8.isEmpty();
        boolean b18 = defaultedMap8.isEmpty();
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        boolean b31 = defaultedMap21.isEmpty();
        boolean b32 = defaultedMap21.isEmpty();
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate34);
        defaultedMap8.putAll((java.util.Map) defaultedMap21);
        boolean b37 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection40 = defaultedMap39.values();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str44 = defaultedMap43.toString();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) str44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj50 = null;
        boolean b51 = fixedOrderComparator49.add(obj50);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) b52);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap47.isEmpty();
        boolean b57 = defaultedMap47.isEmpty();
        boolean b58 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj63 = null;
        boolean b64 = fixedOrderComparator62.add(obj63);
        boolean b65 = fixedOrderComparator62.isLocked();
        java.lang.Object obj66 = defaultedMap60.put((java.lang.Object) (short) 1, (java.lang.Object) b65);
        java.lang.Object obj68 = defaultedMap60.get((java.lang.Object) 1.0d);
        boolean b69 = defaultedMap60.isEmpty();
        boolean b70 = defaultedMap60.isEmpty();
        boolean b71 = defaultedMap60.isEmpty();
        collections.Predicate predicate72 = null;
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate72, predicate73);
        defaultedMap47.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap39, (java.lang.Object) defaultedMap60);
        boolean b77 = defaultedMap1.isEmpty();
        int i78 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{10=100}" + "'", str5.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 0 + "'", obj16.equals((byte) 0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 0 + "'", obj68.equals((byte) 0));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(i78 == 2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        java.util.Set set25 = defaultedMap15.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator30.add(obj31);
        boolean b33 = fixedOrderComparator30.isLocked();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) (short) 1, (java.lang.Object) b33);
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) 1.0d);
        boolean b37 = defaultedMap28.isEmpty();
        boolean b38 = defaultedMap28.isEmpty();
        boolean b39 = defaultedMap28.isEmpty();
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate26, predicate41);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate41, predicate44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) predicate41);
        java.util.Collection collection47 = defaultedMap1.values();
        java.util.Set set48 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        java.util.Set set16 = defaultedMap1.keySet();
        boolean b17 = defaultedMap1.isEmpty();
        boolean b18 = defaultedMap1.isEmpty();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str26 = defaultedMap22.toString();
        java.util.Collection collection27 = defaultedMap22.values();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        boolean b29 = defaultedMap22.isEmpty();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{10=100}" + "'", str26.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        boolean b37 = defaultedMap3.containsValue((java.lang.Object) defaultedMap31);
        int i38 = defaultedMap31.size();
        java.util.Collection collection39 = defaultedMap31.values();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        int i49 = fixedOrderComparator47.getUnknownObjectBehavior();
        java.lang.Object obj50 = defaultedMap31.remove((java.lang.Object) fixedOrderComparator47);
        java.util.Set set51 = defaultedMap31.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{10=100}" + "'", str35.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertTrue(i49 == 2);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) set11);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        boolean b14 = defaultedMap4.isEmpty();
        boolean b15 = defaultedMap4.isEmpty();
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        java.util.Set set31 = defaultedMap21.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        boolean b39 = fixedOrderComparator36.isLocked();
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) (short) 1, (java.lang.Object) b39);
        java.lang.Object obj42 = defaultedMap34.get((java.lang.Object) 1.0d);
        boolean b43 = defaultedMap34.isEmpty();
        boolean b44 = defaultedMap34.isEmpty();
        boolean b45 = defaultedMap34.isEmpty();
        collections.Predicate predicate46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate32, predicate47);
        java.lang.Object obj50 = defaultedMap4.put((java.lang.Object) '#', (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj55 = null;
        boolean b56 = fixedOrderComparator54.add(obj55);
        boolean b57 = fixedOrderComparator54.isLocked();
        java.lang.Object obj58 = defaultedMap52.put((java.lang.Object) (short) 1, (java.lang.Object) b57);
        java.lang.Object obj60 = defaultedMap52.get((java.lang.Object) 1.0d);
        java.util.Collection collection61 = defaultedMap52.values();
        boolean b62 = defaultedMap4.containsKey((java.lang.Object) collection61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator();
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) fixedOrderComparator63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj70 = null;
        boolean b71 = fixedOrderComparator69.add(obj70);
        boolean b72 = fixedOrderComparator69.isLocked();
        java.lang.Object obj73 = defaultedMap67.put((java.lang.Object) (short) 1, (java.lang.Object) b72);
        java.lang.Object obj75 = defaultedMap67.get((java.lang.Object) 1.0d);
        boolean b76 = defaultedMap67.isEmpty();
        java.util.Set set77 = defaultedMap67.entrySet();
        try {
            boolean b78 = fixedOrderComparator0.addAsEqual((java.lang.Object) fixedOrderComparator63, (java.lang.Object) defaultedMap67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte) 0 + "'", obj60.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (byte) 0 + "'", obj75.equals((byte) 0));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set77);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        boolean b37 = defaultedMap3.containsValue((java.lang.Object) defaultedMap31);
        int i38 = defaultedMap31.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{10=100}" + "'", str35.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator5);
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        boolean b22 = defaultedMap15.isEmpty();
        java.util.Collection collection23 = defaultedMap15.values();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) defaultedMap15);
        java.util.Collection collection25 = defaultedMap5.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj27 = null;
        boolean b28 = fixedOrderComparator26.add(obj27);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) collection25, (java.lang.Object) b28);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 1.0d);
        boolean b21 = defaultedMap12.isEmpty();
        boolean b22 = defaultedMap12.isEmpty();
        boolean b23 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        java.util.Set set36 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate29);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        boolean b39 = fixedOrderComparator36.isLocked();
        java.lang.Object obj40 = defaultedMap34.put((java.lang.Object) (short) 1, (java.lang.Object) b39);
        java.lang.Object obj42 = defaultedMap34.get((java.lang.Object) 1.0d);
        boolean b43 = defaultedMap34.isEmpty();
        boolean b44 = defaultedMap34.isEmpty();
        boolean b45 = defaultedMap34.isEmpty();
        collections.Predicate predicate46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj54 = null;
        boolean b55 = fixedOrderComparator53.add(obj54);
        boolean b56 = fixedOrderComparator53.isLocked();
        java.lang.Object obj57 = defaultedMap51.put((java.lang.Object) (short) 1, (java.lang.Object) b56);
        java.lang.Object obj59 = defaultedMap51.get((java.lang.Object) 1.0d);
        boolean b60 = defaultedMap51.isEmpty();
        java.util.Set set61 = defaultedMap51.keySet();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj67 = null;
        boolean b68 = fixedOrderComparator66.add(obj67);
        boolean b69 = fixedOrderComparator66.isLocked();
        java.lang.Object obj70 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) b69);
        java.lang.Object obj72 = defaultedMap64.get((java.lang.Object) 1.0d);
        boolean b73 = defaultedMap64.isEmpty();
        boolean b74 = defaultedMap64.isEmpty();
        boolean b75 = defaultedMap64.isEmpty();
        collections.Predicate predicate76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate76, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate62, predicate77);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate49, predicate62);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate62);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{1=false}" + "'", str11.equals("{1=false}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (byte) 0 + "'", obj59.equals((byte) 0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 0 + "'", obj72.equals((byte) 0));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.lang.String str24 = defaultedMap1.toString();
        boolean b25 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{1=false}" + "'", str24.equals("{1=false}"));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        boolean b21 = defaultedMap14.isEmpty();
        boolean b22 = defaultedMap14.isEmpty();
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator7.add(obj9);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator7.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate14);
        java.util.Set set16 = defaultedMap1.keySet();
        boolean b17 = defaultedMap1.isEmpty();
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap1.containsValue(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap21.isEmpty();
        boolean b31 = defaultedMap21.isEmpty();
        boolean b32 = defaultedMap21.isEmpty();
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate34);
        java.util.Set set36 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        boolean b45 = defaultedMap38.isEmpty();
        java.util.Collection collection46 = defaultedMap38.values();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) collection46);
        java.util.Set set48 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection51 = defaultedMap50.values();
        boolean b52 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str55 = defaultedMap54.toString();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) str55);
        defaultedMap47.putAll((java.util.Map) defaultedMap50);
        java.lang.Object obj58 = defaultedMap21.remove((java.lang.Object) defaultedMap47);
        defaultedMap1.putAll((java.util.Map) defaultedMap47);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 0 + "'", obj29.equals((byte) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate27);
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{1=false}" + "'", str30.equals("{1=false}"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        boolean b34 = defaultedMap25.isEmpty();
        boolean b35 = defaultedMap25.isEmpty();
        boolean b36 = defaultedMap25.isEmpty();
        collections.Predicate predicate37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate37, predicate38);
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate(map39, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) map42);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate(map42, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0f);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = fixedOrderComparator41.isLocked();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) b44);
        boolean b46 = defaultedMap39.isEmpty();
        java.util.Collection collection47 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) collection47);
        boolean b49 = defaultedMap1.equals((java.lang.Object) defaultedMap48);
        int i50 = defaultedMap48.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection13 = defaultedMap12.values();
        boolean b14 = defaultedMap12.isEmpty();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set18 = defaultedMap17.entrySet();
        boolean b19 = defaultedMap1.equals((java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        boolean b34 = defaultedMap25.isEmpty();
        boolean b35 = defaultedMap25.isEmpty();
        boolean b36 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) 1.0d);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 1.0d);
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set51 = defaultedMap50.entrySet();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        int i60 = fixedOrderComparator59.getUnknownObjectBehavior();
        int i61 = fixedOrderComparator59.getUnknownObjectBehavior();
        boolean b62 = fixedOrderComparator59.isLocked();
        java.lang.Object obj63 = defaultedMap25.put((java.lang.Object) defaultedMap50, (java.lang.Object) b62);
        boolean b64 = defaultedMap21.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj65 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 0 + "'", obj15.equals((byte) 0));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(i60 == 2);
        org.junit.Assert.assertTrue(i61 == 2);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 0 + "'", obj65.equals((byte) 0));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        boolean b18 = defaultedMap11.isEmpty();
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj29 = null;
        boolean b30 = fixedOrderComparator28.add(obj29);
        boolean b31 = fixedOrderComparator28.isLocked();
        java.lang.Object obj32 = defaultedMap26.put((java.lang.Object) (short) 1, (java.lang.Object) b31);
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) 1.0d);
        boolean b35 = defaultedMap26.isEmpty();
        boolean b36 = defaultedMap26.isEmpty();
        boolean b37 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = fixedOrderComparator41.isLocked();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap39.get((java.lang.Object) 1.0d);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 1.0d);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set52 = defaultedMap51.entrySet();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        int i61 = fixedOrderComparator60.getUnknownObjectBehavior();
        int i62 = fixedOrderComparator60.getUnknownObjectBehavior();
        boolean b63 = fixedOrderComparator60.isLocked();
        java.lang.Object obj64 = defaultedMap26.put((java.lang.Object) defaultedMap51, (java.lang.Object) b63);
        boolean b65 = defaultedMap22.containsKey((java.lang.Object) defaultedMap26);
        boolean b66 = defaultedMap1.containsValue((java.lang.Object) b65);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 0 + "'", obj34.equals((byte) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(i61 == 2);
        org.junit.Assert.assertTrue(i62 == 2);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator18.add(obj19);
        boolean b21 = fixedOrderComparator18.isLocked();
        java.lang.Object obj22 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) b21);
        java.lang.Object obj24 = defaultedMap16.get((java.lang.Object) 1.0d);
        boolean b25 = defaultedMap16.isEmpty();
        java.util.Set set26 = defaultedMap16.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj32 = null;
        boolean b33 = fixedOrderComparator31.add(obj32);
        boolean b34 = fixedOrderComparator31.isLocked();
        java.lang.Object obj35 = defaultedMap29.put((java.lang.Object) (short) 1, (java.lang.Object) b34);
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) 1.0d);
        boolean b38 = defaultedMap29.isEmpty();
        boolean b39 = defaultedMap29.isEmpty();
        boolean b40 = defaultedMap29.isEmpty();
        collections.Predicate predicate41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate27, predicate42);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate42, predicate45);
        boolean b48 = defaultedMap13.containsValue((java.lang.Object) 10);
        java.util.Collection collection49 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection52 = defaultedMap51.values();
        boolean b53 = defaultedMap51.isEmpty();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array60);
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        java.lang.Object obj65 = defaultedMap51.get((java.lang.Object) i64);
        defaultedMap13.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj71 = null;
        boolean b72 = fixedOrderComparator70.add(obj71);
        boolean b73 = fixedOrderComparator70.isLocked();
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) (short) 1, (java.lang.Object) b73);
        java.lang.Object obj76 = defaultedMap68.get((java.lang.Object) 1.0d);
        boolean b77 = defaultedMap68.isEmpty();
        java.util.Set set78 = defaultedMap68.keySet();
        try {
            int i79 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap51, (java.lang.Object) set78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 0 + "'", obj37.equals((byte) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 0 + "'", obj65.equals((byte) 0));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (byte) 0 + "'", obj76.equals((byte) 0));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(set78);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0f);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        java.util.Set set25 = defaultedMap15.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator30.add(obj31);
        boolean b33 = fixedOrderComparator30.isLocked();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) (short) 1, (java.lang.Object) b33);
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) 1.0d);
        boolean b37 = defaultedMap28.isEmpty();
        boolean b38 = defaultedMap28.isEmpty();
        boolean b39 = defaultedMap28.isEmpty();
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate26, predicate41);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate41, predicate44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) predicate41);
        java.util.Collection collection47 = defaultedMap1.values();
        int i48 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(i48 == 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator5.add(obj6);
        boolean b8 = fixedOrderComparator5.isLocked();
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) b8);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) 1.0d);
        boolean b12 = defaultedMap3.isEmpty();
        boolean b13 = defaultedMap3.isEmpty();
        boolean b14 = defaultedMap3.isEmpty();
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        java.util.Set set30 = defaultedMap20.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate31, predicate46);
        java.lang.Object obj49 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) defaultedMap20);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set53 = defaultedMap52.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj58 = null;
        boolean b59 = fixedOrderComparator57.add(obj58);
        boolean b60 = fixedOrderComparator57.isLocked();
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) (short) 1, (java.lang.Object) b60);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) 1.0d);
        boolean b64 = defaultedMap55.isEmpty();
        java.util.Set set65 = defaultedMap55.keySet();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj71 = null;
        boolean b72 = fixedOrderComparator70.add(obj71);
        boolean b73 = fixedOrderComparator70.isLocked();
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) (short) 1, (java.lang.Object) b73);
        java.lang.Object obj76 = defaultedMap68.get((java.lang.Object) 1.0d);
        boolean b77 = defaultedMap68.isEmpty();
        boolean b78 = defaultedMap68.isEmpty();
        boolean b79 = defaultedMap68.isEmpty();
        collections.Predicate predicate80 = null;
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate80, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate66, predicate81);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate81, predicate84);
        java.lang.Object obj86 = defaultedMap20.get((java.lang.Object) map85);
        java.lang.String str87 = defaultedMap20.toString();
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (byte) 0 + "'", obj63.equals((byte) 0));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (byte) 0 + "'", obj76.equals((byte) 0));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (byte) 0 + "'", obj86.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "{1=false}" + "'", str87.equals("{1=false}"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b10 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        defaultedMap1.clear();
        int i12 = defaultedMap1.size();
        java.lang.String str13 = defaultedMap1.toString();
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        int i16 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0d);
        java.util.Collection collection27 = defaultedMap18.values();
        java.util.Set set28 = defaultedMap18.keySet();
        java.util.Collection collection29 = defaultedMap18.values();
        boolean b30 = defaultedMap4.containsKey((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1.0d) + "'", obj15.equals((-1.0d)));
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        java.lang.String str23 = defaultedMap13.toString();
        java.util.Set set24 = defaultedMap13.entrySet();
        boolean b25 = defaultedMap10.containsKey((java.lang.Object) set24);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{1=false}" + "'", str23.equals("{1=false}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap1.containsKey(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        boolean b25 = defaultedMap15.isEmpty();
        boolean b26 = defaultedMap15.isEmpty();
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 0 + "'", obj30.equals((byte) 0));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator10.isLocked();
        java.lang.Object obj14 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) b13);
        boolean b15 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        defaultedMap8.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection28 = defaultedMap17.values();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        boolean b37 = defaultedMap3.containsValue((java.lang.Object) defaultedMap31);
        collections.Transformer transformer38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{10=100}" + "'", str35.equals("{10=100}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        boolean b31 = defaultedMap14.containsKey((java.lang.Object) (short) 1);
        boolean b32 = defaultedMap14.isEmpty();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b10 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.util.Set set12 = defaultedMap10.entrySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        boolean b14 = defaultedMap5.isEmpty();
        java.util.Set set15 = defaultedMap5.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0d);
        boolean b27 = defaultedMap18.isEmpty();
        boolean b28 = defaultedMap18.isEmpty();
        boolean b29 = defaultedMap18.isEmpty();
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate31, predicate34);
        boolean b37 = defaultedMap2.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = fixedOrderComparator41.isLocked();
        java.lang.Object obj45 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap39.get((java.lang.Object) 1.0d);
        boolean b48 = defaultedMap39.isEmpty();
        boolean b49 = defaultedMap39.isEmpty();
        boolean b50 = defaultedMap39.isEmpty();
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj58 = null;
        boolean b59 = fixedOrderComparator57.add(obj58);
        boolean b60 = fixedOrderComparator57.isLocked();
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) (short) 1, (java.lang.Object) b60);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) 1.0d);
        boolean b64 = defaultedMap55.isEmpty();
        boolean b65 = defaultedMap55.isEmpty();
        boolean b66 = defaultedMap55.isEmpty();
        collections.Predicate predicate67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate67, predicate68);
        collections.Predicate predicate70 = null;
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map69, predicate70, predicate71);
        java.util.Map map73 = collections.map.DefaultedMap.decorate(map53, (java.lang.Object) map69);
        java.lang.Object obj74 = defaultedMap2.get((java.lang.Object) map53);
        boolean b75 = fixedOrderComparator0.add((java.lang.Object) defaultedMap2);
        java.util.Collection collection76 = defaultedMap2.values();
        java.util.Set set77 = defaultedMap2.keySet();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (byte) 0 + "'", obj63.equals((byte) 0));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 0 + "'", obj74.equals((byte) 0));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(set77);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        boolean b14 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        int i16 = defaultedMap15.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) obj_array23);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        boolean b12 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        defaultedMap1.clear();
        int i25 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b27 = fixedOrderComparator16.add((java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator28);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate(map29, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1.0d) + "'", obj15.equals((-1.0d)));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        boolean b43 = fixedOrderComparator40.isLocked();
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) b43);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) 1.0d);
        boolean b47 = defaultedMap38.isEmpty();
        boolean b48 = defaultedMap38.isEmpty();
        boolean b49 = defaultedMap38.isEmpty();
        collections.Predicate predicate50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj57 = null;
        boolean b58 = fixedOrderComparator56.add(obj57);
        boolean b59 = fixedOrderComparator56.isLocked();
        java.lang.Object obj60 = defaultedMap54.put((java.lang.Object) (short) 1, (java.lang.Object) b59);
        java.lang.Object obj62 = defaultedMap54.get((java.lang.Object) 1.0d);
        boolean b63 = defaultedMap54.isEmpty();
        boolean b64 = defaultedMap54.isEmpty();
        boolean b65 = defaultedMap54.isEmpty();
        collections.Predicate predicate66 = null;
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate66, predicate67);
        collections.Predicate predicate69 = null;
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map68, predicate69, predicate70);
        java.util.Map map72 = collections.map.DefaultedMap.decorate(map52, (java.lang.Object) map68);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) map52);
        boolean b75 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.util.Collection collection76 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (byte) 0 + "'", obj62.equals((byte) 0));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (byte) 0 + "'", obj73.equals((byte) 0));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str3 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        boolean b14 = defaultedMap5.isEmpty();
        java.util.Set set15 = defaultedMap5.keySet();
        java.lang.Object obj16 = defaultedMap2.get((java.lang.Object) defaultedMap5);
        int i17 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b24 = fixedOrderComparator21.isLocked();
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) (short) 1, (java.lang.Object) b24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 1.0d);
        boolean b28 = defaultedMap19.isEmpty();
        java.lang.String str29 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = null;
        boolean b35 = fixedOrderComparator33.add(obj34);
        boolean b36 = fixedOrderComparator33.isLocked();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) b36);
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) 1.0d);
        boolean b40 = defaultedMap31.isEmpty();
        boolean b41 = defaultedMap31.isEmpty();
        boolean b42 = defaultedMap31.isEmpty();
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate44);
        collections.Predicate predicate46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate(map45, predicate46, predicate47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate47, predicate52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj59 = null;
        boolean b60 = fixedOrderComparator58.add(obj59);
        boolean b61 = fixedOrderComparator58.isLocked();
        java.lang.Object obj62 = defaultedMap56.put((java.lang.Object) (short) 1, (java.lang.Object) b61);
        java.lang.Object obj64 = defaultedMap56.get((java.lang.Object) 1.0d);
        boolean b65 = defaultedMap56.isEmpty();
        boolean b66 = defaultedMap56.isEmpty();
        boolean b67 = defaultedMap56.isEmpty();
        collections.Predicate predicate68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate68, predicate69);
        try {
            java.util.Map map71 = collections.map.PredicatedMap.decorate(map0, predicate52, predicate69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1.0d) + "'", obj16.equals((-1.0d)));
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 0 + "'", obj27.equals((byte) 0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{1=false}" + "'", str29.equals("{1=false}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 0 + "'", obj39.equals((byte) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (byte) 0 + "'", obj64.equals((byte) 0));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        boolean b25 = defaultedMap15.isEmpty();
        boolean b26 = defaultedMap15.isEmpty();
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator34.isLocked();
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) b37);
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) 1.0d);
        boolean b41 = defaultedMap32.isEmpty();
        java.util.Set set42 = defaultedMap32.keySet();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object obj51 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) b50);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b54 = defaultedMap45.isEmpty();
        boolean b55 = defaultedMap45.isEmpty();
        boolean b56 = defaultedMap45.isEmpty();
        collections.Predicate predicate57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate43, predicate58);
        java.lang.Object obj61 = defaultedMap15.put((java.lang.Object) '#', (java.lang.Object) defaultedMap32);
        java.lang.Object obj62 = defaultedMap13.remove((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set65 = defaultedMap64.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj70 = null;
        boolean b71 = fixedOrderComparator69.add(obj70);
        boolean b72 = fixedOrderComparator69.isLocked();
        java.lang.Object obj73 = defaultedMap67.put((java.lang.Object) (short) 1, (java.lang.Object) b72);
        java.lang.Object obj75 = defaultedMap67.get((java.lang.Object) 1.0d);
        boolean b76 = defaultedMap67.isEmpty();
        java.util.Set set77 = defaultedMap67.keySet();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj83 = null;
        boolean b84 = fixedOrderComparator82.add(obj83);
        boolean b85 = fixedOrderComparator82.isLocked();
        java.lang.Object obj86 = defaultedMap80.put((java.lang.Object) (short) 1, (java.lang.Object) b85);
        java.lang.Object obj88 = defaultedMap80.get((java.lang.Object) 1.0d);
        boolean b89 = defaultedMap80.isEmpty();
        boolean b90 = defaultedMap80.isEmpty();
        boolean b91 = defaultedMap80.isEmpty();
        collections.Predicate predicate92 = null;
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate92, predicate93);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate78, predicate93);
        collections.Predicate predicate96 = collections.PredicateUtils.truePredicate();
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate93, predicate96);
        java.lang.Object obj98 = defaultedMap32.get((java.lang.Object) map97);
        java.util.Map map99 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj98);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 0 + "'", obj53.equals((byte) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (byte) 0 + "'", obj75.equals((byte) 0));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + (byte) 0 + "'", obj88.equals((byte) 0));
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + (byte) 0 + "'", obj98.equals((byte) 0));
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        java.util.Set set14 = defaultedMap4.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate15, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate33);
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.util.Collection collection37 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        boolean b14 = fixedOrderComparator12.isLocked();
        fixedOrderComparator12.setUnknownObjectBehavior(2);
        boolean b17 = fixedOrderComparator12.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        boolean b14 = fixedOrderComparator12.isLocked();
        int i15 = fixedOrderComparator12.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        boolean b11 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        boolean b18 = fixedOrderComparator15.isLocked();
        java.lang.Object obj19 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) b18);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) 1.0d);
        boolean b22 = defaultedMap13.isEmpty();
        boolean b23 = defaultedMap13.isEmpty();
        boolean b24 = defaultedMap13.isEmpty();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate25, predicate26);
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        defaultedMap1.putAll(map30);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 1.0d);
        boolean b21 = defaultedMap12.isEmpty();
        boolean b22 = defaultedMap12.isEmpty();
        boolean b23 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        boolean b36 = defaultedMap1.isEmpty();
        collections.Factory factory37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) 1.0d);
        boolean b13 = defaultedMap4.isEmpty();
        boolean b14 = defaultedMap4.isEmpty();
        boolean b15 = defaultedMap4.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object obj23 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) b22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) 1.0d);
        boolean b26 = defaultedMap17.isEmpty();
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = defaultedMap17.isEmpty();
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate29, predicate30);
        defaultedMap4.putAll((java.util.Map) defaultedMap17);
        boolean b34 = defaultedMap17.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        boolean b39 = defaultedMap38.isEmpty();
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) b39);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 0 + "'", obj25.equals((byte) 0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) 0 + "'", obj40.equals((byte) 0));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator5.add(obj6);
        boolean b8 = fixedOrderComparator5.isLocked();
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) b8);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) 1.0d);
        boolean b12 = defaultedMap3.isEmpty();
        boolean b13 = defaultedMap3.isEmpty();
        boolean b14 = defaultedMap3.isEmpty();
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        java.util.Set set30 = defaultedMap20.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate31, predicate46);
        java.lang.Object obj49 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) defaultedMap20);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate53, predicate57);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        java.util.Set set25 = defaultedMap15.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator30.add(obj31);
        boolean b33 = fixedOrderComparator30.isLocked();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) (short) 1, (java.lang.Object) b33);
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) 1.0d);
        boolean b37 = defaultedMap28.isEmpty();
        boolean b38 = defaultedMap28.isEmpty();
        boolean b39 = defaultedMap28.isEmpty();
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate26, predicate41);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate41, predicate44);
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) map45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj58 = null;
        boolean b59 = fixedOrderComparator57.add(obj58);
        boolean b60 = fixedOrderComparator57.isLocked();
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) (short) 1, (java.lang.Object) b60);
        boolean b62 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj67 = null;
        boolean b68 = fixedOrderComparator66.add(obj67);
        boolean b69 = fixedOrderComparator66.isLocked();
        java.lang.Object obj70 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) b69);
        java.lang.Object obj72 = defaultedMap64.get((java.lang.Object) 1.0d);
        boolean b73 = defaultedMap64.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap64);
        java.util.Collection collection75 = defaultedMap64.values();
        java.lang.Object obj76 = defaultedMap48.put((java.lang.Object) defaultedMap50, (java.lang.Object) defaultedMap64);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj79 = defaultedMap50.remove((java.lang.Object) defaultedMap78);
        java.lang.Object obj80 = defaultedMap1.remove((java.lang.Object) defaultedMap78);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 0 + "'", obj72.equals((byte) 0));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator7.add(obj9);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = fixedOrderComparator7.add((java.lang.Object) defaultedMap15);
        java.util.Set set18 = defaultedMap15.entrySet();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator17.isLocked();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) b20);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap15.isEmpty();
        java.util.Set set25 = defaultedMap15.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator30.add(obj31);
        boolean b33 = fixedOrderComparator30.isLocked();
        java.lang.Object obj34 = defaultedMap28.put((java.lang.Object) (short) 1, (java.lang.Object) b33);
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) 1.0d);
        boolean b37 = defaultedMap28.isEmpty();
        boolean b38 = defaultedMap28.isEmpty();
        boolean b39 = defaultedMap28.isEmpty();
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate26, predicate41);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate41, predicate44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) predicate41);
        java.util.Collection collection47 = defaultedMap1.values();
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 0 + "'", obj36.equals((byte) 0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 0 + "'", obj46.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        boolean b15 = fixedOrderComparator12.isLocked();
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) b15);
        java.lang.Object obj18 = defaultedMap10.get((java.lang.Object) 1.0d);
        boolean b19 = defaultedMap10.isEmpty();
        boolean b20 = defaultedMap10.isEmpty();
        boolean b21 = defaultedMap10.isEmpty();
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate22);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 0 + "'", obj18.equals((byte) 0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = null;
        boolean b9 = fixedOrderComparator7.add(obj8);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) b10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1.0d);
        boolean b14 = defaultedMap5.isEmpty();
        boolean b15 = defaultedMap5.isEmpty();
        boolean b16 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator20.add(obj21);
        boolean b23 = fixedOrderComparator20.isLocked();
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) (short) 1, (java.lang.Object) b23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0d);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0d);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set31 = defaultedMap30.entrySet();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        int i41 = fixedOrderComparator39.getUnknownObjectBehavior();
        boolean b42 = fixedOrderComparator39.isLocked();
        java.lang.Object obj43 = defaultedMap5.put((java.lang.Object) defaultedMap30, (java.lang.Object) b42);
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        java.lang.String str45 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (short) 1, (java.lang.Object) b9);
        boolean b11 = defaultedMap4.isEmpty();
        java.util.Collection collection12 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) collection12);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b16 = fixedOrderComparator13.isLocked();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (short) 1, (java.lang.Object) b16);
        boolean b18 = defaultedMap11.isEmpty();
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        java.util.Collection collection21 = defaultedMap1.values();
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator23.add(obj24);
        boolean b26 = fixedOrderComparator23.isLocked();
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) b26);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj33 = null;
        boolean b34 = fixedOrderComparator32.add(obj33);
        boolean b35 = fixedOrderComparator32.isLocked();
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) (short) 1, (java.lang.Object) b35);
        java.lang.Object obj38 = defaultedMap30.get((java.lang.Object) 1.0d);
        boolean b39 = defaultedMap30.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection41 = defaultedMap30.values();
        java.lang.Object obj42 = defaultedMap14.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap30);
        java.util.Set set43 = defaultedMap14.keySet();
        java.lang.Object obj44 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        boolean b46 = defaultedMap14.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b7 = fixedOrderComparator4.isLocked();
        boolean b9 = fixedOrderComparator4.add((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator14.add((java.lang.Object) obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator26);
        boolean b28 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) b28);
        java.lang.Object obj30 = defaultedMap13.remove((java.lang.Object) b28);
        boolean b31 = defaultedMap13.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        boolean b2 = fixedOrderComparator0.add(obj1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        boolean b14 = fixedOrderComparator12.isLocked();
        fixedOrderComparator12.setUnknownObjectBehavior(2);
        int i17 = fixedOrderComparator12.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        boolean b11 = fixedOrderComparator8.isLocked();
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) (short) 1, (java.lang.Object) b11);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1.0d);
        boolean b15 = defaultedMap6.isEmpty();
        java.util.Set set16 = defaultedMap6.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b24 = fixedOrderComparator21.isLocked();
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) (short) 1, (java.lang.Object) b24);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 1.0d);
        boolean b28 = defaultedMap19.isEmpty();
        boolean b29 = defaultedMap19.isEmpty();
        boolean b30 = defaultedMap19.isEmpty();
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate17, predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate32, predicate35);
        boolean b38 = defaultedMap3.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj43 = null;
        boolean b44 = fixedOrderComparator42.add(obj43);
        boolean b45 = fixedOrderComparator42.isLocked();
        java.lang.Object obj46 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) b45);
        boolean b47 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj52 = null;
        boolean b53 = fixedOrderComparator51.add(obj52);
        boolean b54 = fixedOrderComparator51.isLocked();
        java.lang.Object obj55 = defaultedMap49.put((java.lang.Object) (short) 1, (java.lang.Object) b54);
        java.lang.Object obj57 = defaultedMap49.get((java.lang.Object) 1.0d);
        boolean b58 = defaultedMap49.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap49);
        java.util.Collection collection60 = defaultedMap49.values();
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        int i70 = fixedOrderComparator69.getUnknownObjectBehavior();
        java.lang.Object obj71 = defaultedMap49.put((java.lang.Object) obj_array67, (java.lang.Object) i70);
        java.lang.Object obj73 = defaultedMap3.put((java.lang.Object) obj_array67, (java.lang.Object) 10.0f);
        boolean b74 = defaultedMap1.containsKey((java.lang.Object) obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array67);
        fixedOrderComparator75.setUnknownObjectBehavior(2);
        int i78 = fixedOrderComparator75.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 0 + "'", obj27.equals((byte) 0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (byte) 0 + "'", obj57.equals((byte) 0));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i70 == 2);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i78 == 2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0f);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i5 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i14 = fixedOrderComparator13.getUnknownObjectBehavior();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) i14);
        java.util.Set set16 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 0 + "'", obj15.equals((byte) 0));
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        boolean b17 = fixedOrderComparator14.isLocked();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) b17);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 1.0d);
        boolean b21 = defaultedMap12.isEmpty();
        boolean b22 = defaultedMap12.isEmpty();
        boolean b23 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator27.isLocked();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) b30);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) 1.0d);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0d);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj47 = null;
        boolean b48 = fixedOrderComparator46.add(obj47);
        boolean b49 = fixedOrderComparator46.isLocked();
        java.lang.Object obj50 = defaultedMap44.put((java.lang.Object) (short) 1, (java.lang.Object) b49);
        boolean b51 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj56 = null;
        boolean b57 = fixedOrderComparator55.add(obj56);
        boolean b58 = fixedOrderComparator55.isLocked();
        java.lang.Object obj59 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) b58);
        java.lang.Object obj61 = defaultedMap53.get((java.lang.Object) 1.0d);
        boolean b62 = defaultedMap53.isEmpty();
        defaultedMap44.putAll((java.util.Map) defaultedMap53);
        java.util.Collection collection64 = defaultedMap53.values();
        java.lang.Object obj65 = defaultedMap37.put((java.lang.Object) defaultedMap39, (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj68 = defaultedMap39.remove((java.lang.Object) defaultedMap67);
        defaultedMap12.putAll((java.util.Map) defaultedMap67);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 0 + "'", obj20.equals((byte) 0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (byte) 0 + "'", obj61.equals((byte) 0));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator5.add(obj6);
        boolean b8 = fixedOrderComparator5.isLocked();
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) b8);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) 1.0d);
        boolean b12 = defaultedMap3.isEmpty();
        boolean b13 = defaultedMap3.isEmpty();
        boolean b14 = defaultedMap3.isEmpty();
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) b25);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1.0d);
        boolean b29 = defaultedMap20.isEmpty();
        java.util.Set set30 = defaultedMap20.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        boolean b38 = fixedOrderComparator35.isLocked();
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) b38);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap33.isEmpty();
        boolean b43 = defaultedMap33.isEmpty();
        boolean b44 = defaultedMap33.isEmpty();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate31, predicate46);
        java.lang.Object obj49 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) defaultedMap20);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap20);
        java.util.Collection collection51 = defaultedMap1.values();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0d, 0.0f, '#', (short) -1, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        int i60 = fixedOrderComparator59.getUnknownObjectBehavior();
        int i61 = fixedOrderComparator59.getUnknownObjectBehavior();
        boolean b62 = fixedOrderComparator59.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj64 = defaultedMap1.put((java.lang.Object) b62, (java.lang.Object) fixedOrderComparator63);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 0 + "'", obj28.equals((byte) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 0 + "'", obj41.equals((byte) 0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(i60 == 2);
        org.junit.Assert.assertTrue(i61 == 2);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator3.add(obj4);
        boolean b6 = fixedOrderComparator3.isLocked();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) b6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        boolean b19 = fixedOrderComparator16.isLocked();
        java.lang.Object obj20 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) b19);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0d);
        boolean b23 = defaultedMap14.isEmpty();
        boolean b24 = defaultedMap14.isEmpty();
        boolean b25 = defaultedMap14.isEmpty();
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate27);
        java.util.Collection collection30 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 0 + "'", obj22.equals((byte) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
    }
}

