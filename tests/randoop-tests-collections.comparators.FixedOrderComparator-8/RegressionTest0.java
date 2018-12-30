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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        try {
            int i5 = fixedOrderComparator2.compare((java.lang.Object) fixedOrderComparator3, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            boolean b3 = fixedOrderComparator0.addAsEqual((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        fixedOrderComparator3.setUnknownObjectBehavior((int) (short) 1);
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array2);
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) fixedOrderComparator4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) fixedOrderComparator3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(i4 == 2);
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
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.PredicateUtils predicateUtils1 = new collections.PredicateUtils();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (-1.0f));
        try {
            int i11 = fixedOrderComparator0.compare((java.lang.Object) predicateUtils1, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) 1 + "'", obj10.equals((short) 1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
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
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        try {
            int i9 = fixedOrderComparator2.compare((java.lang.Object) 2, (java.lang.Object) obj_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 100.0d);
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array4);
        int i7 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        boolean b16 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        try {
            boolean b18 = fixedOrderComparator2.addAsEqual((java.lang.Object) b16, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator6.add(obj9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) b10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1L) + "'", obj11.equals((-1L)));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i9 = fixedOrderComparator8.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 10L);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        boolean b18 = fixedOrderComparator8.add((java.lang.Object) predicate15);
        try {
            boolean b19 = fixedOrderComparator0.addAsEqual((java.lang.Object) i4, (java.lang.Object) b18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        try {
            boolean b6 = fixedOrderComparator2.addAsEqual((java.lang.Object) "", (java.lang.Object) "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        java.lang.Object obj6 = new java.lang.Object();
        try {
            boolean b8 = fixedOrderComparator3.addAsEqual(obj6, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        int i10 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator8.add(obj11);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) fixedOrderComparator25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        boolean b28 = defaultedMap18.equals((java.lang.Object) predicate27);
        try {
            boolean b29 = fixedOrderComparator4.addAsEqual((java.lang.Object) b12, (java.lang.Object) b28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        int i9 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10L);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 10L);
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map11, obj21);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate(map11, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b6 = defaultedMap5.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b15 = defaultedMap5.equals((java.lang.Object) fixedOrderComparator14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        try {
            boolean b18 = fixedOrderComparator2.addAsEqual((java.lang.Object) fixedOrderComparator14, (java.lang.Object) i17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b6 = fixedOrderComparator5.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10L);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        boolean b21 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate28);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        boolean b8 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) fixedOrderComparator16);
        java.util.Set set18 = defaultedMap13.entrySet();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        fixedOrderComparator21.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set25 = defaultedMap24.keySet();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = defaultedMap24.get((java.lang.Object) fixedOrderComparator31);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap24.containsValue(obj33);
        try {
            boolean b35 = fixedOrderComparator10.addAsEqual((java.lang.Object) defaultedMap13, (java.lang.Object) b34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0d + "'", obj17.equals(100.0d));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 1 + "'", obj27.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 1 + "'", obj32.equals((short) 1));
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        boolean b19 = fixedOrderComparator9.add((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 0);
        java.util.Set set24 = defaultedMap21.keySet();
        try {
            boolean b25 = fixedOrderComparator3.addAsEqual((java.lang.Object) b19, (java.lang.Object) set24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) fixedOrderComparator18);
        try {
            boolean b21 = fixedOrderComparator2.addAsEqual(obj19, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 1 + "'", obj14.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 1 + "'", obj19.equals((short) 1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set10 = defaultedMap9.keySet();
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) fixedOrderComparator16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap9.equals((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = defaultedMap21.equals((java.lang.Object) fixedOrderComparator30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (byte) 0);
        java.util.Collection collection34 = defaultedMap21.values();
        try {
            int i35 = fixedOrderComparator2.compare((java.lang.Object) defaultedMap9, (java.lang.Object) collection34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 1 + "'", obj12.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) i4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10L);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) map11);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i19 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        try {
            int i7 = fixedOrderComparator3.compare((java.lang.Object) (short) 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) '#');
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b26 = defaultedMap25.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        boolean b32 = fixedOrderComparator22.add((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate29, predicate39);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 10L);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate52);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        fixedOrderComparator57.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str61 = defaultedMap60.toString();
        defaultedMap60.clear();
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 10L);
        java.util.Map map65 = collections.map.DefaultedMap.decorate(map54, obj64);
        java.lang.Object obj66 = defaultedMap5.get((java.lang.Object) map54);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        fixedOrderComparator69.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set73 = defaultedMap72.keySet();
        java.lang.String str74 = defaultedMap72.toString();
        boolean b76 = defaultedMap72.containsKey((java.lang.Object) 1L);
        java.lang.String str77 = defaultedMap72.toString();
        boolean b78 = defaultedMap5.containsValue((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        boolean b81 = defaultedMap72.containsKey((java.lang.Object) "{}");
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 1 + "'", obj64.equals((short) 1));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 1 + "'", obj66.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) '#');
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b26 = defaultedMap25.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        boolean b32 = fixedOrderComparator22.add((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate29, predicate39);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 10L);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate52);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        fixedOrderComparator57.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str61 = defaultedMap60.toString();
        defaultedMap60.clear();
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 10L);
        java.util.Map map65 = collections.map.DefaultedMap.decorate(map54, obj64);
        java.lang.Object obj66 = defaultedMap5.get((java.lang.Object) map54);
        collections.Transformer transformer67 = null;
        try {
            java.util.Map map68 = collections.map.DefaultedMap.decorate(map54, transformer67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 1 + "'", obj64.equals((short) 1));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 1 + "'", obj66.equals((short) 1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b4 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) str11);
        java.util.Set set13 = defaultedMap1.keySet();
        boolean b14 = defaultedMap1.isEmpty();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        int i4 = fixedOrderComparator2.getUnknownObjectBehavior();
        int i5 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (short) 1);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap1.containsValue(obj20);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.String str7 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) fixedOrderComparator24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        fixedOrderComparator32.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set36 = defaultedMap35.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) set36);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        defaultedMap9.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj40 = defaultedMap5.get((java.lang.Object) defaultedMap9);
        java.util.Collection collection41 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1L) + "'", obj19.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0d + "'", obj25.equals(100.0d));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (-1L) + "'", obj37.equals((-1L)));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 1 + "'", obj40.equals((short) 1));
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        int i9 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) 100.0d);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) b11);
        boolean b13 = defaultedMap5.isEmpty();
        java.util.Set set14 = defaultedMap5.keySet();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) i18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10L);
        try {
            int i25 = fixedOrderComparator3.compare(obj19, (java.lang.Object) defaultedMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1L) + "'", obj19.equals((-1L)));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        try {
            int i12 = fixedOrderComparator6.compare((java.lang.Object) i10, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (short) 1);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator16);
        boolean b20 = fixedOrderComparator16.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        fixedOrderComparator5.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection9 = defaultedMap8.values();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection9);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        java.util.Set set8 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap5.containsValue(obj14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator18.isLocked();
        int i20 = fixedOrderComparator18.getUnknownObjectBehavior();
        java.lang.Object obj21 = null;
        boolean b22 = fixedOrderComparator18.add(obj21);
        java.lang.Object obj24 = defaultedMap5.put(obj21, (java.lang.Object) 1);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 10L);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 10L);
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map11, obj21);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        fixedOrderComparator25.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) '#');
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate(map11, (java.lang.Object) 100.0f);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.util.Map map42 = collections.map.DefaultedMap.decorate(map11, (java.lang.Object) obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array37);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b7 = fixedOrderComparator4.add((java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) b7);
        boolean b9 = defaultedMap1.isEmpty();
        java.util.Set set10 = defaultedMap1.keySet();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        int i14 = fixedOrderComparator13.getUnknownObjectBehavior();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) i14);
        java.util.Map map16 = null;
        try {
            defaultedMap1.putAll(map16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1L) + "'", obj15.equals((-1L)));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 10L);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        boolean b13 = fixedOrderComparator3.add((java.lang.Object) predicate10);
        int i14 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b15 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        try {
            boolean b10 = fixedOrderComparator2.addAsEqual((java.lang.Object) obj_array7, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj_array7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        boolean b7 = fixedOrderComparator5.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) fixedOrderComparator22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator30.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) set34);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        defaultedMap7.putAll((java.util.Map) defaultedMap19);
        boolean b38 = fixedOrderComparator2.add((java.lang.Object) defaultedMap19);
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0d + "'", obj23.equals(100.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (-1L) + "'", obj35.equals((-1L)));
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) str11);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set24 = defaultedMap23.keySet();
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) set24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) fixedOrderComparator30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        fixedOrderComparator38.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set42 = defaultedMap41.keySet();
        java.lang.Object obj43 = defaultedMap33.get((java.lang.Object) set42);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        defaultedMap15.putAll((java.util.Map) defaultedMap27);
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        fixedOrderComparator49.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set53 = defaultedMap52.keySet();
        java.lang.Object obj55 = defaultedMap52.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj60 = defaultedMap52.get((java.lang.Object) fixedOrderComparator59);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) fixedOrderComparator59);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1L) + "'", obj25.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0d + "'", obj31.equals(100.0d));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (-1L) + "'", obj43.equals((-1L)));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) 1 + "'", obj55.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) 1 + "'", obj60.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (-1L) + "'", obj61.equals((-1L)));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) fixedOrderComparator32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.Object obj45 = defaultedMap35.get((java.lang.Object) set44);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        defaultedMap17.putAll((java.util.Map) defaultedMap29);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1L) + "'", obj27.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1L) + "'", obj45.equals((-1L)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10L);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        boolean b28 = fixedOrderComparator18.add((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b31 = defaultedMap30.isEmpty();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10L);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 10L);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 10L);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        boolean b59 = fixedOrderComparator49.add((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b62 = defaultedMap61.isEmpty();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 10L);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate56, predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate35, predicate66);
        collections.Transformer transformer70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate(map69, transformer70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        fixedOrderComparator2.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        fixedOrderComparator18.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj23 = null;
        try {
            int i24 = fixedOrderComparator4.compare(obj22, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 1 + "'", obj15.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 1 + "'", obj22.equals((short) 1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator4.add((java.lang.Object) fixedOrderComparator8);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.String str7 = defaultedMap5.toString();
        java.util.Collection collection8 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        int i6 = fixedOrderComparator4.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i14 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 10L);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        boolean b23 = fixedOrderComparator13.add((java.lang.Object) predicate20);
        boolean b24 = defaultedMap5.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b27 = defaultedMap26.isEmpty();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 10L);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i37 = fixedOrderComparator36.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 10L);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        boolean b46 = fixedOrderComparator36.add((java.lang.Object) predicate43);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate30, predicate43);
        java.util.Collection collection48 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b7 = fixedOrderComparator3.add((java.lang.Object) "");
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) i4);
        int i6 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10L);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        boolean b21 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate28);
        defaultedMap1.clear();
        java.lang.String str32 = defaultedMap1.toString();
        boolean b33 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) '#');
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b26 = defaultedMap25.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        boolean b32 = fixedOrderComparator22.add((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate29, predicate39);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) predicate39);
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) collection8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) obj_array11);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap20);
        java.util.Set set32 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str44 = defaultedMap43.toString();
        java.lang.Object obj45 = defaultedMap34.put((java.lang.Object) "{}", (java.lang.Object) str44);
        java.util.Set set46 = defaultedMap34.keySet();
        boolean b47 = defaultedMap34.isEmpty();
        java.lang.Object obj48 = defaultedMap20.get((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (-1L) + "'", obj48.equals((-1L)));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) fixedOrderComparator32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.Object obj45 = defaultedMap35.get((java.lang.Object) set44);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        defaultedMap17.putAll((java.util.Map) defaultedMap29);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection49 = defaultedMap17.values();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1L) + "'", obj27.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1L) + "'", obj45.equals((-1L)));
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10L);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        boolean b28 = fixedOrderComparator18.add((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b31 = defaultedMap30.isEmpty();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10L);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 10L);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 10L);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        boolean b59 = fixedOrderComparator49.add((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b62 = defaultedMap61.isEmpty();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 10L);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate56, predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate35, predicate66);
        java.lang.Object[] obj_array71 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array71);
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array71);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array71);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array71);
        boolean b77 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator76);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        defaultedMap7.clear();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap20);
        java.util.Set set32 = defaultedMap20.keySet();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) fixedOrderComparator45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap38.equals((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        fixedOrderComparator55.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set59 = defaultedMap58.keySet();
        java.lang.Object obj60 = defaultedMap50.get((java.lang.Object) set59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        java.lang.Object obj66 = defaultedMap62.get((java.lang.Object) fixedOrderComparator65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        fixedOrderComparator73.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set77 = defaultedMap76.keySet();
        java.lang.Object obj78 = defaultedMap68.get((java.lang.Object) set77);
        defaultedMap62.putAll((java.util.Map) defaultedMap68);
        defaultedMap50.putAll((java.util.Map) defaultedMap62);
        defaultedMap38.putAll((java.util.Map) defaultedMap50);
        java.lang.Object obj83 = defaultedMap38.get((java.lang.Object) "hi!");
        java.lang.Object obj84 = defaultedMap20.get((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 1 + "'", obj41.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 1 + "'", obj46.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (-1L) + "'", obj60.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100.0d + "'", obj66.equals(100.0d));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (-1L) + "'", obj78.equals((-1L)));
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) 1 + "'", obj83.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (-1L) + "'", obj84.equals((-1L)));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap14.equals((java.lang.Object) defaultedMap17);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) b19);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i14 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 10L);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        boolean b23 = fixedOrderComparator13.add((java.lang.Object) predicate20);
        boolean b24 = defaultedMap5.containsKey((java.lang.Object) predicate20);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        fixedOrderComparator27.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap5.equals((java.lang.Object) defaultedMap30);
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b44 = defaultedMap43.isEmpty();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 10L);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        int i54 = fixedOrderComparator53.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b57 = defaultedMap56.isEmpty();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) 10L);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        boolean b63 = fixedOrderComparator53.add((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b66 = defaultedMap65.isEmpty();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 10L);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate60, predicate70);
        defaultedMap43.clear();
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj75 = defaultedMap30.put(obj34, (java.lang.Object) defaultedMap43);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) '#');
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b26 = defaultedMap25.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        boolean b32 = fixedOrderComparator22.add((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate29, predicate39);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 10L);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate52);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        fixedOrderComparator57.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str61 = defaultedMap60.toString();
        defaultedMap60.clear();
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 10L);
        java.util.Map map65 = collections.map.DefaultedMap.decorate(map54, obj64);
        java.lang.Object obj66 = defaultedMap5.get((java.lang.Object) map54);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        fixedOrderComparator69.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set73 = defaultedMap72.keySet();
        java.lang.String str74 = defaultedMap72.toString();
        boolean b76 = defaultedMap72.containsKey((java.lang.Object) 1L);
        java.lang.String str77 = defaultedMap72.toString();
        boolean b78 = defaultedMap5.containsValue((java.lang.Object) defaultedMap72);
        int i79 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 1 + "'", obj64.equals((short) 1));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 1 + "'", obj66.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i79 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        defaultedMap5.clear();
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 1 + "'", obj11.equals((short) 1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) fixedOrderComparator32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.Object obj45 = defaultedMap35.get((java.lang.Object) set44);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        defaultedMap17.putAll((java.util.Map) defaultedMap29);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        fixedOrderComparator51.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str55 = defaultedMap54.toString();
        defaultedMap54.clear();
        java.lang.Object obj58 = defaultedMap54.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        int i63 = fixedOrderComparator62.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b66 = defaultedMap65.isEmpty();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 10L);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate69, predicate70);
        boolean b72 = fixedOrderComparator62.add((java.lang.Object) predicate69);
        boolean b73 = defaultedMap54.containsKey((java.lang.Object) predicate69);
        java.lang.Object[] obj_array75 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        fixedOrderComparator76.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str80 = defaultedMap79.toString();
        boolean b81 = defaultedMap54.equals((java.lang.Object) defaultedMap79);
        java.util.Set set82 = defaultedMap79.keySet();
        java.lang.Object obj83 = defaultedMap5.get((java.lang.Object) defaultedMap79);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1L) + "'", obj27.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1L) + "'", obj45.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 1 + "'", obj58.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) 1 + "'", obj83.equals((short) 1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) str11);
        int i13 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 10L);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate32);
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) map34);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 1 + "'", obj35.equals((short) 1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10L);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        boolean b28 = fixedOrderComparator18.add((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b31 = defaultedMap30.isEmpty();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10L);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 10L);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 10L);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        boolean b59 = fixedOrderComparator49.add((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b62 = defaultedMap61.isEmpty();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 10L);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate56, predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate35, predicate66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Collection collection72 = defaultedMap71.values();
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        fixedOrderComparator75.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set79 = defaultedMap78.keySet();
        java.lang.String str80 = defaultedMap78.toString();
        boolean b81 = defaultedMap71.equals((java.lang.Object) str80);
        java.util.Set set82 = defaultedMap71.entrySet();
        boolean b83 = defaultedMap5.containsValue((java.lang.Object) set82);
        java.lang.Object[] obj_array85 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array85);
        int i90 = fixedOrderComparator89.getUnknownObjectBehavior();
        java.lang.Object obj91 = defaultedMap5.get((java.lang.Object) i90);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(i90 == 2);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) 1 + "'", obj91.equals((short) 1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.String str7 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 1L);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) str11);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.equals((java.lang.Object) i18);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1L) + "'", obj14.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        int i7 = fixedOrderComparator5.getUnknownObjectBehavior();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 10L);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i27 = fixedOrderComparator26.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 10L);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate33, predicate34);
        boolean b36 = fixedOrderComparator26.add((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 10L);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate33, predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 10L);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b61 = defaultedMap60.isEmpty();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) 10L);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate65);
        boolean b67 = fixedOrderComparator57.add((java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b70 = defaultedMap69.isEmpty();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 10L);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate64, predicate74);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate43, predicate74);
        java.lang.Object obj78 = null;
        try {
            boolean b79 = fixedOrderComparator5.addAsEqual((java.lang.Object) predicate43, obj78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) '#');
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b26 = defaultedMap25.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        boolean b32 = fixedOrderComparator22.add((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 10L);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate29, predicate39);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 10L);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate52);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        fixedOrderComparator57.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str61 = defaultedMap60.toString();
        defaultedMap60.clear();
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 10L);
        java.util.Map map65 = collections.map.DefaultedMap.decorate(map54, obj64);
        java.lang.Object obj66 = defaultedMap5.get((java.lang.Object) map54);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        fixedOrderComparator69.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set73 = defaultedMap72.keySet();
        java.lang.String str74 = defaultedMap72.toString();
        boolean b76 = defaultedMap72.containsKey((java.lang.Object) 1L);
        java.lang.String str77 = defaultedMap72.toString();
        boolean b78 = defaultedMap5.containsValue((java.lang.Object) defaultedMap72);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        int i83 = fixedOrderComparator82.getUnknownObjectBehavior();
        boolean b84 = fixedOrderComparator82.isLocked();
        boolean b85 = fixedOrderComparator82.isLocked();
        java.lang.Object obj86 = defaultedMap72.get((java.lang.Object) fixedOrderComparator82);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 1 + "'", obj64.equals((short) 1));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 1 + "'", obj66.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(i83 == 2);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (short) 1 + "'", obj86.equals((short) 1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) '#');
        java.util.Collection collection10 = defaultedMap5.values();
        java.util.Collection collection11 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        boolean b5 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b20 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b23 = defaultedMap22.isEmpty();
        boolean b24 = defaultedMap19.equals((java.lang.Object) defaultedMap22);
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 1 + "'", obj16.equals((short) 1));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap20);
        int i32 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) set18);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        boolean b22 = defaultedMap3.containsValue((java.lang.Object) ' ');
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100.0d + "'", obj7.equals(100.0d));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1L) + "'", obj19.equals((-1L)));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        boolean b19 = fixedOrderComparator9.add((java.lang.Object) predicate16);
        boolean b20 = defaultedMap5.containsValue((java.lang.Object) b19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b23 = defaultedMap22.isEmpty();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 10L);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = defaultedMap22.equals((java.lang.Object) fixedOrderComparator31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (byte) 0);
        java.util.Collection collection35 = defaultedMap22.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) collection35);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) (short) 1);
        int i17 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 1 + "'", obj16.equals((short) 1));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) fixedOrderComparator32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.Object obj45 = defaultedMap35.get((java.lang.Object) set44);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        defaultedMap17.putAll((java.util.Map) defaultedMap29);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        fixedOrderComparator51.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set55 = defaultedMap54.keySet();
        java.lang.Object obj57 = defaultedMap54.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object obj62 = defaultedMap54.get((java.lang.Object) fixedOrderComparator61);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap54.equals((java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b70 = defaultedMap69.isEmpty();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 10L);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate74);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate63, predicate74);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1L) + "'", obj27.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1L) + "'", obj45.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 1 + "'", obj57.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) 1 + "'", obj62.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap20);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b42 = defaultedMap41.isEmpty();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 10L);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate46);
        boolean b49 = fixedOrderComparator36.add((java.lang.Object) map48);
        boolean b50 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator36);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        fixedOrderComparator53.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (byte) 1);
        boolean b60 = defaultedMap56.containsKey((java.lang.Object) '#');
        java.util.Collection collection61 = defaultedMap56.values();
        java.lang.Object obj62 = defaultedMap7.get((java.lang.Object) defaultedMap56);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (-1L) + "'", obj62.equals((-1L)));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set19 = defaultedMap7.keySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) i4);
        java.util.Map map6 = null;
        try {
            defaultedMap5.putAll(map6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) fixedOrderComparator32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.Object obj45 = defaultedMap35.get((java.lang.Object) set44);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        defaultedMap17.putAll((java.util.Map) defaultedMap29);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection49 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1L) + "'", obj27.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1L) + "'", obj45.equals((-1L)));
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        boolean b7 = defaultedMap5.equals((java.lang.Object) 'a');
        defaultedMap5.clear();
        java.lang.String str9 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        boolean b25 = fixedOrderComparator22.add((java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap19.remove((java.lang.Object) b25);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 1 + "'", obj16.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap20);
        boolean b32 = defaultedMap20.isEmpty();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.containsValue((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) '#');
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        fixedOrderComparator5.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.String str10 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap20.keySet();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) fixedOrderComparator27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj40 = defaultedMap30.get((java.lang.Object) set39);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        defaultedMap12.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj43 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1L) + "'", obj22.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0d + "'", obj28.equals(100.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (-1L) + "'", obj40.equals((-1L)));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) 1 + "'", obj43.equals((short) 1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        fixedOrderComparator9.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) defaultedMap12, obj14);
        java.lang.String str16 = defaultedMap12.toString();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) fixedOrderComparator32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.Object obj45 = defaultedMap35.get((java.lang.Object) set44);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        defaultedMap17.putAll((java.util.Map) defaultedMap29);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj50 = defaultedMap5.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1L) + "'", obj27.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0d + "'", obj33.equals(100.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (-1L) + "'", obj45.equals((-1L)));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 1 + "'", obj50.equals((short) 1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b8 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj18 = defaultedMap7.put((java.lang.Object) "{}", (java.lang.Object) str17);
        java.util.Set set19 = defaultedMap7.keySet();
        boolean b20 = fixedOrderComparator3.add((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = defaultedMap9.equals((java.lang.Object) fixedOrderComparator18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        java.util.Collection collection22 = defaultedMap9.values();
        java.lang.Object obj23 = defaultedMap5.put((java.lang.Object) 0.0f, (java.lang.Object) collection22);
        java.util.Collection collection24 = defaultedMap5.values();
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        defaultedMap4.clear();
        boolean b8 = defaultedMap4.isEmpty();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) fixedOrderComparator22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator30.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) set34);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        defaultedMap7.putAll((java.util.Map) defaultedMap19);
        boolean b38 = fixedOrderComparator2.add((java.lang.Object) defaultedMap19);
        int i39 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0d + "'", obj23.equals(100.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (-1L) + "'", obj35.equals((-1L)));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.util.Set set12 = defaultedMap1.keySet();
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        boolean b6 = fixedOrderComparator2.add((java.lang.Object) obj_array4);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) str11);
        int i13 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        boolean b23 = defaultedMap19.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.String str7 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) fixedOrderComparator24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        fixedOrderComparator32.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set36 = defaultedMap35.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) set36);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        defaultedMap9.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj40 = defaultedMap5.get((java.lang.Object) defaultedMap9);
        int i41 = defaultedMap9.size();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1L) + "'", obj19.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0d + "'", obj25.equals(100.0d));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (-1L) + "'", obj37.equals((-1L)));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 1 + "'", obj40.equals((short) 1));
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        defaultedMap5.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        boolean b18 = fixedOrderComparator15.add((java.lang.Object) 100.0d);
        java.lang.Object obj19 = defaultedMap12.remove((java.lang.Object) b18);
        boolean b20 = defaultedMap12.isEmpty();
        java.util.Set set21 = defaultedMap12.keySet();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 10L);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        boolean b35 = fixedOrderComparator25.add((java.lang.Object) predicate32);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 10L);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        boolean b49 = fixedOrderComparator39.add((java.lang.Object) predicate46);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate32, predicate46);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate32);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i57 = fixedOrderComparator56.getUnknownObjectBehavior();
        boolean b59 = fixedOrderComparator56.add((java.lang.Object) 100.0d);
        java.lang.Object obj60 = defaultedMap53.remove((java.lang.Object) b59);
        boolean b61 = defaultedMap53.isEmpty();
        java.util.Set set62 = defaultedMap53.keySet();
        boolean b63 = defaultedMap5.containsValue((java.lang.Object) set62);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = null;
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, obj9);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) str11);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set24 = defaultedMap23.keySet();
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) set24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) fixedOrderComparator30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        fixedOrderComparator38.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set42 = defaultedMap41.keySet();
        java.lang.Object obj43 = defaultedMap33.get((java.lang.Object) set42);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        defaultedMap15.putAll((java.util.Map) defaultedMap27);
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b49 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b52 = defaultedMap51.isEmpty();
        boolean b53 = defaultedMap48.equals((java.lang.Object) defaultedMap51);
        java.util.Collection collection54 = defaultedMap51.values();
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) collection54);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1L) + "'", obj25.equals((-1L)));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0d + "'", obj31.equals(100.0d));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (-1L) + "'", obj43.equals((-1L)));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (-1L) + "'", obj55.equals((-1L)));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b9 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) "{}", (java.lang.Object) str18);
        int i20 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap22.clear();
        try {
            int i24 = fixedOrderComparator3.compare((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate14);
        boolean b17 = fixedOrderComparator4.add((java.lang.Object) map16);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        boolean b22 = fixedOrderComparator4.add((java.lang.Object) b21);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Map map0 = null;
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        fixedOrderComparator3.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b23 = defaultedMap22.isEmpty();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 10L);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate27);
        boolean b29 = fixedOrderComparator19.add((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 10L);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate36);
        defaultedMap9.clear();
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 10L);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate17);
        java.lang.Object obj20 = defaultedMap4.remove((java.lang.Object) predicate10);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator23.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        defaultedMap4.putAll((java.util.Map) defaultedMap26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj_array22);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i27 = fixedOrderComparator26.getUnknownObjectBehavior();
        int i28 = fixedOrderComparator26.getUnknownObjectBehavior();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) i28);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0d + "'", obj29.equals(100.0d));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b4 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        fixedOrderComparator9.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj14 = defaultedMap3.put((java.lang.Object) "{}", (java.lang.Object) str13);
        int i15 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        defaultedMap5.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        boolean b18 = fixedOrderComparator15.add((java.lang.Object) 100.0d);
        java.lang.Object obj19 = defaultedMap12.remove((java.lang.Object) b18);
        boolean b20 = defaultedMap12.isEmpty();
        java.util.Set set21 = defaultedMap12.keySet();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 10L);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        boolean b35 = fixedOrderComparator25.add((java.lang.Object) predicate32);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 10L);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        boolean b49 = fixedOrderComparator39.add((java.lang.Object) predicate46);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate32, predicate46);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate32);
        collections.Transformer transformer52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate(map51, transformer52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        boolean b10 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) str11);
        java.util.Set set13 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.util.Set set12 = defaultedMap1.keySet();
        int i13 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate28);
        boolean b31 = fixedOrderComparator18.add((java.lang.Object) map30);
        boolean b32 = fixedOrderComparator18.isLocked();
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator18);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap5.equals((java.lang.Object) predicate14);
        int i16 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 10L);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) predicate11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1L) + "'", obj13.equals((-1L)));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        fixedOrderComparator5.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.String str10 = defaultedMap8.toString();
        boolean b11 = defaultedMap1.equals((java.lang.Object) str10);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10L);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator23.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) '#');
        java.util.Collection collection31 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b34 = defaultedMap33.isEmpty();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 10L);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b47 = defaultedMap46.isEmpty();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 10L);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        boolean b53 = fixedOrderComparator43.add((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b56 = defaultedMap55.isEmpty();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 10L);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate50, predicate60);
        boolean b63 = defaultedMap26.containsKey((java.lang.Object) predicate60);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate60);
        collections.Factory factory65 = null;
        try {
            java.util.Map map66 = collections.map.DefaultedMap.decorate(map64, factory65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (-1.0f));
        defaultedMap5.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj19 = defaultedMap5.remove((java.lang.Object) set18);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Collection collection26 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 10L);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i39 = fixedOrderComparator38.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b42 = defaultedMap41.isEmpty();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 10L);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        boolean b48 = fixedOrderComparator38.add((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b51 = defaultedMap50.isEmpty();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 10L);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate45, predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b60 = defaultedMap59.isEmpty();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 10L);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array67);
        int i70 = fixedOrderComparator69.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b73 = defaultedMap72.isEmpty();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) 10L);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate76, predicate77);
        boolean b79 = fixedOrderComparator69.add((java.lang.Object) predicate76);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b82 = defaultedMap81.isEmpty();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) 10L);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate76, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate55, predicate86);
        boolean b90 = defaultedMap5.containsValue((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 1 + "'", obj8.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i70 == 2);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b90 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        int i4 = fixedOrderComparator2.getUnknownObjectBehavior();
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator2.add(obj5);
        int i7 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 10L);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = defaultedMap18.equals((java.lang.Object) fixedOrderComparator27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (byte) 0);
        java.util.Collection collection31 = defaultedMap18.values();
        java.lang.Object obj32 = defaultedMap5.remove((java.lang.Object) collection31);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 1 + "'", obj9.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 1 + "'", obj16.equals((short) 1));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 10L);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap1.put(obj18, (java.lang.Object) 10.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) i22);
        java.util.Set set24 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 1 + "'", obj11.equals((short) 1));
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 1 + "'", obj18.equals((short) 1));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) set16);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap20);
        java.util.Collection collection32 = defaultedMap7.values();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 10L);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 10L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        boolean b28 = fixedOrderComparator18.add((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b31 = defaultedMap30.isEmpty();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 10L);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate35);
        defaultedMap8.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        int i40 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(i40 == 0);
    }
}

