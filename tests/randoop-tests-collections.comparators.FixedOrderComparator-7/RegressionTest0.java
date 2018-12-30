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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1L));
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
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        try {
            int i5 = fixedOrderComparator0.compare((java.lang.Object) 0.0f, (java.lang.Object) fixedOrderComparator4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        try {
            int i5 = fixedOrderComparator0.compare((java.lang.Object) (byte) 1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        collections.PredicateUtils predicateUtils1 = new collections.PredicateUtils();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicateUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        try {
            int i8 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap6, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        try {
            java.util.Map map6 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            int i4 = fixedOrderComparator1.compare((java.lang.Object) 1.0d, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        try {
            int i18 = fixedOrderComparator0.compare((java.lang.Object) map13, (java.lang.Object) predicate16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array4 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        try {
            boolean b8 = fixedOrderComparator0.addAsEqual((java.lang.Object) obj_array4, (java.lang.Object) obj_array6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array1 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 100.0d);
        try {
            boolean b7 = fixedOrderComparator0.addAsEqual((java.lang.Object) 100.0d, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) predicate6);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj11 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100 + "'", obj12.equals(100));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) '4');
        boolean b15 = fixedOrderComparator12.isLocked();
        int i16 = fixedOrderComparator12.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) predicate19);
        boolean b21 = fixedOrderComparator12.add((java.lang.Object) predicate19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) '4');
        boolean b25 = fixedOrderComparator22.isLocked();
        int i26 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate29);
        boolean b31 = fixedOrderComparator22.add((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate19, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) '4');
        boolean b43 = fixedOrderComparator40.isLocked();
        int i44 = fixedOrderComparator40.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate47);
        boolean b49 = fixedOrderComparator40.add((java.lang.Object) predicate47);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator50.add((java.lang.Object) '4');
        boolean b53 = fixedOrderComparator50.isLocked();
        int i54 = fixedOrderComparator50.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        boolean b59 = fixedOrderComparator50.add((java.lang.Object) predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate47, predicate57);
        try {
            int i61 = fixedOrderComparator0.compare((java.lang.Object) predicate29, (java.lang.Object) predicate47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b5 = fixedOrderComparator0.add((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) '4');
        boolean b7 = fixedOrderComparator4.isLocked();
        int i8 = fixedOrderComparator4.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        boolean b13 = fixedOrderComparator4.add((java.lang.Object) predicate11);
        try {
            int i15 = fixedOrderComparator0.compare((java.lang.Object) predicate11, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        fixedOrderComparator1.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate8);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Set set15 = defaultedMap13.keySet();
        try {
            boolean b16 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b4 = fixedOrderComparator1.add((java.lang.Object) 100.0d);
        boolean b5 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 1);
        try {
            int i19 = fixedOrderComparator1.compare((java.lang.Object) defaultedMap7, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate21);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) '4');
        boolean b27 = fixedOrderComparator24.isLocked();
        int i28 = fixedOrderComparator24.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate31);
        boolean b33 = fixedOrderComparator24.add((java.lang.Object) predicate31);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator34.add((java.lang.Object) '4');
        boolean b37 = fixedOrderComparator34.isLocked();
        int i38 = fixedOrderComparator34.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        boolean b43 = fixedOrderComparator34.add((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate47);
        collections.Factory factory50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Collection collection8 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b4 = fixedOrderComparator1.add((java.lang.Object) 100.0d);
        boolean b5 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection8 = defaultedMap7.values();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) '4');
        boolean b15 = fixedOrderComparator12.isLocked();
        int i16 = fixedOrderComparator12.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) predicate19);
        boolean b21 = fixedOrderComparator12.add((java.lang.Object) predicate19);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection25 = defaultedMap24.values();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) '4');
        boolean b32 = fixedOrderComparator29.isLocked();
        int i33 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        boolean b38 = fixedOrderComparator29.add((java.lang.Object) predicate36);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate28, predicate36);
        java.lang.Object obj40 = defaultedMap7.get((java.lang.Object) predicate36);
        try {
            int i42 = fixedOrderComparator1.compare(obj40, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) '4');
        boolean b16 = fixedOrderComparator13.isLocked();
        int i17 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        boolean b22 = fixedOrderComparator13.add((java.lang.Object) predicate20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate20, predicate30);
        boolean b35 = defaultedMap7.equals((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) predicate19);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str25 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) 0);
        java.util.Set set32 = defaultedMap27.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj34 = defaultedMap9.get((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{10=-1}" + "'", str25.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        try {
            boolean b5 = fixedOrderComparator0.addAsEqual((java.lang.Object) (short) 100, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 0);
        java.util.Set set17 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator26.add((java.lang.Object) '4');
        boolean b29 = fixedOrderComparator26.isLocked();
        int i30 = fixedOrderComparator26.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate33);
        boolean b35 = fixedOrderComparator26.add((java.lang.Object) predicate33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) '4');
        boolean b39 = fixedOrderComparator36.isLocked();
        int i40 = fixedOrderComparator36.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) predicate43);
        boolean b45 = fixedOrderComparator36.add((java.lang.Object) predicate43);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate33, predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate43);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{10=-1}" + "'", str10.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection7 = defaultedMap6.values();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '4');
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate26);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) '4');
        boolean b32 = fixedOrderComparator29.isLocked();
        int i33 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        boolean b38 = fixedOrderComparator29.add((java.lang.Object) predicate36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) '4');
        boolean b42 = fixedOrderComparator39.isLocked();
        int i43 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) predicate46);
        boolean b48 = fixedOrderComparator39.add((java.lang.Object) predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate36, predicate46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate46, predicate52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) predicate59);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj64 = defaultedMap56.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str65 = defaultedMap56.toString();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) predicate68);
        java.lang.Object obj71 = defaultedMap67.remove((java.lang.Object) 0);
        java.util.Set set72 = defaultedMap67.entrySet();
        defaultedMap56.putAll((java.util.Map) defaultedMap67);
        try {
            int i74 = fixedOrderComparator0.compare((java.lang.Object) map54, (java.lang.Object) defaultedMap56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{10=-1}" + "'", str65.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection19 = defaultedMap18.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicate38);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) '4');
        boolean b44 = fixedOrderComparator41.isLocked();
        int i45 = fixedOrderComparator41.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        boolean b50 = fixedOrderComparator41.add((java.lang.Object) predicate48);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b53 = fixedOrderComparator51.add((java.lang.Object) '4');
        boolean b54 = fixedOrderComparator51.isLocked();
        int i55 = fixedOrderComparator51.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) predicate58);
        boolean b60 = fixedOrderComparator51.add((java.lang.Object) predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate58, predicate64);
        boolean b67 = defaultedMap16.equals((java.lang.Object) predicate64);
        boolean b68 = defaultedMap9.containsValue((java.lang.Object) predicate64);
        collections.Transformer transformer69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate12);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Set set15 = defaultedMap11.keySet();
        int i16 = defaultedMap11.size();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100L);
        java.lang.Object[] obj_array24 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = defaultedMap19.equals((java.lang.Object) obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b28 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator27);
        try {
            fixedOrderComparator27.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate15, predicate16);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate(map17, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) "hi!");
        boolean b10 = fixedOrderComparator0.add((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate15);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        defaultedMap14.clear();
        java.util.Collection collection19 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100L);
        boolean b27 = defaultedMap21.equals((java.lang.Object) '#');
        try {
            int i28 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap14, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) '#');
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap10.isEmpty();
        int i12 = defaultedMap10.size();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate21);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj26 = defaultedMap18.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100L);
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = defaultedMap29.equals((java.lang.Object) obj_array34);
        java.util.Set set37 = defaultedMap29.entrySet();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap29);
        boolean b39 = defaultedMap18.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection19 = defaultedMap18.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicate38);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) '4');
        boolean b44 = fixedOrderComparator41.isLocked();
        int i45 = fixedOrderComparator41.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        boolean b50 = fixedOrderComparator41.add((java.lang.Object) predicate48);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b53 = fixedOrderComparator51.add((java.lang.Object) '4');
        boolean b54 = fixedOrderComparator51.isLocked();
        int i55 = fixedOrderComparator51.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) predicate58);
        boolean b60 = fixedOrderComparator51.add((java.lang.Object) predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate58, predicate64);
        boolean b67 = defaultedMap16.equals((java.lang.Object) predicate64);
        boolean b68 = defaultedMap9.containsValue((java.lang.Object) predicate64);
        java.lang.Object obj70 = defaultedMap9.get((java.lang.Object) 100);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        boolean b3 = fixedOrderComparator1.add((java.lang.Object) '4');
        boolean b4 = fixedOrderComparator1.isLocked();
        int i5 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) '4');
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator7.isLocked();
        try {
            boolean b13 = fixedOrderComparator0.addAsEqual((java.lang.Object) fixedOrderComparator1, (java.lang.Object) fixedOrderComparator7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) '4');
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) predicate14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) '4');
        boolean b20 = fixedOrderComparator17.isLocked();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        boolean b26 = fixedOrderComparator17.add((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        boolean b29 = defaultedMap1.equals((java.lang.Object) 100.0d);
        int i30 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Set set7 = defaultedMap5.keySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) b11);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100 + "'", obj12.equals(100));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b4 = fixedOrderComparator1.add((java.lang.Object) 100.0d);
        int i5 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.equals((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) '4');
        boolean b16 = fixedOrderComparator13.isLocked();
        int i17 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        boolean b22 = fixedOrderComparator13.add((java.lang.Object) predicate20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate20, predicate30);
        java.util.Collection collection34 = defaultedMap7.values();
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) collection34);
        boolean b36 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate21);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) '4');
        boolean b27 = fixedOrderComparator24.isLocked();
        int i28 = fixedOrderComparator24.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate31);
        boolean b33 = fixedOrderComparator24.add((java.lang.Object) predicate31);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator34.add((java.lang.Object) '4');
        boolean b37 = fixedOrderComparator34.isLocked();
        int i38 = fixedOrderComparator34.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        boolean b43 = fixedOrderComparator34.add((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate41);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        java.util.Set set46 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Set set7 = defaultedMap5.keySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = defaultedMap1.equals((java.lang.Object) obj_array6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection11 = defaultedMap10.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) predicate12);
        boolean b14 = defaultedMap1.equals((java.lang.Object) predicate12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) '4');
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0L);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.equals((java.lang.Object) predicate9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b10);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Set set7 = defaultedMap5.keySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap10.isEmpty();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) "hi!");
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.String str15 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate15);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str21 = defaultedMap12.toString();
        java.util.Collection collection22 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Set set30 = defaultedMap26.keySet();
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) set30);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{10=-1}" + "'", str21.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b17 = defaultedMap16.isEmpty();
        int i18 = defaultedMap16.size();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) i18);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.equals((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) '4');
        boolean b16 = fixedOrderComparator13.isLocked();
        int i17 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        boolean b22 = fixedOrderComparator13.add((java.lang.Object) predicate20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate20, predicate30);
        java.util.Collection collection34 = defaultedMap7.values();
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicate38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100L);
        boolean b43 = defaultedMap37.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.util.Set set51 = defaultedMap47.keySet();
        int i52 = defaultedMap47.size();
        boolean b53 = defaultedMap37.containsValue((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) predicate56);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 100L);
        java.lang.Object[] obj_array60 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        boolean b62 = defaultedMap55.equals((java.lang.Object) obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array60);
        boolean b64 = defaultedMap37.equals((java.lang.Object) fixedOrderComparator63);
        boolean b65 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) '4');
        boolean b16 = fixedOrderComparator13.isLocked();
        int i17 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        boolean b22 = fixedOrderComparator13.add((java.lang.Object) predicate20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate20, predicate30);
        boolean b35 = defaultedMap7.equals((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) '4');
        boolean b47 = fixedOrderComparator44.isLocked();
        int i48 = fixedOrderComparator44.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) predicate51);
        boolean b53 = fixedOrderComparator44.add((java.lang.Object) predicate51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        boolean b56 = fixedOrderComparator54.add((java.lang.Object) '4');
        boolean b57 = fixedOrderComparator54.isLocked();
        int i58 = fixedOrderComparator54.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) predicate61);
        boolean b63 = fixedOrderComparator54.add((java.lang.Object) predicate61);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate51, predicate61);
        boolean b66 = defaultedMap38.equals((java.lang.Object) 100.0d);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 1.0f);
        boolean b69 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) '4');
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) predicate14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) '4');
        boolean b20 = fixedOrderComparator17.isLocked();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        boolean b26 = fixedOrderComparator17.add((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        boolean b29 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100L);
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = defaultedMap31.equals((java.lang.Object) obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) fixedOrderComparator39);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = defaultedMap6.equals((java.lang.Object) obj_array11);
        java.util.Set set14 = defaultedMap6.entrySet();
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate21);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) '4');
        boolean b27 = fixedOrderComparator24.isLocked();
        int i28 = fixedOrderComparator24.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate31);
        boolean b33 = fixedOrderComparator24.add((java.lang.Object) predicate31);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator34.add((java.lang.Object) '4');
        boolean b37 = fixedOrderComparator34.isLocked();
        int i38 = fixedOrderComparator34.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        boolean b43 = fixedOrderComparator34.add((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate47);
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate(map49, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap3.remove(obj15);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i7 = fixedOrderComparator0.compare((java.lang.Object) obj_array3, (java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b9 = fixedOrderComparator8.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        boolean b10 = defaultedMap3.isEmpty();
        int i11 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) '#');
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) '4');
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) predicate14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) '4');
        boolean b20 = fixedOrderComparator17.isLocked();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        boolean b26 = fixedOrderComparator17.add((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate32);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        boolean b41 = defaultedMap37.equals((java.lang.Object) predicate40);
        java.lang.Object obj42 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate(map27, (java.lang.Object) map45);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100 + "'", obj42.equals(100));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) '4');
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) predicate14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) '4');
        boolean b20 = fixedOrderComparator17.isLocked();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        boolean b26 = fixedOrderComparator17.add((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        boolean b29 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Collection collection30 = defaultedMap1.values();
        java.lang.String str31 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate12);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Set set15 = defaultedMap11.keySet();
        int i16 = defaultedMap11.size();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate22);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.equals((java.lang.Object) predicate30);
        java.lang.Object obj32 = defaultedMap21.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection37 = defaultedMap36.values();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) '4');
        boolean b44 = fixedOrderComparator41.isLocked();
        int i45 = fixedOrderComparator41.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        boolean b50 = fixedOrderComparator41.add((java.lang.Object) predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) predicate56);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator();
        boolean b61 = fixedOrderComparator59.add((java.lang.Object) '4');
        boolean b62 = fixedOrderComparator59.isLocked();
        int i63 = fixedOrderComparator59.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) predicate66);
        boolean b68 = fixedOrderComparator59.add((java.lang.Object) predicate66);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b71 = fixedOrderComparator69.add((java.lang.Object) '4');
        boolean b72 = fixedOrderComparator69.isLocked();
        int i73 = fixedOrderComparator69.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) predicate76);
        boolean b78 = fixedOrderComparator69.add((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate66, predicate76);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate76, predicate82);
        boolean b85 = defaultedMap34.equals((java.lang.Object) predicate82);
        boolean b86 = defaultedMap27.containsValue((java.lang.Object) predicate82);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = defaultedMap1.equals((java.lang.Object) obj_array6);
        java.util.Set set9 = defaultedMap1.entrySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Set set19 = defaultedMap15.keySet();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        java.util.Set set15 = defaultedMap1.keySet();
        java.lang.Object[] obj_array16 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator27.add((java.lang.Object) '4');
        boolean b30 = fixedOrderComparator27.isLocked();
        int i31 = fixedOrderComparator27.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        boolean b36 = fixedOrderComparator27.add((java.lang.Object) predicate34);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b39 = fixedOrderComparator37.add((java.lang.Object) '4');
        boolean b40 = fixedOrderComparator37.isLocked();
        int i41 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        boolean b46 = fixedOrderComparator37.add((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate34, predicate44);
        boolean b48 = fixedOrderComparator19.add((java.lang.Object) predicate44);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate44);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        int i16 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection7 = defaultedMap6.values();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '4');
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate26);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) '4');
        boolean b32 = fixedOrderComparator29.isLocked();
        int i33 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        boolean b38 = fixedOrderComparator29.add((java.lang.Object) predicate36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) '4');
        boolean b42 = fixedOrderComparator39.isLocked();
        int i43 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) predicate46);
        boolean b48 = fixedOrderComparator39.add((java.lang.Object) predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate36, predicate46);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator50.add((java.lang.Object) '4');
        boolean b53 = fixedOrderComparator50.isLocked();
        int i54 = fixedOrderComparator50.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        boolean b59 = fixedOrderComparator50.add((java.lang.Object) predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map21, predicate36, predicate57);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) map21);
        collections.Factory factory62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate(map21, factory62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection17 = defaultedMap16.values();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator21.add((java.lang.Object) '4');
        boolean b24 = fixedOrderComparator21.isLocked();
        int i25 = fixedOrderComparator21.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate28);
        boolean b30 = fixedOrderComparator21.add((java.lang.Object) predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) '4');
        boolean b42 = fixedOrderComparator39.isLocked();
        int i43 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) predicate46);
        boolean b48 = fixedOrderComparator39.add((java.lang.Object) predicate46);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        boolean b51 = fixedOrderComparator49.add((java.lang.Object) '4');
        boolean b52 = fixedOrderComparator49.isLocked();
        int i53 = fixedOrderComparator49.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) predicate56);
        boolean b58 = fixedOrderComparator49.add((java.lang.Object) predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate46, predicate56);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate56, predicate62);
        boolean b65 = defaultedMap14.equals((java.lang.Object) predicate62);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) predicate70);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.lang.Object obj75 = defaultedMap67.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection78 = defaultedMap77.values();
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj80 = defaultedMap77.remove((java.lang.Object) predicate79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap82.equals((java.lang.Object) predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate79, predicate85);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate62, predicate85);
        boolean b89 = defaultedMap3.containsKey((java.lang.Object) predicate62);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate12);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Set set15 = defaultedMap11.keySet();
        int i16 = defaultedMap11.size();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100L);
        java.lang.Object[] obj_array24 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = defaultedMap19.equals((java.lang.Object) obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b28 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator27);
        java.lang.String str29 = defaultedMap1.toString();
        boolean b30 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) '4');
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) predicate14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) '4');
        boolean b20 = fixedOrderComparator17.isLocked();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        boolean b26 = fixedOrderComparator17.add((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate(map27, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection19 = defaultedMap18.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) predicate30);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        boolean b45 = fixedOrderComparator42.isLocked();
        int i46 = fixedOrderComparator42.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate49);
        boolean b51 = fixedOrderComparator42.add((java.lang.Object) predicate49);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator();
        boolean b62 = fixedOrderComparator60.add((java.lang.Object) '4');
        boolean b63 = fixedOrderComparator60.isLocked();
        int i64 = fixedOrderComparator60.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) predicate67);
        boolean b69 = fixedOrderComparator60.add((java.lang.Object) predicate67);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        boolean b72 = fixedOrderComparator70.add((java.lang.Object) '4');
        boolean b73 = fixedOrderComparator70.isLocked();
        int i74 = fixedOrderComparator70.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) predicate77);
        boolean b79 = fixedOrderComparator70.add((java.lang.Object) predicate77);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate67, predicate77);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate77, predicate83);
        java.lang.Object obj86 = defaultedMap1.put(obj35, (java.lang.Object) predicate83);
        java.util.Set set87 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i74 == 2);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 0);
        java.util.Set set17 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b21 = defaultedMap20.isEmpty();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection26 = defaultedMap25.values();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) '4');
        boolean b33 = fixedOrderComparator30.isLocked();
        int i34 = fixedOrderComparator30.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        boolean b39 = fixedOrderComparator30.add((java.lang.Object) predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate45);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator48.add((java.lang.Object) '4');
        boolean b51 = fixedOrderComparator48.isLocked();
        int i52 = fixedOrderComparator48.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        boolean b57 = fixedOrderComparator48.add((java.lang.Object) predicate55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b60 = fixedOrderComparator58.add((java.lang.Object) '4');
        boolean b61 = fixedOrderComparator58.isLocked();
        int i62 = fixedOrderComparator58.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) predicate65);
        boolean b67 = fixedOrderComparator58.add((java.lang.Object) predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate55, predicate65);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b71 = fixedOrderComparator69.add((java.lang.Object) '4');
        boolean b72 = fixedOrderComparator69.isLocked();
        int i73 = fixedOrderComparator69.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) predicate76);
        boolean b78 = fixedOrderComparator69.add((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate(map40, predicate55, predicate76);
        java.lang.Object obj80 = defaultedMap20.get((java.lang.Object) map40);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap85, (java.lang.Object) predicate86);
        defaultedMap83.putAll((java.util.Map) defaultedMap85);
        java.util.Set set89 = defaultedMap85.keySet();
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap85);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{10=-1}" + "'", str10.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 2);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 100 + "'", obj80.equals(100));
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) set6);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = defaultedMap1.equals((java.lang.Object) obj_array6);
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set10 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) '4');
        boolean b20 = fixedOrderComparator17.isLocked();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        boolean b26 = fixedOrderComparator17.add((java.lang.Object) predicate24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator27.add((java.lang.Object) '4');
        boolean b30 = fixedOrderComparator27.isLocked();
        int i31 = fixedOrderComparator27.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        boolean b36 = fixedOrderComparator27.add((java.lang.Object) predicate34);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate24, predicate34);
        java.util.Collection collection38 = defaultedMap11.values();
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) collection38);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) '4');
        boolean b19 = fixedOrderComparator16.isLocked();
        int i20 = fixedOrderComparator16.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        boolean b25 = fixedOrderComparator16.add((java.lang.Object) predicate23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator26.add((java.lang.Object) '4');
        boolean b29 = fixedOrderComparator26.isLocked();
        int i30 = fixedOrderComparator26.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate33);
        boolean b35 = fixedOrderComparator26.add((java.lang.Object) predicate33);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate23, predicate33);
        boolean b38 = defaultedMap10.equals((java.lang.Object) 100.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b40 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate21);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) '4');
        boolean b27 = fixedOrderComparator24.isLocked();
        int i28 = fixedOrderComparator24.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate31);
        boolean b33 = fixedOrderComparator24.add((java.lang.Object) predicate31);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator34.add((java.lang.Object) '4');
        boolean b37 = fixedOrderComparator34.isLocked();
        int i38 = fixedOrderComparator34.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate41);
        boolean b43 = fixedOrderComparator34.add((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate41);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        int i46 = defaultedMap1.size();
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str26 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate29);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) 0);
        java.util.Set set33 = defaultedMap28.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection37 = defaultedMap36.values();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) '4');
        boolean b44 = fixedOrderComparator41.isLocked();
        int i45 = fixedOrderComparator41.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        boolean b50 = fixedOrderComparator41.add((java.lang.Object) predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) predicate56);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator();
        boolean b61 = fixedOrderComparator59.add((java.lang.Object) '4');
        boolean b62 = fixedOrderComparator59.isLocked();
        int i63 = fixedOrderComparator59.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) predicate66);
        boolean b68 = fixedOrderComparator59.add((java.lang.Object) predicate66);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b71 = fixedOrderComparator69.add((java.lang.Object) '4');
        boolean b72 = fixedOrderComparator69.isLocked();
        int i73 = fixedOrderComparator69.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) predicate76);
        boolean b78 = fixedOrderComparator69.add((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate66, predicate76);
        defaultedMap36.putAll((java.util.Map) defaultedMap53);
        defaultedMap28.putAll((java.util.Map) defaultedMap53);
        boolean b82 = defaultedMap15.containsKey((java.lang.Object) defaultedMap53);
        java.util.Set set83 = defaultedMap53.keySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{10=-1}" + "'", str26.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set83);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str26 = defaultedMap17.toString();
        java.util.Collection collection27 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate32);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        boolean b36 = defaultedMap17.containsValue((java.lang.Object) set35);
        java.lang.String str37 = defaultedMap17.toString();
        java.lang.Object obj38 = defaultedMap15.get((java.lang.Object) str37);
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{10=-1}" + "'", str26.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{10=-1}" + "'", str37.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = defaultedMap1.equals((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        try {
            int i15 = fixedOrderComparator9.compare((java.lang.Object) 0.0f, (java.lang.Object) fixedOrderComparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        fixedOrderComparator1.setUnknownObjectBehavior(0);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) '4');
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate14);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) predicate14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) '4');
        boolean b20 = fixedOrderComparator17.isLocked();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        boolean b26 = fixedOrderComparator17.add((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate24);
        boolean b29 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 0);
        java.util.Set set17 = defaultedMap12.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b21 = defaultedMap20.isEmpty();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection26 = defaultedMap25.values();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) '4');
        boolean b33 = fixedOrderComparator30.isLocked();
        int i34 = fixedOrderComparator30.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        boolean b39 = fixedOrderComparator30.add((java.lang.Object) predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate45);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator48.add((java.lang.Object) '4');
        boolean b51 = fixedOrderComparator48.isLocked();
        int i52 = fixedOrderComparator48.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        boolean b57 = fixedOrderComparator48.add((java.lang.Object) predicate55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b60 = fixedOrderComparator58.add((java.lang.Object) '4');
        boolean b61 = fixedOrderComparator58.isLocked();
        int i62 = fixedOrderComparator58.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) predicate65);
        boolean b67 = fixedOrderComparator58.add((java.lang.Object) predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate55, predicate65);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b71 = fixedOrderComparator69.add((java.lang.Object) '4');
        boolean b72 = fixedOrderComparator69.isLocked();
        int i73 = fixedOrderComparator69.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) predicate76);
        boolean b78 = fixedOrderComparator69.add((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate(map40, predicate55, predicate76);
        java.lang.Object obj80 = defaultedMap20.get((java.lang.Object) map40);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection82 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{10=-1}" + "'", str10.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 2);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 100 + "'", obj80.equals(100));
        org.junit.Assert.assertNotNull(collection82);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        java.util.Set set15 = defaultedMap1.keySet();
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection16 = defaultedMap15.values();
        java.util.Set set17 = defaultedMap15.keySet();
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b21 = defaultedMap20.isEmpty();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) "hi!");
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap15);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) map18);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map18, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        int i3 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str10 = defaultedMap1.toString();
        java.util.Collection collection11 = defaultedMap1.values();
        java.lang.String str12 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{10=-1}" + "'", str10.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{10=-1}" + "'", str12.equals("{10=-1}"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i5 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i6 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) "hi!");
        boolean b10 = fixedOrderComparator0.add((java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection5 = defaultedMap4.values();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) '4');
        boolean b12 = fixedOrderComparator9.isLocked();
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate16);
        boolean b18 = fixedOrderComparator9.add((java.lang.Object) predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate24);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator27.add((java.lang.Object) '4');
        boolean b30 = fixedOrderComparator27.isLocked();
        int i31 = fixedOrderComparator27.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        boolean b36 = fixedOrderComparator27.add((java.lang.Object) predicate34);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b39 = fixedOrderComparator37.add((java.lang.Object) '4');
        boolean b40 = fixedOrderComparator37.isLocked();
        int i41 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate44);
        boolean b46 = fixedOrderComparator37.add((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate34, predicate44);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate44, predicate50);
        boolean b53 = defaultedMap2.equals((java.lang.Object) predicate50);
        try {
            int i55 = fixedOrderComparator0.compare((java.lang.Object) predicate50, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate8);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '4');
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator21.add((java.lang.Object) '4');
        boolean b24 = fixedOrderComparator21.isLocked();
        int i25 = fixedOrderComparator21.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate28);
        boolean b30 = fixedOrderComparator21.add((java.lang.Object) predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate18, predicate28);
        boolean b32 = fixedOrderComparator3.add((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicate35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100L);
        boolean b40 = defaultedMap34.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate45);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Set set48 = defaultedMap44.keySet();
        int i49 = defaultedMap44.size();
        boolean b50 = defaultedMap34.containsValue((java.lang.Object) defaultedMap44);
        try {
            boolean b52 = fixedOrderComparator3.addAsEqual((java.lang.Object) defaultedMap34, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap7.isEmpty();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = defaultedMap7.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) '4');
        boolean b36 = fixedOrderComparator33.isLocked();
        int i37 = fixedOrderComparator33.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) predicate40);
        boolean b42 = fixedOrderComparator33.add((java.lang.Object) predicate40);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate30, predicate40);
        defaultedMap7.putAll(map43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) 0);
        java.util.Set set51 = defaultedMap46.entrySet();
        boolean b52 = defaultedMap46.isEmpty();
        boolean b53 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) predicate58);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        boolean b63 = fixedOrderComparator61.add((java.lang.Object) '4');
        boolean b64 = fixedOrderComparator61.isLocked();
        int i65 = fixedOrderComparator61.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) predicate68);
        boolean b70 = fixedOrderComparator61.add((java.lang.Object) predicate68);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator();
        boolean b73 = fixedOrderComparator71.add((java.lang.Object) '4');
        boolean b74 = fixedOrderComparator71.isLocked();
        int i75 = fixedOrderComparator71.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) predicate78);
        boolean b80 = fixedOrderComparator71.add((java.lang.Object) predicate78);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate68, predicate78);
        boolean b83 = defaultedMap55.equals((java.lang.Object) 100.0d);
        defaultedMap46.putAll((java.util.Map) defaultedMap55);
        try {
            boolean b85 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i75 == 2);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.equals((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) predicate7);
        int i10 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            boolean b13 = fixedOrderComparator0.addAsEqual((java.lang.Object) 1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) predicate7);
        int i10 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b11 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i7 = fixedOrderComparator0.compare((java.lang.Object) obj_array3, (java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) predicate19);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Set set22 = defaultedMap18.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100L);
        boolean b31 = defaultedMap25.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Set set39 = defaultedMap35.keySet();
        int i40 = defaultedMap35.size();
        boolean b41 = defaultedMap25.containsValue((java.lang.Object) defaultedMap35);
        java.lang.Object obj42 = defaultedMap18.get((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate45);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) 0);
        java.util.Set set49 = defaultedMap44.entrySet();
        boolean b50 = defaultedMap44.isEmpty();
        boolean b51 = defaultedMap44.isEmpty();
        java.util.Collection collection52 = defaultedMap44.values();
        try {
            boolean b53 = fixedOrderComparator8.addAsEqual((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100 + "'", obj42.equals(100));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) 0);
        java.util.Set set14 = defaultedMap9.entrySet();
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection18 = defaultedMap17.values();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) '4');
        boolean b25 = fixedOrderComparator22.isLocked();
        int i26 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate29);
        boolean b31 = fixedOrderComparator22.add((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) '4');
        boolean b43 = fixedOrderComparator40.isLocked();
        int i44 = fixedOrderComparator40.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate47);
        boolean b49 = fixedOrderComparator40.add((java.lang.Object) predicate47);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator50.add((java.lang.Object) '4');
        boolean b53 = fixedOrderComparator50.isLocked();
        int i54 = fixedOrderComparator50.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        boolean b59 = fixedOrderComparator50.add((java.lang.Object) predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate47, predicate57);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        boolean b63 = fixedOrderComparator61.add((java.lang.Object) '4');
        boolean b64 = fixedOrderComparator61.isLocked();
        int i65 = fixedOrderComparator61.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) predicate68);
        boolean b70 = fixedOrderComparator61.add((java.lang.Object) predicate68);
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map32, predicate47, predicate68);
        java.lang.Object obj73 = defaultedMap9.put((java.lang.Object) map71, (java.lang.Object) 1.0d);
        java.util.Set set74 = defaultedMap9.keySet();
        boolean b75 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        boolean b20 = defaultedMap16.equals((java.lang.Object) predicate19);
        java.lang.Object obj21 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection26 = defaultedMap25.values();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) '4');
        boolean b33 = fixedOrderComparator30.isLocked();
        int i34 = fixedOrderComparator30.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        boolean b39 = fixedOrderComparator30.add((java.lang.Object) predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate45);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator48.add((java.lang.Object) '4');
        boolean b51 = fixedOrderComparator48.isLocked();
        int i52 = fixedOrderComparator48.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate55);
        boolean b57 = fixedOrderComparator48.add((java.lang.Object) predicate55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b60 = fixedOrderComparator58.add((java.lang.Object) '4');
        boolean b61 = fixedOrderComparator58.isLocked();
        int i62 = fixedOrderComparator58.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) predicate65);
        boolean b67 = fixedOrderComparator58.add((java.lang.Object) predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate55, predicate65);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate65, predicate71);
        boolean b74 = defaultedMap23.equals((java.lang.Object) predicate71);
        boolean b75 = defaultedMap16.containsValue((java.lang.Object) predicate71);
        java.lang.Object obj77 = defaultedMap16.get((java.lang.Object) 100);
        boolean b78 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection81 = defaultedMap80.values();
        defaultedMap16.putAll((java.util.Map) defaultedMap80);
        java.util.Set set83 = defaultedMap16.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 2);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 100 + "'", obj77.equals(100));
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(set83);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i7 = fixedOrderComparator0.compare((java.lang.Object) obj_array3, (java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj18 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str19 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 0);
        java.util.Set set26 = defaultedMap21.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) 0);
        java.util.Set set34 = defaultedMap29.entrySet();
        boolean b35 = defaultedMap29.isEmpty();
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.util.Set set38 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        try {
            boolean b40 = fixedOrderComparator8.addAsEqual((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{10=-1}" + "'", str19.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        boolean b16 = defaultedMap10.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate21);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Set set24 = defaultedMap20.keySet();
        int i25 = defaultedMap20.size();
        boolean b26 = defaultedMap10.containsValue((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100L);
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = defaultedMap28.equals((java.lang.Object) obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b37 = defaultedMap10.equals((java.lang.Object) fixedOrderComparator36);
        defaultedMap10.clear();
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap10.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) predicate7);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) predicate6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate15);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj18 = defaultedMap5.remove((java.lang.Object) defaultedMap12);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection7 = defaultedMap6.values();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '4');
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate26);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) '4');
        boolean b32 = fixedOrderComparator29.isLocked();
        int i33 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        boolean b38 = fixedOrderComparator29.add((java.lang.Object) predicate36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) '4');
        boolean b42 = fixedOrderComparator39.isLocked();
        int i43 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) predicate46);
        boolean b48 = fixedOrderComparator39.add((java.lang.Object) predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate36, predicate46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate46, predicate52);
        boolean b55 = defaultedMap4.equals((java.lang.Object) predicate52);
        try {
            int i57 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap4, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection7 = defaultedMap6.values();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '4');
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate26);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) '4');
        boolean b32 = fixedOrderComparator29.isLocked();
        int i33 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate36);
        boolean b38 = fixedOrderComparator29.add((java.lang.Object) predicate36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) '4');
        boolean b42 = fixedOrderComparator39.isLocked();
        int i43 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) predicate46);
        boolean b48 = fixedOrderComparator39.add((java.lang.Object) predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate36, predicate46);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator50.add((java.lang.Object) '4');
        boolean b53 = fixedOrderComparator50.isLocked();
        int i54 = fixedOrderComparator50.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        boolean b59 = fixedOrderComparator50.add((java.lang.Object) predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map21, predicate36, predicate57);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) map21);
        java.lang.Object obj63 = defaultedMap1.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) predicate66);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) predicate74);
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        java.util.Set set77 = defaultedMap73.keySet();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) defaultedMap73);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap65);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100 + "'", obj63.equals(100));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection14 = defaultedMap13.values();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) '4');
        boolean b21 = fixedOrderComparator18.isLocked();
        int i22 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicate25);
        boolean b27 = fixedOrderComparator18.add((java.lang.Object) predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate33);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) '4');
        boolean b39 = fixedOrderComparator36.isLocked();
        int i40 = fixedOrderComparator36.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) predicate43);
        boolean b45 = fixedOrderComparator36.add((java.lang.Object) predicate43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) '4');
        boolean b49 = fixedOrderComparator46.isLocked();
        int i50 = fixedOrderComparator46.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) predicate53);
        boolean b55 = fixedOrderComparator46.add((java.lang.Object) predicate53);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate43, predicate53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate53, predicate59);
        boolean b62 = defaultedMap11.equals((java.lang.Object) predicate59);
        boolean b63 = defaultedMap1.containsValue((java.lang.Object) b62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) predicate68);
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator();
        boolean b73 = fixedOrderComparator71.add((java.lang.Object) '4');
        boolean b74 = fixedOrderComparator71.isLocked();
        int i75 = fixedOrderComparator71.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) predicate78);
        boolean b80 = fixedOrderComparator71.add((java.lang.Object) predicate78);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator();
        boolean b83 = fixedOrderComparator81.add((java.lang.Object) '4');
        boolean b84 = fixedOrderComparator81.isLocked();
        int i85 = fixedOrderComparator81.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap87, (java.lang.Object) predicate88);
        boolean b90 = fixedOrderComparator81.add((java.lang.Object) predicate88);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate78, predicate88);
        boolean b93 = defaultedMap65.equals((java.lang.Object) (short) 10);
        java.util.Collection collection94 = defaultedMap65.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap65);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i75 == 2);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(i85 == 2);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(collection94);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate8);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '4');
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator21.add((java.lang.Object) '4');
        boolean b24 = fixedOrderComparator21.isLocked();
        int i25 = fixedOrderComparator21.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate28);
        boolean b30 = fixedOrderComparator21.add((java.lang.Object) predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate18, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        boolean b45 = fixedOrderComparator42.isLocked();
        int i46 = fixedOrderComparator42.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate49);
        boolean b51 = fixedOrderComparator42.add((java.lang.Object) predicate49);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator();
        boolean b62 = fixedOrderComparator60.add((java.lang.Object) '4');
        boolean b63 = fixedOrderComparator60.isLocked();
        int i64 = fixedOrderComparator60.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) predicate67);
        boolean b69 = fixedOrderComparator60.add((java.lang.Object) predicate67);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        boolean b72 = fixedOrderComparator70.add((java.lang.Object) '4');
        boolean b73 = fixedOrderComparator70.isLocked();
        int i74 = fixedOrderComparator70.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) predicate77);
        boolean b79 = fixedOrderComparator70.add((java.lang.Object) predicate77);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate67, predicate77);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate77, predicate83);
        java.util.Map map86 = collections.map.PredicatedMap.decorate(map31, predicate34, predicate83);
        java.lang.Object obj87 = defaultedMap1.remove((java.lang.Object) map31);
        boolean b88 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i74 == 2);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) predicate7);
        int i10 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate15);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) '4');
        boolean b21 = fixedOrderComparator18.isLocked();
        int i22 = fixedOrderComparator18.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicate25);
        boolean b27 = fixedOrderComparator18.add((java.lang.Object) predicate25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator28.add((java.lang.Object) '4');
        boolean b31 = fixedOrderComparator28.isLocked();
        int i32 = fixedOrderComparator28.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicate35);
        boolean b37 = fixedOrderComparator28.add((java.lang.Object) predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate35);
        java.util.Collection collection39 = defaultedMap12.values();
        boolean b40 = fixedOrderComparator0.add((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection19 = defaultedMap18.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) predicate30);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        boolean b45 = fixedOrderComparator42.isLocked();
        int i46 = fixedOrderComparator42.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate49);
        boolean b51 = fixedOrderComparator42.add((java.lang.Object) predicate49);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator();
        boolean b62 = fixedOrderComparator60.add((java.lang.Object) '4');
        boolean b63 = fixedOrderComparator60.isLocked();
        int i64 = fixedOrderComparator60.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) predicate67);
        boolean b69 = fixedOrderComparator60.add((java.lang.Object) predicate67);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        boolean b72 = fixedOrderComparator70.add((java.lang.Object) '4');
        boolean b73 = fixedOrderComparator70.isLocked();
        int i74 = fixedOrderComparator70.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) predicate77);
        boolean b79 = fixedOrderComparator70.add((java.lang.Object) predicate77);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate67, predicate77);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate77, predicate83);
        java.lang.Object obj86 = defaultedMap1.put(obj35, (java.lang.Object) predicate83);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap88, (java.lang.Object) predicate89);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap88, (java.lang.Object) 100L);
        java.util.Set set93 = defaultedMap88.keySet();
        java.lang.Object obj94 = defaultedMap1.get((java.lang.Object) defaultedMap88);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i74 == 2);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + 100 + "'", obj94.equals(100));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b4 = fixedOrderComparator1.add((java.lang.Object) 100.0d);
        boolean b5 = fixedOrderComparator1.isLocked();
        boolean b6 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj16 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str17 = defaultedMap8.toString();
        try {
            boolean b19 = fixedOrderComparator1.addAsEqual((java.lang.Object) str17, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{10=-1}" + "'", str17.equals("{10=-1}"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) "hi!");
        boolean b10 = fixedOrderComparator0.add((java.lang.Object) defaultedMap6);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 0L);
        defaultedMap6.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate7);
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate15);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str21 = defaultedMap12.toString();
        java.util.Collection collection22 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate27);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Set set30 = defaultedMap26.keySet();
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) set30);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) predicate37);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj42 = defaultedMap34.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str43 = defaultedMap34.toString();
        java.util.Collection collection44 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate49);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.util.Set set52 = defaultedMap48.keySet();
        boolean b53 = defaultedMap34.containsValue((java.lang.Object) set52);
        java.lang.String str54 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        boolean b60 = defaultedMap56.equals((java.lang.Object) predicate59);
        int i61 = defaultedMap56.size();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap56);
        boolean b63 = defaultedMap1.equals((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{10=-1}" + "'", str21.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{10=-1}" + "'", str43.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{10=-1}" + "'", str54.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        boolean b9 = defaultedMap1.isEmpty();
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        boolean b8 = defaultedMap4.equals((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) '4');
        boolean b19 = fixedOrderComparator16.isLocked();
        int i20 = fixedOrderComparator16.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate23);
        boolean b25 = fixedOrderComparator16.add((java.lang.Object) predicate23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator26.add((java.lang.Object) '4');
        boolean b29 = fixedOrderComparator26.isLocked();
        int i30 = fixedOrderComparator26.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate33);
        boolean b35 = fixedOrderComparator26.add((java.lang.Object) predicate33);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate23, predicate33);
        java.util.Collection collection37 = defaultedMap10.values();
        boolean b38 = defaultedMap4.containsValue((java.lang.Object) collection37);
        boolean b39 = fixedOrderComparator0.add((java.lang.Object) b38);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) '4');
        boolean b3 = fixedOrderComparator0.isLocked();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) '4');
        boolean b9 = fixedOrderComparator6.isLocked();
        int i10 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate13);
        boolean b15 = fixedOrderComparator6.add((java.lang.Object) predicate13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { predicate13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        try {
            boolean b18 = fixedOrderComparator0.addAsEqual((java.lang.Object) (byte) -1, (java.lang.Object) fixedOrderComparator17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.equals((java.lang.Object) predicate12);
        java.lang.Object obj14 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate20);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str26 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate29);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) 0);
        java.util.Set set33 = defaultedMap28.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection37 = defaultedMap36.values();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) '4');
        boolean b44 = fixedOrderComparator41.isLocked();
        int i45 = fixedOrderComparator41.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        boolean b50 = fixedOrderComparator41.add((java.lang.Object) predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) predicate56);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator();
        boolean b61 = fixedOrderComparator59.add((java.lang.Object) '4');
        boolean b62 = fixedOrderComparator59.isLocked();
        int i63 = fixedOrderComparator59.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) predicate66);
        boolean b68 = fixedOrderComparator59.add((java.lang.Object) predicate66);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b71 = fixedOrderComparator69.add((java.lang.Object) '4');
        boolean b72 = fixedOrderComparator69.isLocked();
        int i73 = fixedOrderComparator69.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) predicate76);
        boolean b78 = fixedOrderComparator69.add((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate66, predicate76);
        defaultedMap36.putAll((java.util.Map) defaultedMap53);
        defaultedMap28.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj82 = defaultedMap3.get((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{10=-1}" + "'", str26.equals("{10=-1}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 100 + "'", obj82.equals(100));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate8);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '4');
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicate18);
        boolean b20 = fixedOrderComparator11.add((java.lang.Object) predicate18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator21.add((java.lang.Object) '4');
        boolean b24 = fixedOrderComparator21.isLocked();
        int i25 = fixedOrderComparator21.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate28);
        boolean b30 = fixedOrderComparator21.add((java.lang.Object) predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate18, predicate28);
        boolean b32 = fixedOrderComparator3.add((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicate35);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) 0);
        java.util.Set set39 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) predicate42);
        java.lang.Object obj45 = defaultedMap41.remove((java.lang.Object) 0);
        java.util.Set set46 = defaultedMap41.entrySet();
        boolean b47 = defaultedMap41.isEmpty();
        boolean b48 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection51 = defaultedMap50.values();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap50.remove((java.lang.Object) predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        boolean b57 = fixedOrderComparator55.add((java.lang.Object) '4');
        boolean b58 = fixedOrderComparator55.isLocked();
        int i59 = fixedOrderComparator55.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) predicate62);
        boolean b64 = fixedOrderComparator55.add((java.lang.Object) predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) defaultedMap66);
        try {
            int i68 = fixedOrderComparator3.compare((java.lang.Object) defaultedMap34, (java.lang.Object) defaultedMap41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate4);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap13.isEmpty();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.util.Collection collection19 = defaultedMap18.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) '4');
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate30);
        boolean b32 = fixedOrderComparator23.add((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicate38);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) '4');
        boolean b44 = fixedOrderComparator41.isLocked();
        int i45 = fixedOrderComparator41.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicate48);
        boolean b50 = fixedOrderComparator41.add((java.lang.Object) predicate48);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b53 = fixedOrderComparator51.add((java.lang.Object) '4');
        boolean b54 = fixedOrderComparator51.isLocked();
        int i55 = fixedOrderComparator51.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) predicate58);
        boolean b60 = fixedOrderComparator51.add((java.lang.Object) predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate58);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        boolean b64 = fixedOrderComparator62.add((java.lang.Object) '4');
        boolean b65 = fixedOrderComparator62.isLocked();
        int i66 = fixedOrderComparator62.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) predicate69);
        boolean b71 = fixedOrderComparator62.add((java.lang.Object) predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map33, predicate48, predicate69);
        java.lang.Object obj73 = defaultedMap13.get((java.lang.Object) map33);
        java.lang.Object obj75 = defaultedMap13.get((java.lang.Object) 100);
        java.util.Map map76 = collections.map.DefaultedMap.decorate(map11, (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 2);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100 + "'", obj73.equals(100));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 100 + "'", obj75.equals(100));
        org.junit.Assert.assertNotNull(map76);
    }
}

