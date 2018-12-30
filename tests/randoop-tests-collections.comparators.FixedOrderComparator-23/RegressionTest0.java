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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 100);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        try {
            boolean b16 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b4 = fixedOrderComparator1.isLocked();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = null;
        boolean b8 = fixedOrderComparator6.add(obj7);
        boolean b9 = fixedOrderComparator6.isLocked();
        try {
            int i11 = fixedOrderComparator1.compare((java.lang.Object) fixedOrderComparator6, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b4 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1, (java.lang.Object) 10L);
        try {
            boolean b11 = fixedOrderComparator1.addAsEqual((java.lang.Object) 10L, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b4 = defaultedMap1.isEmpty();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        int i11 = defaultedMap7.size();
        defaultedMap7.clear();
        try {
            int i14 = fixedOrderComparator1.compare((java.lang.Object) defaultedMap7, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap14.equals(obj15);
        boolean b17 = defaultedMap9.equals((java.lang.Object) b16);
        try {
            boolean b19 = fixedOrderComparator1.addAsEqual((java.lang.Object) b17, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1 + "'", obj10.equals(1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 0L);
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        boolean b12 = fixedOrderComparator8.add((java.lang.Object) 0L);
        int i13 = fixedOrderComparator8.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap15.equals(obj16);
        try {
            boolean b18 = fixedOrderComparator1.addAsEqual((java.lang.Object) i13, (java.lang.Object) b17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        java.lang.Object[] obj_array4 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator5.add(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) (byte) 10);
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap17.equals(obj18);
        boolean b20 = defaultedMap17.isEmpty();
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        try {
            boolean b22 = fixedOrderComparator1.addAsEqual((java.lang.Object) fixedOrderComparator5, (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) (byte) 10);
        boolean b12 = defaultedMap5.equals((java.lang.Object) '#');
        int i13 = defaultedMap5.size();
        try {
            int i15 = fixedOrderComparator1.compare((java.lang.Object) i13, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1 + "'", obj10.equals(1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        try {
            boolean b27 = fixedOrderComparator24.addAsEqual((java.lang.Object) 100, (java.lang.Object) fixedOrderComparator26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap10);
        java.lang.Object[] obj_array15 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator16.isLocked();
        try {
            boolean b18 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap5, (java.lang.Object) fixedOrderComparator16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        boolean b13 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b17 = fixedOrderComparator13.add((java.lang.Object) 0L);
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection24 = defaultedMap20.values();
        boolean b25 = defaultedMap6.equals((java.lang.Object) defaultedMap20);
        int i26 = defaultedMap6.size();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        try {
            fixedOrderComparator25.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array1 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object obj3 = null;
        boolean b4 = fixedOrderComparator2.add(obj3);
        boolean b6 = fixedOrderComparator2.add((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) 0L);
        boolean b20 = defaultedMap15.equals((java.lang.Object) 1.0d);
        java.util.Set set21 = defaultedMap15.keySet();
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap15);
        try {
            int i23 = fixedOrderComparator0.compare((java.lang.Object) b6, (java.lang.Object) defaultedMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1 + "'", obj16.equals(1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b12 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj29 = defaultedMap23.get((java.lang.Object) defaultedMap28);
        boolean b30 = defaultedMap20.containsValue((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        int i47 = defaultedMap43.size();
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) (byte) 10);
        boolean b58 = defaultedMap51.equals((java.lang.Object) '#');
        int i59 = defaultedMap51.size();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { predicate39, defaultedMap43, 1.0d, i59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj64 = defaultedMap35.get((java.lang.Object) obj_array60);
        java.lang.Object obj65 = defaultedMap20.get((java.lang.Object) obj_array60);
        java.lang.Object obj66 = defaultedMap9.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj74 = defaultedMap68.get((java.lang.Object) defaultedMap73);
        boolean b76 = defaultedMap73.containsKey((java.lang.Object) 0L);
        boolean b78 = defaultedMap73.equals((java.lang.Object) 1.0d);
        java.util.Set set79 = defaultedMap73.keySet();
        java.lang.Object obj80 = defaultedMap20.get((java.lang.Object) set79);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1 + "'", obj21.equals(1));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1 + "'", obj56.equals(1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1 + "'", obj64.equals(1));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1 + "'", obj65.equals(1));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 1 + "'", obj66.equals(1));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1 + "'", obj74.equals(1));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 1 + "'", obj80.equals(1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 0L);
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b17 = fixedOrderComparator13.add((java.lang.Object) 0L);
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection24 = defaultedMap20.values();
        boolean b25 = defaultedMap6.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i31 = defaultedMap27.size();
        defaultedMap27.clear();
        java.util.Set set33 = defaultedMap27.entrySet();
        defaultedMap27.clear();
        java.lang.Object obj35 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        java.util.Collection collection36 = defaultedMap27.values();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        java.util.Set set12 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) defaultedMap6);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b27 = fixedOrderComparator26.isLocked();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap3.toString();
        java.util.Set set8 = defaultedMap3.keySet();
        java.util.Collection collection9 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        int i26 = fixedOrderComparator24.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        int i14 = defaultedMap10.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator16.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator16.add(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj20);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap29.size();
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        java.lang.Object[] obj_array37 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj39 = null;
        boolean b40 = fixedOrderComparator38.add(obj39);
        boolean b41 = fixedOrderComparator35.add(obj39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, obj39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate27);
        collections.Factory factory48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate(map47, factory48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap15.equals(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate18);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) map19);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate(map19, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b23 = defaultedMap13.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) 2);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 0L);
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap8.size();
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b15 = fixedOrderComparator14.isLocked();
        java.lang.Object[] obj_array16 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator14.add(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj18);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i31 = defaultedMap27.size();
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator33.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        boolean b39 = fixedOrderComparator33.add(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj37);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection50 = defaultedMap46.values();
        java.util.Collection collection51 = defaultedMap46.values();
        try {
            boolean b52 = fixedOrderComparator1.addAsEqual((java.lang.Object) map24, (java.lang.Object) collection51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        int i16 = defaultedMap12.size();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) (byte) 10);
        boolean b27 = defaultedMap20.equals((java.lang.Object) '#');
        int i28 = defaultedMap20.size();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { predicate8, defaultedMap12, 1.0d, i28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj33 = defaultedMap4.get((java.lang.Object) obj_array29);
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) obj_array29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1 + "'", obj33.equals(1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) defaultedMap22);
        boolean b24 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) defaultedMap39);
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) 0L);
        boolean b44 = defaultedMap39.equals((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap39.keySet();
        boolean b46 = defaultedMap39.isEmpty();
        boolean b47 = defaultedMap12.equals((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        int i53 = defaultedMap49.size();
        defaultedMap49.clear();
        boolean b55 = defaultedMap39.equals((java.lang.Object) defaultedMap49);
        collections.Factory factory56 = null;
        try {
            java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, factory56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) '4');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ' ' + "'", obj7.equals(' '));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap6.keySet();
        boolean b13 = defaultedMap6.isEmpty();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        int i16 = defaultedMap12.size();
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator18.isLocked();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b24 = fixedOrderComparator18.add(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj22);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate29);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap15.equals(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate18);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) map19);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) 1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        boolean b12 = defaultedMap10.equals((java.lang.Object) predicateUtils11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        int i19 = defaultedMap15.size();
        defaultedMap15.clear();
        java.util.Set set21 = defaultedMap15.entrySet();
        java.lang.Object obj22 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) defaultedMap15);
        try {
            int i23 = fixedOrderComparator2.compare(obj8, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) "");
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 1);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        boolean b35 = defaultedMap23.containsKey((java.lang.Object) defaultedMap28);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        int i47 = defaultedMap43.size();
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) (byte) 10);
        boolean b58 = defaultedMap51.equals((java.lang.Object) '#');
        int i59 = defaultedMap51.size();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { predicate39, defaultedMap43, 1.0d, i59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        boolean b62 = fixedOrderComparator61.isLocked();
        java.lang.Object obj63 = defaultedMap1.get((java.lang.Object) fixedOrderComparator61);
        boolean b64 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1 + "'", obj36.equals(1));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1 + "'", obj56.equals(1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1 + "'", obj63.equals(1));
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) "");
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap15.equals(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate18);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) map19);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator23);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        int i15 = defaultedMap11.size();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) (byte) 10);
        boolean b26 = defaultedMap19.equals((java.lang.Object) '#');
        int i27 = defaultedMap19.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { predicate7, defaultedMap11, 1.0d, i27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) obj_array28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        int i38 = defaultedMap34.size();
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        java.lang.Object[] obj_array42 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj44 = null;
        boolean b45 = fixedOrderComparator43.add(obj44);
        boolean b46 = fixedOrderComparator40.add(obj44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj44);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj55 = defaultedMap49.get((java.lang.Object) defaultedMap54);
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) 0L);
        boolean b59 = defaultedMap54.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array60 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj62 = null;
        boolean b63 = fixedOrderComparator61.add(obj62);
        boolean b65 = fixedOrderComparator61.add((java.lang.Object) 0L);
        boolean b66 = defaultedMap54.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj71 = defaultedMap68.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection72 = defaultedMap68.values();
        boolean b73 = defaultedMap54.equals((java.lang.Object) defaultedMap68);
        java.lang.Object obj74 = defaultedMap34.remove((java.lang.Object) defaultedMap54);
        java.util.Set set75 = defaultedMap34.keySet();
        boolean b76 = defaultedMap3.containsKey((java.lang.Object) set75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.PredicateUtils predicateUtils79 = new collections.PredicateUtils();
        boolean b80 = defaultedMap78.equals((java.lang.Object) predicateUtils79);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap83.putAll((java.util.Map) defaultedMap85);
        int i87 = defaultedMap83.size();
        defaultedMap83.clear();
        java.util.Set set89 = defaultedMap83.entrySet();
        java.lang.Object obj90 = defaultedMap78.put((java.lang.Object) "hi!", (java.lang.Object) defaultedMap83);
        java.util.Set set91 = defaultedMap83.entrySet();
        boolean b92 = defaultedMap3.containsValue((java.lang.Object) set91);
        collections.Factory factory93 = null;
        try {
            java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1 + "'", obj55.equals(1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap6.putAll(map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.util.Collection collection25 = defaultedMap19.values();
        boolean b26 = defaultedMap6.containsKey((java.lang.Object) defaultedMap19);
        boolean b27 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap6.remove((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap6.putAll(map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.util.Collection collection25 = defaultedMap19.values();
        boolean b26 = defaultedMap6.containsKey((java.lang.Object) defaultedMap19);
        defaultedMap6.clear();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap15.equals(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate18);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) map19);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        int i30 = defaultedMap26.size();
        defaultedMap26.clear();
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b35 = defaultedMap26.equals((java.lang.Object) obj_array32);
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        int i39 = fixedOrderComparator37.getUnknownObjectBehavior();
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b42 = fixedOrderComparator41.isLocked();
        int i43 = fixedOrderComparator41.getUnknownObjectBehavior();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { b24, obj_array32, fixedOrderComparator37, i43 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) (byte) 10);
        boolean b54 = defaultedMap47.equals((java.lang.Object) '#');
        int i55 = defaultedMap47.size();
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        int i62 = defaultedMap58.size();
        java.lang.Object[] obj_array63 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        java.lang.Object[] obj_array66 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        java.lang.Object obj68 = null;
        boolean b69 = fixedOrderComparator67.add(obj68);
        boolean b70 = fixedOrderComparator64.add(obj68);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, obj68);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate72, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate73, predicate75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj79 = null;
        boolean b80 = defaultedMap78.equals(obj79);
        java.lang.Object obj83 = defaultedMap78.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        boolean b89 = defaultedMap78.containsValue((java.lang.Object) defaultedMap85);
        java.lang.Object[] obj_array90 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array90);
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array90);
        java.lang.Object obj93 = defaultedMap78.remove((java.lang.Object) obj_array90);
        java.util.Collection collection94 = defaultedMap78.values();
        try {
            boolean b95 = fixedOrderComparator45.addAsEqual((java.lang.Object) predicate75, (java.lang.Object) defaultedMap78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1 + "'", obj52.equals(1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(obj_array90);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(collection94);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b7 = fixedOrderComparator1.add(obj5);
        boolean b8 = fixedOrderComparator1.isLocked();
        boolean b9 = fixedOrderComparator1.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 100);
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b23 = defaultedMap13.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) 2);
        java.lang.String str26 = defaultedMap13.toString();
        boolean b27 = fixedOrderComparator1.add((java.lang.Object) str26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate18);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 1);
        boolean b23 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) defaultedMap22);
        boolean b24 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) defaultedMap39);
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) 0L);
        boolean b44 = defaultedMap39.equals((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap39.keySet();
        boolean b46 = defaultedMap39.isEmpty();
        boolean b47 = defaultedMap12.equals((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj55 = defaultedMap49.get((java.lang.Object) defaultedMap54);
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) 0L);
        boolean b59 = defaultedMap54.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array60 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj62 = null;
        boolean b63 = fixedOrderComparator61.add(obj62);
        boolean b65 = fixedOrderComparator61.add((java.lang.Object) 0L);
        boolean b66 = defaultedMap54.containsValue((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap39.remove((java.lang.Object) b66);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1 + "'", obj55.equals(1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap6.putAll(map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.util.Collection collection25 = defaultedMap19.values();
        boolean b26 = defaultedMap6.containsKey((java.lang.Object) defaultedMap19);
        boolean b27 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap6.remove((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b40 = defaultedMap35.containsValue((java.lang.Object) 100.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) (byte) 10);
        boolean b50 = defaultedMap43.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        int i56 = defaultedMap52.size();
        java.lang.Object[] obj_array57 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b59 = fixedOrderComparator58.isLocked();
        java.lang.Object[] obj_array60 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj62 = null;
        boolean b63 = fixedOrderComparator61.add(obj62);
        boolean b64 = fixedOrderComparator58.add(obj62);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, obj62);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        int i75 = defaultedMap71.size();
        java.lang.Object[] obj_array76 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        boolean b78 = fixedOrderComparator77.isLocked();
        java.lang.Object[] obj_array79 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        java.lang.Object obj81 = null;
        boolean b82 = fixedOrderComparator80.add(obj81);
        boolean b83 = fixedOrderComparator77.add(obj81);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, obj81);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map68, predicate69, predicate85);
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate69);
        java.util.Collection collection90 = defaultedMap43.values();
        boolean b91 = defaultedMap6.equals((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1 + "'", obj48.equals(1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue(b91 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 1);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        boolean b35 = defaultedMap23.containsKey((java.lang.Object) defaultedMap28);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.util.Set set37 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1 + "'", obj36.equals(1));
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        int i14 = defaultedMap10.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator16.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator16.add(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj20);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap29.size();
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        java.lang.Object[] obj_array37 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj39 = null;
        boolean b40 = fixedOrderComparator38.add(obj39);
        boolean b41 = fixedOrderComparator35.add(obj39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, obj39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate27);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) defaultedMap14);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) defaultedMap9);
        boolean b18 = defaultedMap6.containsKey((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) (byte) 10);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        int i20 = defaultedMap16.size();
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator22.isLocked();
        java.lang.Object[] obj_array24 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object obj26 = null;
        boolean b27 = fixedOrderComparator25.add(obj26);
        boolean b28 = fixedOrderComparator22.add(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj26);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        int i39 = defaultedMap35.size();
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b42 = fixedOrderComparator41.isLocked();
        java.lang.Object[] obj_array43 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj45 = null;
        boolean b46 = fixedOrderComparator44.add(obj45);
        boolean b47 = fixedOrderComparator41.add(obj45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, obj45);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map32, predicate33, predicate49);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj61 = defaultedMap55.get((java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj69 = defaultedMap63.get((java.lang.Object) defaultedMap68);
        boolean b71 = defaultedMap68.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj74 = null;
        boolean b75 = defaultedMap73.equals(obj74);
        boolean b76 = defaultedMap68.equals((java.lang.Object) b75);
        java.lang.Object obj78 = defaultedMap68.get((java.lang.Object) 10);
        java.lang.Object obj79 = defaultedMap7.put((java.lang.Object) defaultedMap55, (java.lang.Object) defaultedMap68);
        java.lang.Object obj80 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1 + "'", obj61.equals(1));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 1 + "'", obj69.equals(1));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 1 + "'", obj78.equals(1));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 1 + "'", obj80.equals(1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap9.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) fixedOrderComparator22, (java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) defaultedMap34);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap29);
        boolean b41 = defaultedMap29.containsValue((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1 + "'", obj38.equals(1));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator7.add(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 0L);
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.lang.Object obj29 = null;
        boolean b30 = fixedOrderComparator28.add(obj29);
        boolean b32 = fixedOrderComparator28.add((java.lang.Object) 0L);
        boolean b33 = defaultedMap21.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection39 = defaultedMap35.values();
        boolean b40 = defaultedMap21.equals((java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        java.lang.String str42 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) 0L);
        boolean b16 = defaultedMap11.equals((java.lang.Object) 1.0d);
        java.util.Set set17 = defaultedMap11.keySet();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        int i29 = defaultedMap25.size();
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) (byte) 10);
        boolean b40 = defaultedMap33.equals((java.lang.Object) '#');
        int i41 = defaultedMap33.size();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { predicate21, defaultedMap25, 1.0d, i41 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = defaultedMap11.containsKey((java.lang.Object) obj_array42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        try {
            boolean b51 = fixedOrderComparator1.addAsEqual((java.lang.Object) obj_array42, (java.lang.Object) defaultedMap47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1 + "'", obj38.equals(1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b8 = fixedOrderComparator4.add((java.lang.Object) 0L);
        int i9 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b10 = fixedOrderComparator4.isLocked();
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator4.add(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        boolean b16 = defaultedMap14.equals((java.lang.Object) predicateUtils15);
        try {
            boolean b17 = fixedOrderComparator2.addAsEqual(obj11, (java.lang.Object) defaultedMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) defaultedMap22);
        boolean b24 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) defaultedMap39);
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) 0L);
        boolean b44 = defaultedMap39.equals((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap39.keySet();
        boolean b46 = defaultedMap39.isEmpty();
        boolean b47 = defaultedMap12.equals((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        int i53 = defaultedMap49.size();
        defaultedMap49.clear();
        boolean b55 = defaultedMap39.equals((java.lang.Object) defaultedMap49);
        java.lang.Object[] obj_array56 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        boolean b60 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator58);
        try {
            fixedOrderComparator58.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) obj_array13);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate4);
        defaultedMap1.clear();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = fixedOrderComparator8.isLocked();
        int i10 = fixedOrderComparator8.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 0L);
        boolean b24 = defaultedMap19.equals((java.lang.Object) 1.0d);
        java.util.Set set25 = defaultedMap19.keySet();
        boolean b26 = defaultedMap12.equals((java.lang.Object) defaultedMap19);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) fixedOrderComparator8, (java.lang.Object) b26);
        boolean b29 = fixedOrderComparator8.add((java.lang.Object) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1 + "'", obj20.equals(1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b4 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) defaultedMap20);
        boolean b22 = defaultedMap10.containsKey((java.lang.Object) defaultedMap15);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate23, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate27);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1 + "'", obj21.equals(1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap6.containsKey((java.lang.Object) defaultedMap14);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator7.add(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator19);
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b28 = fixedOrderComparator24.add((java.lang.Object) 100);
        int i29 = fixedOrderComparator24.getUnknownObjectBehavior();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) fixedOrderComparator24);
        boolean b31 = fixedOrderComparator24.isLocked();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        try {
            fixedOrderComparator26.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b12 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b17 = fixedOrderComparator13.add((java.lang.Object) 0L);
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection24 = defaultedMap20.values();
        boolean b25 = defaultedMap6.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i31 = defaultedMap27.size();
        defaultedMap27.clear();
        java.util.Set set33 = defaultedMap27.entrySet();
        defaultedMap27.clear();
        java.lang.Object obj35 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) (byte) 10);
        boolean b43 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap45.equals(obj46);
        boolean b48 = defaultedMap45.isEmpty();
        defaultedMap37.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap51.equals(obj52);
        boolean b54 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj67 = defaultedMap61.get((java.lang.Object) defaultedMap66);
        boolean b68 = defaultedMap56.containsKey((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj71 = null;
        boolean b72 = defaultedMap70.equals(obj71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) predicate73);
        boolean b75 = defaultedMap56.containsKey((java.lang.Object) map74);
        java.lang.Object[] obj_array76 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        boolean b79 = defaultedMap56.equals((java.lang.Object) fixedOrderComparator78);
        java.lang.Object obj80 = defaultedMap37.put((java.lang.Object) defaultedMap51, (java.lang.Object) b79);
        boolean b81 = defaultedMap6.containsKey((java.lang.Object) b79);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1 + "'", obj42.equals(1));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1 + "'", obj67.equals(1));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator7.add(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) (byte) 10);
        boolean b31 = defaultedMap24.equals((java.lang.Object) '#');
        int i32 = defaultedMap24.size();
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj46 = defaultedMap40.get((java.lang.Object) defaultedMap45);
        boolean b47 = defaultedMap35.containsKey((java.lang.Object) defaultedMap40);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate52);
        java.lang.Object obj55 = defaultedMap24.get((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj63 = defaultedMap57.get((java.lang.Object) defaultedMap62);
        boolean b65 = defaultedMap62.containsKey((java.lang.Object) 0L);
        boolean b67 = defaultedMap62.equals((java.lang.Object) 1.0d);
        java.util.Set set68 = defaultedMap62.keySet();
        boolean b69 = defaultedMap62.isEmpty();
        boolean b70 = defaultedMap35.equals((java.lang.Object) defaultedMap62);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        int i76 = defaultedMap72.size();
        defaultedMap72.clear();
        boolean b78 = defaultedMap62.equals((java.lang.Object) defaultedMap72);
        java.lang.String str79 = defaultedMap62.toString();
        java.lang.Object obj80 = defaultedMap1.remove((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1 + "'", obj46.equals(1));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1 + "'", obj55.equals(1));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1 + "'", obj63.equals(1));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        int i41 = defaultedMap37.size();
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) (byte) 10);
        boolean b52 = defaultedMap45.equals((java.lang.Object) '#');
        int i53 = defaultedMap45.size();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { predicate33, defaultedMap37, 1.0d, i53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj58 = defaultedMap29.get((java.lang.Object) obj_array54);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i64 = defaultedMap60.size();
        java.lang.Object[] obj_array65 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b67 = fixedOrderComparator66.isLocked();
        java.lang.Object[] obj_array68 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        java.lang.Object obj70 = null;
        boolean b71 = fixedOrderComparator69.add(obj70);
        boolean b72 = fixedOrderComparator66.add(obj70);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, obj70);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate74, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap79.putAll((java.util.Map) defaultedMap81);
        int i83 = defaultedMap79.size();
        java.lang.Object[] obj_array84 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array84);
        boolean b86 = fixedOrderComparator85.isLocked();
        java.lang.Object[] obj_array87 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        java.lang.Object obj89 = null;
        boolean b90 = fixedOrderComparator88.add(obj89);
        boolean b91 = fixedOrderComparator85.add(obj89);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, obj89);
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate93, predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate(map76, predicate77, predicate93);
        java.lang.Object obj97 = defaultedMap29.remove((java.lang.Object) map76);
        boolean b98 = fixedOrderComparator25.add(obj97);
        boolean b99 = fixedOrderComparator25.isLocked();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1 + "'", obj50.equals(1));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1 + "'", obj58.equals(1));
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(obj_array84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b23 = defaultedMap11.containsKey((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap25.equals(obj26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate28);
        boolean b30 = defaultedMap11.containsKey((java.lang.Object) map29);
        boolean b31 = defaultedMap8.containsValue((java.lang.Object) map29);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + ' ' + "'", obj3.equals(' '));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b7 = fixedOrderComparator1.add(obj5);
        fixedOrderComparator1.setUnknownObjectBehavior((int) (short) 1);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) '#');
        int i9 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) defaultedMap22);
        boolean b24 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) defaultedMap39);
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) 0L);
        boolean b44 = defaultedMap39.equals((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap39.keySet();
        boolean b46 = defaultedMap39.isEmpty();
        boolean b47 = defaultedMap12.equals((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        int i53 = defaultedMap49.size();
        defaultedMap49.clear();
        boolean b55 = defaultedMap39.equals((java.lang.Object) defaultedMap49);
        java.lang.Object[] obj_array56 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        boolean b60 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        int i71 = defaultedMap67.size();
        defaultedMap67.clear();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.lang.Object obj80 = defaultedMap75.get((java.lang.Object) (byte) 10);
        boolean b82 = defaultedMap75.equals((java.lang.Object) '#');
        int i83 = defaultedMap75.size();
        java.lang.Object[] obj_array84 = new java.lang.Object[] { predicate63, defaultedMap67, 1.0d, i83 };
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array84);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) obj_array84);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 1 + "'", obj80.equals(1));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(obj_array84);
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        defaultedMap6.clear();
        java.util.Set set10 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b12 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj29 = defaultedMap23.get((java.lang.Object) defaultedMap28);
        boolean b30 = defaultedMap20.containsValue((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        int i47 = defaultedMap43.size();
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) (byte) 10);
        boolean b58 = defaultedMap51.equals((java.lang.Object) '#');
        int i59 = defaultedMap51.size();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { predicate39, defaultedMap43, 1.0d, i59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj64 = defaultedMap35.get((java.lang.Object) obj_array60);
        java.lang.Object obj65 = defaultedMap20.get((java.lang.Object) obj_array60);
        java.lang.Object obj66 = defaultedMap9.get((java.lang.Object) defaultedMap20);
        java.lang.String str67 = defaultedMap9.toString();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1 + "'", obj21.equals(1));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1 + "'", obj56.equals(1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1 + "'", obj64.equals(1));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1 + "'", obj65.equals(1));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 1 + "'", obj66.equals(1));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap11.equals(obj12);
        boolean b14 = defaultedMap6.equals((java.lang.Object) b13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        int i22 = defaultedMap16.size();
        java.util.Set set23 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap6.keySet();
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        int i24 = defaultedMap20.size();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) (byte) 10);
        boolean b35 = defaultedMap28.equals((java.lang.Object) '#');
        int i36 = defaultedMap28.size();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { predicate16, defaultedMap20, 1.0d, i36 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator40);
        java.lang.Object obj42 = defaultedMap6.remove((java.lang.Object) fixedOrderComparator40);
        int i43 = fixedOrderComparator40.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1 + "'", obj33.equals(1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator7.add(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator19);
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b28 = fixedOrderComparator24.add((java.lang.Object) 100);
        int i29 = fixedOrderComparator24.getUnknownObjectBehavior();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) fixedOrderComparator24);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) defaultedMap39);
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) 0L);
        boolean b44 = defaultedMap39.equals((java.lang.Object) 1.0d);
        java.util.Set set45 = defaultedMap39.keySet();
        boolean b46 = defaultedMap32.equals((java.lang.Object) defaultedMap39);
        java.util.Set set47 = defaultedMap39.entrySet();
        boolean b48 = fixedOrderComparator24.add((java.lang.Object) set47);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        int i15 = defaultedMap11.size();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) (byte) 10);
        boolean b26 = defaultedMap19.equals((java.lang.Object) '#');
        int i27 = defaultedMap19.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { predicate7, defaultedMap11, 1.0d, i27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array28);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) defaultedMap25);
        boolean b27 = defaultedMap15.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap29.equals(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate32);
        boolean b34 = defaultedMap15.containsKey((java.lang.Object) map33);
        boolean b35 = defaultedMap11.containsKey((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1 + "'", obj26.equals(1));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(i26 == 2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 0L);
        boolean b13 = defaultedMap8.equals((java.lang.Object) 1.0d);
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        int i26 = defaultedMap22.size();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) (byte) 10);
        boolean b37 = defaultedMap30.equals((java.lang.Object) '#');
        int i38 = defaultedMap30.size();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { predicate18, defaultedMap22, 1.0d, i38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.lang.Object obj43 = defaultedMap8.get((java.lang.Object) fixedOrderComparator42);
        int i44 = fixedOrderComparator42.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        boolean b51 = defaultedMap46.containsValue((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set54 = defaultedMap53.keySet();
        try {
            int i55 = fixedOrderComparator42.compare((java.lang.Object) 100.0f, (java.lang.Object) set54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1 + "'", obj35.equals(1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) defaultedMap14);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) defaultedMap9);
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) 2);
        java.lang.String str19 = defaultedMap6.toString();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1 + "'", obj18.equals(1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap11.equals(obj12);
        boolean b14 = defaultedMap6.equals((java.lang.Object) b13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        int i22 = defaultedMap16.size();
        java.util.Set set23 = defaultedMap16.keySet();
        java.util.Set set24 = defaultedMap16.keySet();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) defaultedMap14);
        boolean b16 = defaultedMap4.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap18.equals(obj19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) predicate21);
        boolean b23 = defaultedMap4.containsKey((java.lang.Object) map22);
        java.lang.Object[] obj_array24 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = defaultedMap4.equals((java.lang.Object) fixedOrderComparator26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap29.equals(obj30);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        boolean b40 = defaultedMap29.containsValue((java.lang.Object) defaultedMap36);
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj44 = defaultedMap36.put((java.lang.Object) fixedOrderComparator42, (java.lang.Object) (byte) 1);
        java.util.Collection collection45 = defaultedMap36.values();
        try {
            boolean b46 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap4, (java.lang.Object) defaultedMap36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap9.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) fixedOrderComparator22, (java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap27.equals(obj28);
        java.util.Collection collection30 = defaultedMap27.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) predicate31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj32);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        int i15 = defaultedMap11.size();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) (byte) 10);
        boolean b26 = defaultedMap19.equals((java.lang.Object) '#');
        int i27 = defaultedMap19.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { predicate7, defaultedMap11, 1.0d, i27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) obj_array28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) defaultedMap39);
        boolean b41 = defaultedMap3.equals((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        boolean b7 = fixedOrderComparator1.add(obj5);
        fixedOrderComparator1.setUnknownObjectBehavior((int) (short) 1);
        boolean b10 = fixedOrderComparator1.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap11.equals(obj12);
        boolean b14 = defaultedMap6.equals((java.lang.Object) b13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        int i27 = defaultedMap23.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = null;
        boolean b34 = fixedOrderComparator32.add(obj33);
        boolean b35 = fixedOrderComparator29.add(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, obj33);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate37, predicate38);
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = defaultedMap23.containsValue((java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj45 = defaultedMap6.remove((java.lang.Object) fixedOrderComparator41);
        boolean b46 = fixedOrderComparator41.isLocked();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator41);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) defaultedMap29);
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) 0L);
        boolean b34 = defaultedMap29.equals((java.lang.Object) 1.0d);
        java.util.Set set35 = defaultedMap29.keySet();
        boolean b36 = defaultedMap22.equals((java.lang.Object) defaultedMap29);
        java.util.Set set37 = defaultedMap29.entrySet();
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) set37);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 100);
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        java.lang.Object obj7 = null;
        boolean b9 = fixedOrderComparator1.addAsEqual(obj7, (java.lang.Object) 10);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        try {
            fixedOrderComparator25.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) (byte) 10);
        boolean b14 = defaultedMap7.equals((java.lang.Object) '#');
        int i15 = defaultedMap7.size();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        int i22 = defaultedMap18.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = null;
        boolean b29 = fixedOrderComparator27.add(obj28);
        boolean b30 = fixedOrderComparator24.add(obj28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj28);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate33, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        int i42 = defaultedMap38.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        java.lang.Object[] obj_array46 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        boolean b50 = fixedOrderComparator44.add(obj48);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, obj48);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        int i61 = defaultedMap57.size();
        java.lang.Object[] obj_array62 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        boolean b64 = fixedOrderComparator63.isLocked();
        java.lang.Object[] obj_array65 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj67 = null;
        boolean b68 = fixedOrderComparator66.add(obj67);
        boolean b69 = fixedOrderComparator63.add(obj67);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, obj67);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate(map54, predicate55, predicate71);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate33, predicate71);
        collections.Transformer transformer76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate(map75, transformer76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        int i15 = defaultedMap11.size();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) (byte) 10);
        boolean b26 = defaultedMap19.equals((java.lang.Object) '#');
        int i27 = defaultedMap19.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { predicate7, defaultedMap11, 1.0d, i27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) obj_array28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        int i38 = defaultedMap34.size();
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        java.lang.Object[] obj_array42 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj44 = null;
        boolean b45 = fixedOrderComparator43.add(obj44);
        boolean b46 = fixedOrderComparator40.add(obj44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, obj44);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        int i57 = defaultedMap53.size();
        java.lang.Object[] obj_array58 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b60 = fixedOrderComparator59.isLocked();
        java.lang.Object[] obj_array61 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj63 = null;
        boolean b64 = fixedOrderComparator62.add(obj63);
        boolean b65 = fixedOrderComparator59.add(obj63);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, obj63);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate67);
        java.lang.Object obj71 = defaultedMap3.remove((java.lang.Object) map50);
        java.lang.Object[] obj_array72 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        java.lang.Object obj74 = null;
        boolean b75 = fixedOrderComparator73.add(obj74);
        boolean b77 = fixedOrderComparator73.add((java.lang.Object) 0L);
        boolean b78 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator73);
        int i79 = fixedOrderComparator73.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i79 == 2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap11.equals(obj12);
        boolean b14 = defaultedMap6.equals((java.lang.Object) b13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection20 = defaultedMap16.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        int i27 = defaultedMap23.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = null;
        boolean b34 = fixedOrderComparator32.add(obj33);
        boolean b35 = fixedOrderComparator29.add(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, obj33);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate37, predicate38);
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        boolean b44 = defaultedMap23.containsValue((java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj45 = defaultedMap6.remove((java.lang.Object) fixedOrderComparator41);
        boolean b46 = fixedOrderComparator41.isLocked();
        int i47 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i48 = fixedOrderComparator41.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue(i48 == 2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        boolean b11 = defaultedMap8.containsKey((java.lang.Object) 0L);
        boolean b13 = defaultedMap8.equals((java.lang.Object) 1.0d);
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        int i26 = defaultedMap22.size();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) (byte) 10);
        boolean b37 = defaultedMap30.equals((java.lang.Object) '#');
        int i38 = defaultedMap30.size();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { predicate18, defaultedMap22, 1.0d, i38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.lang.Object obj43 = defaultedMap8.get((java.lang.Object) fixedOrderComparator42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        defaultedMap45.clear();
        int i50 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        int i56 = defaultedMap52.size();
        java.lang.Object[] obj_array57 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b59 = fixedOrderComparator58.isLocked();
        java.lang.Object[] obj_array60 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj62 = null;
        boolean b63 = fixedOrderComparator61.add(obj62);
        boolean b64 = fixedOrderComparator58.add(obj62);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, obj62);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        int i75 = defaultedMap71.size();
        java.lang.Object[] obj_array76 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        boolean b78 = fixedOrderComparator77.isLocked();
        java.lang.Object[] obj_array79 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        java.lang.Object obj81 = null;
        boolean b82 = fixedOrderComparator80.add(obj81);
        boolean b83 = fixedOrderComparator77.add(obj81);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, obj81);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map68, predicate69, predicate85);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj91 = null;
        boolean b92 = defaultedMap90.equals(obj91);
        java.util.Collection collection93 = defaultedMap90.values();
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj95 = defaultedMap90.remove((java.lang.Object) predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate85, predicate94);
        java.lang.Object obj97 = defaultedMap8.remove((java.lang.Object) predicate85);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1 + "'", obj35.equals(1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap9.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) fixedOrderComparator22, (java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap27.equals(obj28);
        java.util.Collection collection30 = defaultedMap27.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) predicate31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj32);
        java.util.Set set34 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate18);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate(map20, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        java.util.Set set12 = defaultedMap6.entrySet();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) defaultedMap6);
        java.util.Collection collection14 = defaultedMap6.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 1);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        boolean b35 = defaultedMap23.containsKey((java.lang.Object) defaultedMap28);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        int i47 = defaultedMap43.size();
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) (byte) 10);
        boolean b58 = defaultedMap51.equals((java.lang.Object) '#');
        int i59 = defaultedMap51.size();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { predicate39, defaultedMap43, 1.0d, i59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        boolean b62 = fixedOrderComparator61.isLocked();
        java.lang.Object obj63 = defaultedMap1.get((java.lang.Object) fixedOrderComparator61);
        java.util.Set set64 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1 + "'", obj36.equals(1));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1 + "'", obj56.equals(1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1 + "'", obj63.equals(1));
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) (byte) 10);
        boolean b18 = defaultedMap11.equals((java.lang.Object) '#');
        int i19 = defaultedMap11.size();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) defaultedMap32);
        boolean b34 = defaultedMap22.containsKey((java.lang.Object) defaultedMap27);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate35, predicate39);
        java.lang.Object obj42 = defaultedMap11.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) 10);
        java.lang.String str50 = defaultedMap46.toString();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap46);
        java.lang.Object obj52 = defaultedMap8.get((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        int i63 = defaultedMap59.size();
        defaultedMap59.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) (byte) 10);
        boolean b74 = defaultedMap67.equals((java.lang.Object) '#');
        int i75 = defaultedMap67.size();
        java.lang.Object[] obj_array76 = new java.lang.Object[] { predicate55, defaultedMap59, 1.0d, i75 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator79);
        java.lang.Object obj81 = defaultedMap1.put((java.lang.Object) defaultedMap46, (java.lang.Object) fixedOrderComparator79);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1 + "'", obj16.equals(1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1 + "'", obj33.equals(1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1 + "'", obj42.equals(1));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1 + "'", obj52.equals(1));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 1 + "'", obj72.equals(1));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator26);
        fixedOrderComparator26.setUnknownObjectBehavior((int) (byte) 1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) defaultedMap24);
        boolean b26 = defaultedMap14.containsKey((java.lang.Object) defaultedMap19);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate27, predicate31);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (byte) 1);
        boolean b36 = defaultedMap6.containsKey((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b12 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Set set14 = defaultedMap1.entrySet();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 1L);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        int i23 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) (byte) 10);
        boolean b32 = defaultedMap25.equals((java.lang.Object) '#');
        int i33 = defaultedMap25.size();
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        int i40 = defaultedMap36.size();
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b43 = fixedOrderComparator42.isLocked();
        java.lang.Object[] obj_array44 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        java.lang.Object obj46 = null;
        boolean b47 = fixedOrderComparator45.add(obj46);
        boolean b48 = fixedOrderComparator42.add(obj46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, obj46);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate51, predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        int i60 = defaultedMap56.size();
        java.lang.Object[] obj_array61 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        boolean b63 = fixedOrderComparator62.isLocked();
        java.lang.Object[] obj_array64 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        java.lang.Object obj66 = null;
        boolean b67 = fixedOrderComparator65.add(obj66);
        boolean b68 = fixedOrderComparator62.add(obj66);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, obj66);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        int i79 = defaultedMap75.size();
        java.lang.Object[] obj_array80 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b82 = fixedOrderComparator81.isLocked();
        java.lang.Object[] obj_array83 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        java.lang.Object obj85 = null;
        boolean b86 = fixedOrderComparator84.add(obj85);
        boolean b87 = fixedOrderComparator81.add(obj85);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, obj85);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate89, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate(map72, predicate73, predicate89);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate51, predicate89);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate51);
        int i95 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertTrue(i95 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Set set14 = defaultedMap6.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap14.equals(obj15);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        boolean b25 = defaultedMap14.containsValue((java.lang.Object) defaultedMap21);
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = defaultedMap21.put((java.lang.Object) fixedOrderComparator27, (java.lang.Object) (byte) 1);
        java.util.Collection collection30 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) (byte) 10);
        boolean b39 = defaultedMap32.equals((java.lang.Object) '#');
        int i40 = defaultedMap32.size();
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) (byte) 10);
        boolean b50 = defaultedMap43.equals((java.lang.Object) '#');
        int i51 = defaultedMap43.size();
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj65 = defaultedMap59.get((java.lang.Object) defaultedMap64);
        boolean b66 = defaultedMap54.containsKey((java.lang.Object) defaultedMap59);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate67, predicate71);
        java.lang.Object obj74 = defaultedMap43.get((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj82 = defaultedMap76.get((java.lang.Object) defaultedMap81);
        boolean b84 = defaultedMap81.containsKey((java.lang.Object) 0L);
        boolean b86 = defaultedMap81.equals((java.lang.Object) 1.0d);
        java.util.Set set87 = defaultedMap81.keySet();
        boolean b88 = defaultedMap81.isEmpty();
        boolean b89 = defaultedMap54.equals((java.lang.Object) defaultedMap81);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap91.putAll((java.util.Map) defaultedMap93);
        int i95 = defaultedMap91.size();
        defaultedMap91.clear();
        boolean b97 = defaultedMap81.equals((java.lang.Object) defaultedMap91);
        java.lang.Object obj98 = defaultedMap32.get((java.lang.Object) defaultedMap91);
        java.lang.Object obj99 = defaultedMap8.put((java.lang.Object) defaultedMap21, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1 + "'", obj37.equals(1));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1 + "'", obj48.equals(1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1 + "'", obj65.equals(1));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1 + "'", obj74.equals(1));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 1 + "'", obj82.equals(1));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertTrue(b97 == true);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + 1 + "'", obj98.equals(1));
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        boolean b13 = fixedOrderComparator7.add(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator19);
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        boolean b28 = fixedOrderComparator24.add((java.lang.Object) 100);
        int i29 = fixedOrderComparator24.getUnknownObjectBehavior();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) fixedOrderComparator24);
        int i31 = fixedOrderComparator24.getUnknownObjectBehavior();
        try {
            fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue(i31 == 2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b5 = fixedOrderComparator1.add((java.lang.Object) 0L);
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        int i12 = defaultedMap8.size();
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b15 = fixedOrderComparator14.isLocked();
        java.lang.Object[] obj_array16 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        boolean b20 = fixedOrderComparator14.add(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj18);
        boolean b23 = fixedOrderComparator1.addAsEqual(obj18, (java.lang.Object) '4');
        fixedOrderComparator1.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap27.equals(obj28);
        java.util.Collection collection30 = defaultedMap27.values();
        boolean b31 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        int i37 = defaultedMap33.size();
        defaultedMap33.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        boolean b40 = fixedOrderComparator1.add((java.lang.Object) defaultedMap27);
        fixedOrderComparator1.setUnknownObjectBehavior((int) (short) 1);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap6.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) defaultedMap25);
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap30.equals(obj31);
        boolean b33 = defaultedMap25.equals((java.lang.Object) b32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection39 = defaultedMap35.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        int i46 = defaultedMap42.size();
        java.lang.Object[] obj_array47 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b49 = fixedOrderComparator48.isLocked();
        java.lang.Object[] obj_array50 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj52 = null;
        boolean b53 = fixedOrderComparator51.add(obj52);
        boolean b54 = fixedOrderComparator48.add(obj52);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, obj52);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate56, predicate57);
        java.lang.Object[] obj_array59 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object obj61 = null;
        boolean b62 = fixedOrderComparator60.add(obj61);
        boolean b63 = defaultedMap42.containsValue((java.lang.Object) fixedOrderComparator60);
        java.lang.Object obj64 = defaultedMap25.remove((java.lang.Object) fixedOrderComparator60);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj67 = null;
        boolean b68 = defaultedMap66.equals(obj67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) predicate69);
        java.lang.Object obj71 = defaultedMap25.get((java.lang.Object) defaultedMap66);
        defaultedMap25.clear();
        boolean b73 = defaultedMap6.equals((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1 + "'", obj26.equals(1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1 + "'", obj71.equals(1));
        org.junit.Assert.assertTrue(b73 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap11.equals(obj12);
        boolean b14 = defaultedMap6.equals((java.lang.Object) b13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap16.equals(obj17);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        java.util.Collection collection22 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap24.equals(obj25);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        boolean b35 = defaultedMap24.containsValue((java.lang.Object) defaultedMap31);
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) fixedOrderComparator37, (java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap16.get((java.lang.Object) defaultedMap31);
        defaultedMap6.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) (byte) 10);
        boolean b50 = defaultedMap43.equals((java.lang.Object) '#');
        int i51 = defaultedMap43.size();
        defaultedMap43.clear();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap43);
        java.util.Set set54 = defaultedMap43.keySet();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1 + "'", obj48.equals(1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap9.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) fixedOrderComparator22, (java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.lang.String str26 = defaultedMap16.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        defaultedMap1.clear();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.String str13 = defaultedMap8.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = fixedOrderComparator17.isLocked();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b12 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) 0L);
        boolean b25 = defaultedMap20.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        defaultedMap20.putAll(map30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) (byte) 10);
        java.util.Collection collection39 = defaultedMap33.values();
        boolean b40 = defaultedMap20.containsKey((java.lang.Object) defaultedMap33);
        java.lang.Object obj41 = defaultedMap9.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj49 = defaultedMap43.get((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj57 = defaultedMap51.get((java.lang.Object) defaultedMap56);
        boolean b58 = defaultedMap48.containsValue((java.lang.Object) defaultedMap51);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) b58);
        defaultedMap9.clear();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1 + "'", obj21.equals(1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1 + "'", obj38.equals(1));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1 + "'", obj41.equals(1));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1 + "'", obj49.equals(1));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1 + "'", obj57.equals(1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap11.equals(obj12);
        boolean b14 = defaultedMap6.equals((java.lang.Object) b13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 0L);
        defaultedMap21.clear();
        java.util.Set set26 = defaultedMap21.keySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) 100.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) defaultedMap14);
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 0L);
        boolean b19 = defaultedMap14.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        boolean b25 = fixedOrderComparator21.add((java.lang.Object) 0L);
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection32 = defaultedMap28.values();
        boolean b33 = defaultedMap14.equals((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        int i39 = defaultedMap35.size();
        defaultedMap35.clear();
        java.util.Set set41 = defaultedMap35.entrySet();
        defaultedMap35.clear();
        java.lang.Object obj43 = defaultedMap14.remove((java.lang.Object) defaultedMap35);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj47 = null;
        boolean b48 = defaultedMap46.equals(obj47);
        java.lang.String str49 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj57 = defaultedMap51.get((java.lang.Object) defaultedMap56);
        boolean b58 = defaultedMap46.containsValue((java.lang.Object) defaultedMap56);
        defaultedMap35.putAll((java.util.Map) defaultedMap56);
        java.lang.String str60 = defaultedMap56.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1 + "'", obj57.equals(1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 0L);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        defaultedMap9.putAll(map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) (byte) 10);
        java.util.Collection collection28 = defaultedMap22.values();
        boolean b29 = defaultedMap9.containsKey((java.lang.Object) defaultedMap22);
        boolean b30 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        java.lang.Object obj36 = defaultedMap9.remove((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        boolean b43 = defaultedMap38.containsValue((java.lang.Object) 100.0f);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj52 = defaultedMap46.get((java.lang.Object) defaultedMap51);
        boolean b54 = defaultedMap51.containsKey((java.lang.Object) 0L);
        boolean b56 = defaultedMap51.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        defaultedMap51.putAll(map61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.lang.Object obj69 = defaultedMap64.get((java.lang.Object) (byte) 10);
        java.util.Collection collection70 = defaultedMap64.values();
        boolean b71 = defaultedMap51.containsKey((java.lang.Object) defaultedMap64);
        boolean b72 = defaultedMap51.isEmpty();
        try {
            boolean b73 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap9, (java.lang.Object) b72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1 + "'", obj10.equals(1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1 + "'", obj52.equals(1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 1 + "'", obj69.equals(1));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) (byte) 10);
        boolean b15 = defaultedMap8.equals((java.lang.Object) '#');
        int i16 = defaultedMap8.size();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) defaultedMap29);
        boolean b31 = defaultedMap19.containsKey((java.lang.Object) defaultedMap24);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate32, predicate36);
        java.lang.Object obj39 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj47 = defaultedMap41.get((java.lang.Object) defaultedMap46);
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) 0L);
        boolean b51 = defaultedMap46.equals((java.lang.Object) 1.0d);
        java.util.Set set52 = defaultedMap46.keySet();
        boolean b53 = defaultedMap46.isEmpty();
        boolean b54 = defaultedMap19.equals((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        int i60 = defaultedMap56.size();
        defaultedMap56.clear();
        boolean b62 = defaultedMap46.equals((java.lang.Object) defaultedMap56);
        java.lang.Object[] obj_array63 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array63);
        int i66 = fixedOrderComparator65.getUnknownObjectBehavior();
        boolean b67 = defaultedMap46.equals((java.lang.Object) fixedOrderComparator65);
        java.lang.String str68 = defaultedMap46.toString();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap46);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1 + "'", obj39.equals(1));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1 + "'", obj47.equals(1));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(i66 == 2);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator1.add(obj2);
        boolean b4 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap6.containsKey((java.lang.Object) defaultedMap14);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap21.equals(obj22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate24);
        java.lang.Object obj26 = defaultedMap6.put(obj19, (java.lang.Object) map25);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate(map25, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) (byte) 10);
        boolean b20 = defaultedMap13.equals((java.lang.Object) '#');
        int i21 = defaultedMap13.size();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) defaultedMap34);
        boolean b36 = defaultedMap24.containsKey((java.lang.Object) defaultedMap29);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate37, predicate41);
        java.lang.Object obj44 = defaultedMap13.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj52 = defaultedMap46.get((java.lang.Object) defaultedMap51);
        boolean b54 = defaultedMap51.containsKey((java.lang.Object) 0L);
        boolean b56 = defaultedMap51.equals((java.lang.Object) 1.0d);
        java.util.Set set57 = defaultedMap51.keySet();
        boolean b58 = defaultedMap51.isEmpty();
        boolean b59 = defaultedMap24.equals((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        int i65 = defaultedMap61.size();
        defaultedMap61.clear();
        boolean b67 = defaultedMap51.equals((java.lang.Object) defaultedMap61);
        java.lang.String str68 = defaultedMap51.toString();
        defaultedMap51.clear();
        boolean b70 = fixedOrderComparator11.add((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1 + "'", obj18.equals(1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1 + "'", obj35.equals(1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1 + "'", obj52.equals(1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b23 = defaultedMap11.containsKey((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        int i29 = defaultedMap25.size();
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = fixedOrderComparator31.isLocked();
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        boolean b37 = fixedOrderComparator31.add(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, obj35);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate39, predicate40);
        java.lang.Object obj42 = defaultedMap16.remove((java.lang.Object) defaultedMap25);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        java.util.Collection collection10 = defaultedMap7.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b16 = defaultedMap1.equals((java.lang.Object) obj_array13);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1 + "'", obj11.equals(1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        int i14 = defaultedMap10.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator16.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        boolean b22 = fixedOrderComparator16.add(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj20);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        int i33 = defaultedMap29.size();
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        java.lang.Object[] obj_array37 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj39 = null;
        boolean b40 = fixedOrderComparator38.add(obj39);
        boolean b41 = fixedOrderComparator35.add(obj39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, obj39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj55 = defaultedMap49.get((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj63 = defaultedMap57.get((java.lang.Object) defaultedMap62);
        boolean b65 = defaultedMap62.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj68 = null;
        boolean b69 = defaultedMap67.equals(obj68);
        boolean b70 = defaultedMap62.equals((java.lang.Object) b69);
        java.lang.Object obj72 = defaultedMap62.get((java.lang.Object) 10);
        java.lang.Object obj73 = defaultedMap1.put((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap62);
        java.lang.String str74 = defaultedMap49.toString();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1 + "'", obj55.equals(1));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1 + "'", obj63.equals(1));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 1 + "'", obj72.equals(1));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0L);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        boolean b17 = fixedOrderComparator13.add((java.lang.Object) 0L);
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1, (java.lang.Object) 10L);
        java.util.Collection collection24 = defaultedMap20.values();
        boolean b25 = defaultedMap6.equals((java.lang.Object) defaultedMap20);
        java.lang.String str26 = defaultedMap6.toString();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b5 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap15.equals(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate18);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        int i26 = defaultedMap22.size();
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = fixedOrderComparator28.isLocked();
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object obj32 = null;
        boolean b33 = fixedOrderComparator31.add(obj32);
        boolean b34 = fixedOrderComparator28.add(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, obj32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate36, predicate37);
        boolean b39 = defaultedMap1.equals((java.lang.Object) predicate37);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i10 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) (byte) 10);
        boolean b21 = defaultedMap14.equals((java.lang.Object) '#');
        int i22 = defaultedMap14.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { predicate2, defaultedMap6, 1.0d, i22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array23);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (byte) 10);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 1);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        boolean b35 = defaultedMap23.containsKey((java.lang.Object) defaultedMap28);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj44 = defaultedMap38.get((java.lang.Object) defaultedMap43);
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 0L);
        boolean b48 = defaultedMap43.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        defaultedMap43.putAll(map53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj62 = defaultedMap56.get((java.lang.Object) defaultedMap61);
        java.lang.Object obj63 = defaultedMap23.put((java.lang.Object) map53, (java.lang.Object) defaultedMap56);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1 + "'", obj36.equals(1));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 1 + "'", obj62.equals(1));
        org.junit.Assert.assertNull(obj63);
    }
}

