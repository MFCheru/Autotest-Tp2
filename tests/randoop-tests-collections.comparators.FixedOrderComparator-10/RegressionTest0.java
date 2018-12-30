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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100.0d);
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
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        try {
            boolean b5 = fixedOrderComparator2.addAsEqual((java.lang.Object) 0.0d, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        try {
            boolean b8 = fixedOrderComparator3.addAsEqual((java.lang.Object) '4', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) ' ');
        try {
            fixedOrderComparator4.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array1);
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.String str7 = defaultedMap1.toString();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        try {
            int i29 = fixedOrderComparator4.compare((java.lang.Object) predicate12, (java.lang.Object) defaultedMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        boolean b30 = defaultedMap23.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array32);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj39 = defaultedMap23.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set42 = defaultedMap41.keySet();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        boolean b45 = defaultedMap23.equals((java.lang.Object) set44);
        try {
            boolean b46 = fixedOrderComparator13.addAsEqual((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array4);
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.keySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap22);
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap13.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) 1);
        try {
            int i29 = fixedOrderComparator2.compare((java.lang.Object) fixedOrderComparator6, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + false + "'", obj28.equals(false));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate10, predicate16);
        int i20 = defaultedMap4.size();
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap4.containsValue(obj21);
        try {
            boolean b23 = fixedOrderComparator0.addAsEqual((java.lang.Object) (short) -1, (java.lang.Object) defaultedMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) 10L);
        defaultedMap4.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        try {
            fixedOrderComparator13.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection3 = defaultedMap2.values();
        int i4 = defaultedMap2.size();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap13.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap31.clear();
        java.util.Set set34 = defaultedMap31.entrySet();
        boolean b35 = defaultedMap13.equals((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap37.equals((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate54);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate39, predicate48);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.util.Set set60 = defaultedMap13.keySet();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        int i6 = fixedOrderComparator3.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        defaultedMap17.clear();
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) 1);
        boolean b27 = defaultedMap17.isEmpty();
        boolean b28 = fixedOrderComparator3.add((java.lang.Object) b27);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        boolean b20 = defaultedMap10.isEmpty();
        java.util.Set set21 = defaultedMap10.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.keySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap12.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj28 = defaultedMap12.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        defaultedMap30.clear();
        java.util.Set set33 = defaultedMap30.entrySet();
        boolean b34 = defaultedMap12.equals((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection37 = defaultedMap36.values();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        boolean b39 = defaultedMap36.equals((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set42 = defaultedMap41.keySet();
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate47, predicate53);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate38, predicate47);
        try {
            boolean b58 = fixedOrderComparator4.addAsEqual((java.lang.Object) obj_array8, (java.lang.Object) map57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj14 = defaultedMap6.put((java.lang.Object) predicate12, (java.lang.Object) (byte) 10);
        try {
            java.util.Map map15 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate10, predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set33 = defaultedMap32.keySet();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection35 = defaultedMap32.values();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) 100.0d);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj43 = defaultedMap32.put((java.lang.Object) b41, (java.lang.Object) predicate42);
        boolean b44 = defaultedMap21.equals((java.lang.Object) predicate42);
        try {
            int i45 = fixedOrderComparator2.compare((java.lang.Object) predicate16, (java.lang.Object) predicate42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) collection9);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 10L);
        boolean b23 = defaultedMap17.containsValue((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.keySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) 1);
        boolean b24 = defaultedMap2.containsValue(obj23);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        boolean b20 = defaultedMap10.isEmpty();
        java.util.Set set21 = defaultedMap10.keySet();
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap21.put(obj23, (java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) 1.0f);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0d);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        int i20 = fixedOrderComparator13.getUnknownObjectBehavior();
        java.lang.Object obj22 = null;
        try {
            boolean b23 = fixedOrderComparator13.addAsEqual((java.lang.Object) false, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        try {
            int i17 = fixedOrderComparator3.compare((java.lang.Object) map11, (java.lang.Object) obj_array13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(obj_array13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.keySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection18 = defaultedMap15.values();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) 100.0d);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap15.put((java.lang.Object) b24, (java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap15.keySet();
        java.lang.Object obj28 = defaultedMap4.remove((java.lang.Object) set27);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap21.clear();
        boolean b28 = fixedOrderComparator13.add((java.lang.Object) defaultedMap21);
        defaultedMap21.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap8.equals((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap8.remove((java.lang.Object) '#');
        try {
            boolean b18 = fixedOrderComparator3.addAsEqual((java.lang.Object) (byte) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.String str4 = defaultedMap2.toString();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        java.lang.String str8 = defaultedMap4.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate13);
        int i17 = defaultedMap1.size();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b27 = defaultedMap20.equals((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap20.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) obj_array31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator35);
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i37 == 2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        boolean b10 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.util.Set set17 = defaultedMap12.entrySet();
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate32);
        int i36 = defaultedMap20.size();
        java.lang.Object obj37 = defaultedMap12.get((java.lang.Object) defaultedMap20);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap21.put(obj23, (java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection29 = defaultedMap28.values();
        boolean b30 = defaultedMap10.containsValue((java.lang.Object) collection29);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        boolean b35 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        java.util.Set set42 = defaultedMap37.entrySet();
        java.lang.Object obj43 = defaultedMap33.get((java.lang.Object) defaultedMap37);
        boolean b44 = defaultedMap10.containsKey((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        boolean b7 = fixedOrderComparator3.add((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior(2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set10 = defaultedMap9.keySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap6.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator18.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) fixedOrderComparator18, (java.lang.Object) (byte) 1);
        java.util.Collection collection23 = defaultedMap6.values();
        try {
            int i24 = fixedOrderComparator0.compare(obj4, (java.lang.Object) collection23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        try {
            boolean b22 = fixedOrderComparator13.addAsEqual((java.lang.Object) (short) 100, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set3 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.util.Collection collection16 = defaultedMap13.values();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) 100.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj24 = defaultedMap13.put((java.lang.Object) b22, (java.lang.Object) predicate23);
        boolean b25 = defaultedMap2.equals((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        try {
            java.util.Map map32 = collections.map.PredicatedMap.decorate(map0, predicate23, predicate30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate13);
        int i17 = defaultedMap1.size();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b27 = defaultedMap20.equals((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap20.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) obj_array31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array31);
        java.util.Set set35 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b3 = defaultedMap1.equals((java.lang.Object) "{}");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.keySet();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate13, predicate19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set35 = defaultedMap34.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate36);
        int i40 = defaultedMap24.size();
        int i41 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set44 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.keySet();
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        boolean b50 = defaultedMap43.equals((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap43.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap43.get((java.lang.Object) obj_array54);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator58);
        try {
            int i60 = fixedOrderComparator3.compare((java.lang.Object) predicate13, (java.lang.Object) fixedOrderComparator58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + false + "'", obj56.equals(false));
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection3 = defaultedMap2.values();
        java.util.Set set4 = defaultedMap2.entrySet();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        boolean b10 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.util.Set set17 = defaultedMap12.entrySet();
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate32);
        int i36 = defaultedMap20.size();
        java.lang.Object obj37 = defaultedMap12.get((java.lang.Object) defaultedMap20);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(2);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) 2);
        java.util.Collection collection44 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap13.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap31.clear();
        java.util.Set set34 = defaultedMap31.entrySet();
        boolean b35 = defaultedMap13.equals((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap37.equals((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate54);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate39, predicate48);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Map map61 = null;
        try {
            defaultedMap1.putAll(map61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set10 = defaultedMap9.keySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 10L);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) 10L);
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        boolean b9 = defaultedMap4.containsValue((java.lang.Object) (short) -1);
        java.util.Set set10 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i14 = defaultedMap13.size();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) (-1.0d));
        java.util.Collection collection17 = defaultedMap13.values();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { defaultedMap4, 10.0d, collection17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(obj_array18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        int i20 = fixedOrderComparator13.getUnknownObjectBehavior();
        boolean b21 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        boolean b30 = defaultedMap23.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array32);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj39 = defaultedMap23.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) (byte) 1);
        java.util.Collection collection40 = defaultedMap23.values();
        boolean b41 = fixedOrderComparator13.add((java.lang.Object) collection40);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        boolean b8 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        java.util.Set set15 = defaultedMap10.entrySet();
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.keySet();
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate30);
        int i34 = defaultedMap18.size();
        java.lang.Object obj35 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap10.remove(obj37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        int i20 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Set set27 = defaultedMap22.entrySet();
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap22, obj28);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "{}");
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap21.put(obj23, (java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) 1.0f);
        java.util.Set set27 = defaultedMap10.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) collection9);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate22);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.keySet();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate33);
        int i37 = defaultedMap21.size();
        int i38 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set44 = defaultedMap43.keySet();
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        boolean b47 = defaultedMap40.equals((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap40.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj53 = defaultedMap40.get((java.lang.Object) obj_array51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) obj_array51);
        boolean b55 = fixedOrderComparator13.add((java.lang.Object) defaultedMap21);
        boolean b56 = fixedOrderComparator13.isLocked();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false + "'", obj53.equals(false));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 100.0d);
        int i8 = fixedOrderComparator5.getUnknownObjectBehavior();
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.keySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection18 = defaultedMap15.values();
        try {
            int i19 = fixedOrderComparator5.compare((java.lang.Object) 1, (java.lang.Object) defaultedMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        boolean b10 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.util.Set set17 = defaultedMap12.entrySet();
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate32);
        int i36 = defaultedMap20.size();
        java.lang.Object obj37 = defaultedMap12.get((java.lang.Object) defaultedMap20);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set44 = defaultedMap43.keySet();
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set49 = defaultedMap48.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set55 = defaultedMap54.keySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set58 = defaultedMap57.keySet();
        defaultedMap54.putAll((java.util.Map) defaultedMap57);
        java.util.Collection collection60 = defaultedMap57.values();
        boolean b62 = defaultedMap57.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap57.put((java.lang.Object) predicate63, (java.lang.Object) (byte) 10);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate51, predicate63);
        java.lang.Object obj67 = defaultedMap12.remove((java.lang.Object) defaultedMap40);
        java.util.Set set68 = defaultedMap40.keySet();
        java.util.Set set69 = defaultedMap40.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        boolean b20 = defaultedMap10.isEmpty();
        java.util.Set set21 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        boolean b30 = defaultedMap23.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array32);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj39 = defaultedMap23.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set42 = defaultedMap41.keySet();
        defaultedMap41.clear();
        java.util.Set set44 = defaultedMap41.entrySet();
        boolean b45 = defaultedMap23.equals((java.lang.Object) set44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection48 = defaultedMap47.values();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        boolean b50 = defaultedMap47.equals((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.keySet();
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set57 = defaultedMap56.keySet();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate64);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate49, predicate58);
        java.lang.Object obj69 = defaultedMap10.get((java.lang.Object) predicate49);
        defaultedMap10.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + false + "'", obj69.equals(false));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.keySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        boolean b26 = defaultedMap7.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        java.util.Collection collection30 = defaultedMap29.values();
        try {
            int i31 = fixedOrderComparator4.compare((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set10 = defaultedMap9.keySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection12 = defaultedMap9.values();
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap9.put((java.lang.Object) predicate15, (java.lang.Object) (byte) 10);
        java.lang.Object obj18 = defaultedMap2.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.util.Set set24 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        boolean b28 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.util.Set set35 = defaultedMap30.entrySet();
        java.lang.Object obj36 = defaultedMap26.get((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set39 = defaultedMap38.keySet();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set49 = defaultedMap48.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate50);
        int i54 = defaultedMap38.size();
        java.lang.Object obj55 = defaultedMap30.get((java.lang.Object) defaultedMap38);
        defaultedMap19.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection57 = defaultedMap30.values();
        boolean b58 = fixedOrderComparator13.add((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + false + "'", obj55.equals(false));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior(2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 2);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils5);
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        boolean b20 = defaultedMap10.isEmpty();
        java.lang.String str21 = defaultedMap10.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        boolean b8 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        java.util.Set set15 = defaultedMap10.entrySet();
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) defaultedMap10);
        int i17 = defaultedMap6.size();
        try {
            boolean b18 = fixedOrderComparator3.addAsEqual((java.lang.Object) 1.0f, (java.lang.Object) defaultedMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        boolean b10 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.util.Set set17 = defaultedMap12.entrySet();
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate32);
        int i36 = defaultedMap20.size();
        java.lang.Object obj37 = defaultedMap12.get((java.lang.Object) defaultedMap20);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i41 = defaultedMap40.size();
        java.lang.Object obj43 = defaultedMap40.get((java.lang.Object) (-1.0d));
        defaultedMap1.putAll((java.util.Map) defaultedMap40);
        java.util.Set set45 = defaultedMap40.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.keySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        defaultedMap12.clear();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) '4');
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) '4');
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        boolean b29 = defaultedMap1.equals((java.lang.Object) defaultedMap28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b37 = fixedOrderComparator35.add((java.lang.Object) 100.0d);
        int i38 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b39 = fixedOrderComparator30.add((java.lang.Object) fixedOrderComparator35);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator35);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 100.0d);
        int i8 = fixedOrderComparator5.getUnknownObjectBehavior();
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator5);
        int i10 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate24);
        int i28 = defaultedMap12.size();
        int i29 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set35 = defaultedMap34.keySet();
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        boolean b38 = defaultedMap31.equals((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap31.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj44 = defaultedMap31.get((java.lang.Object) obj_array42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator46);
        boolean b48 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator46);
        int i49 = fixedOrderComparator46.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.util.Collection collection16 = defaultedMap13.values();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) 100.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj24 = defaultedMap13.put((java.lang.Object) b22, (java.lang.Object) predicate23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) ' ');
        boolean b33 = fixedOrderComparator30.isLocked();
        java.lang.Object obj34 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator30);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap21.clear();
        boolean b28 = fixedOrderComparator13.add((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set34 = defaultedMap33.keySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        boolean b37 = defaultedMap30.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator42.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj46 = defaultedMap30.put((java.lang.Object) fixedOrderComparator42, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set49 = defaultedMap48.keySet();
        defaultedMap48.clear();
        java.util.Set set51 = defaultedMap48.entrySet();
        boolean b52 = defaultedMap30.equals((java.lang.Object) set51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection55 = defaultedMap54.values();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        boolean b57 = defaultedMap54.equals((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set60 = defaultedMap59.keySet();
        defaultedMap59.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set64 = defaultedMap63.keySet();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set70 = defaultedMap69.keySet();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate71);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate56, predicate65);
        int i76 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set79 = defaultedMap78.keySet();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set82 = defaultedMap81.keySet();
        defaultedMap78.putAll((java.util.Map) defaultedMap81);
        java.lang.Object obj85 = defaultedMap81.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set88 = defaultedMap87.keySet();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set91 = defaultedMap90.keySet();
        defaultedMap87.putAll((java.util.Map) defaultedMap90);
        defaultedMap87.clear();
        java.lang.Object obj94 = defaultedMap81.get((java.lang.Object) defaultedMap87);
        java.lang.Object obj96 = defaultedMap87.get((java.lang.Object) 1);
        boolean b97 = defaultedMap87.isEmpty();
        java.util.Set set98 = defaultedMap87.keySet();
        java.lang.Object obj99 = defaultedMap21.put((java.lang.Object) defaultedMap30, (java.lang.Object) set98);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(i76 == 1);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + false + "'", obj85.equals(false));
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + false + "'", obj94.equals(false));
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + false + "'", obj96.equals(false));
        org.junit.Assert.assertTrue(b97 == true);
        org.junit.Assert.assertNotNull(set98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) b13, (java.lang.Object) predicate14);
        java.util.Set set16 = defaultedMap4.keySet();
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Set set23 = defaultedMap21.entrySet();
        java.lang.Object obj24 = defaultedMap10.remove((java.lang.Object) set23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        boolean b10 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.util.Set set17 = defaultedMap12.entrySet();
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate32);
        int i36 = defaultedMap20.size();
        java.lang.Object obj37 = defaultedMap12.get((java.lang.Object) defaultedMap20);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(2);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set49 = defaultedMap48.keySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap48);
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set54 = defaultedMap53.keySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set57 = defaultedMap56.keySet();
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        java.util.Collection collection59 = defaultedMap56.values();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        boolean b65 = fixedOrderComparator63.add((java.lang.Object) 100.0d);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap56.put((java.lang.Object) b65, (java.lang.Object) predicate66);
        boolean b68 = defaultedMap45.equals((java.lang.Object) predicate66);
        boolean b69 = defaultedMap1.equals((java.lang.Object) b68);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap13.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap31.clear();
        java.util.Set set34 = defaultedMap31.entrySet();
        boolean b35 = defaultedMap13.equals((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap37.equals((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate54);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate39, predicate48);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set62 = defaultedMap61.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set65 = defaultedMap64.keySet();
        defaultedMap61.putAll((java.util.Map) defaultedMap64);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set71 = defaultedMap70.keySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set74 = defaultedMap73.keySet();
        defaultedMap70.putAll((java.util.Map) defaultedMap73);
        defaultedMap70.clear();
        java.lang.Object obj77 = defaultedMap64.get((java.lang.Object) defaultedMap70);
        java.lang.Object obj79 = defaultedMap70.get((java.lang.Object) 1);
        int i80 = defaultedMap70.size();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set83 = defaultedMap82.keySet();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set86 = defaultedMap85.keySet();
        defaultedMap82.putAll((java.util.Map) defaultedMap85);
        java.lang.Object obj89 = defaultedMap85.get((java.lang.Object) 10L);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, obj89);
        boolean b91 = defaultedMap1.containsValue((java.lang.Object) defaultedMap70);
        collections.Factory factory92 = null;
        try {
            java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + false + "'", obj68.equals(false));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + false + "'", obj77.equals(false));
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + false + "'", obj79.equals(false));
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + false + "'", obj89.equals(false));
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 100.0d);
        int i8 = fixedOrderComparator5.getUnknownObjectBehavior();
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator5);
        int i10 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate24);
        int i28 = defaultedMap12.size();
        int i29 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set35 = defaultedMap34.keySet();
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        boolean b38 = defaultedMap31.equals((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap31.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj44 = defaultedMap31.get((java.lang.Object) obj_array42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator46);
        boolean b48 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set51 = defaultedMap50.keySet();
        defaultedMap50.clear();
        java.util.Set set53 = defaultedMap50.entrySet();
        boolean b54 = fixedOrderComparator46.add((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.keySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        defaultedMap12.clear();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap21.put(obj23, (java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection29 = defaultedMap28.values();
        boolean b30 = defaultedMap10.containsValue((java.lang.Object) collection29);
        defaultedMap10.clear();
        java.util.Set set32 = defaultedMap10.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap13.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap31.clear();
        java.util.Set set34 = defaultedMap31.entrySet();
        boolean b35 = defaultedMap13.equals((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap37.equals((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate54);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate39, predicate48);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        int i60 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate64, predicate65);
        java.lang.Object obj68 = defaultedMap1.put((java.lang.Object) predicate65, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 100.0d);
        int i6 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b7 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection16 = defaultedMap15.values();
        java.util.Collection collection17 = defaultedMap15.values();
        try {
            int i18 = fixedOrderComparator3.compare((java.lang.Object) defaultedMap9, (java.lang.Object) collection17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate13);
        int i17 = defaultedMap1.size();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b27 = defaultedMap20.equals((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap20.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) obj_array31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        int i20 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i23 = defaultedMap22.size();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (-1.0d));
        java.util.Collection collection26 = defaultedMap22.values();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        java.util.Set set34 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Object obj40 = defaultedMap36.put(obj38, (java.lang.Object) 1.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, obj38);
        java.lang.Object obj42 = defaultedMap22.get(obj38);
        boolean b43 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.util.Set set50 = defaultedMap45.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap52);
        boolean b54 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set57 = defaultedMap56.keySet();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        java.util.Set set61 = defaultedMap56.entrySet();
        java.lang.Object obj62 = defaultedMap52.get((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set65 = defaultedMap64.keySet();
        defaultedMap64.clear();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set69 = defaultedMap68.keySet();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set75 = defaultedMap74.keySet();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate76, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate70, predicate76);
        int i80 = defaultedMap64.size();
        java.lang.Object obj81 = defaultedMap56.get((java.lang.Object) defaultedMap64);
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj83 = defaultedMap10.put((java.lang.Object) b43, (java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap56);
        int i85 = defaultedMap56.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + false + "'", obj42.equals(false));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + false + "'", obj62.equals(false));
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + false + "'", obj81.equals(false));
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(i85 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap7.equals((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap7.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = defaultedMap7.get((java.lang.Object) obj_array18);
        boolean b21 = defaultedMap1.containsValue(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection24 = defaultedMap23.values();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap23.equals((java.lang.Object) predicate25);
        defaultedMap23.clear();
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false + "'", obj20.equals(false));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap7.equals((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap7.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = defaultedMap7.get((java.lang.Object) obj_array18);
        boolean b21 = defaultedMap1.containsValue(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set41 = defaultedMap40.keySet();
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        java.util.Collection collection43 = defaultedMap40.values();
        boolean b45 = defaultedMap40.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj48 = defaultedMap40.put((java.lang.Object) predicate46, (java.lang.Object) (byte) 10);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate34, predicate46);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) predicate46);
        java.util.Collection collection51 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false + "'", obj20.equals(false));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.keySet();
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap4.put((java.lang.Object) b13, (java.lang.Object) predicate14);
        java.util.Set set16 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.keySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 0);
        defaultedMap4.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set46 = defaultedMap45.keySet();
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        java.util.Collection collection48 = defaultedMap45.values();
        boolean b50 = defaultedMap45.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj53 = defaultedMap45.put((java.lang.Object) predicate51, (java.lang.Object) (byte) 10);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate39, predicate51);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set57 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set60 = defaultedMap59.keySet();
        defaultedMap56.putAll((java.util.Map) defaultedMap59);
        java.util.Collection collection62 = defaultedMap59.values();
        boolean b64 = defaultedMap59.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap59.put((java.lang.Object) predicate65, (java.lang.Object) (byte) 10);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate39, predicate65);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.keySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.keySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        defaultedMap12.clear();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i23 = defaultedMap22.size();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (-1.0d));
        java.util.Collection collection26 = defaultedMap22.values();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        java.util.Set set34 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Object obj40 = defaultedMap36.put(obj38, (java.lang.Object) 1.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, obj38);
        java.lang.Object obj42 = defaultedMap22.get(obj38);
        boolean b43 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set49 = defaultedMap48.keySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap48);
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set54 = defaultedMap53.keySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set57 = defaultedMap56.keySet();
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        java.util.Collection collection59 = defaultedMap56.values();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        boolean b65 = fixedOrderComparator63.add((java.lang.Object) 100.0d);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap56.put((java.lang.Object) b65, (java.lang.Object) predicate66);
        boolean b68 = defaultedMap45.equals((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap22.get((java.lang.Object) predicate66);
        boolean b70 = defaultedMap6.containsKey((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + false + "'", obj42.equals(false));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + false + "'", obj69.equals(false));
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap21.put(obj23, (java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection34 = defaultedMap31.values();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b40 = fixedOrderComparator38.add((java.lang.Object) 100.0d);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap31.put((java.lang.Object) b40, (java.lang.Object) predicate41);
        boolean b43 = defaultedMap10.equals(obj42);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap13.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap31.clear();
        java.util.Set set34 = defaultedMap31.entrySet();
        boolean b35 = defaultedMap13.equals((java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap37.equals((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate54);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate39, predicate48);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set62 = defaultedMap61.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set65 = defaultedMap64.keySet();
        defaultedMap61.putAll((java.util.Map) defaultedMap64);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set71 = defaultedMap70.keySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set74 = defaultedMap73.keySet();
        defaultedMap70.putAll((java.util.Map) defaultedMap73);
        defaultedMap70.clear();
        java.lang.Object obj77 = defaultedMap64.get((java.lang.Object) defaultedMap70);
        java.lang.Object obj79 = defaultedMap70.get((java.lang.Object) 1);
        int i80 = defaultedMap70.size();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set83 = defaultedMap82.keySet();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set86 = defaultedMap85.keySet();
        defaultedMap82.putAll((java.util.Map) defaultedMap85);
        java.lang.Object obj89 = defaultedMap85.get((java.lang.Object) 10L);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, obj89);
        boolean b91 = defaultedMap1.containsValue((java.lang.Object) defaultedMap70);
        java.lang.String str92 = defaultedMap70.toString();
        java.util.Set set93 = defaultedMap70.keySet();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + false + "'", obj68.equals(false));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + false + "'", obj77.equals(false));
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + false + "'", obj79.equals(false));
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + false + "'", obj89.equals(false));
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "{}" + "'", str92.equals("{}"));
        org.junit.Assert.assertNotNull(set93);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap10);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) 1);
        boolean b20 = defaultedMap10.isEmpty();
        defaultedMap10.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection7 = defaultedMap4.values();
        boolean b9 = defaultedMap4.containsValue((java.lang.Object) (short) -1);
        java.util.Set set10 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.keySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i24 = defaultedMap23.size();
        java.util.Collection collection25 = defaultedMap23.values();
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        boolean b27 = defaultedMap12.equals((java.lang.Object) defaultedMap23);
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + false + "'", obj28.equals(false));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate13);
        int i17 = defaultedMap1.size();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b27 = defaultedMap20.equals((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap20.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) obj_array31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set41 = defaultedMap40.keySet();
        defaultedMap40.clear();
        java.util.Set set43 = defaultedMap40.keySet();
        java.util.Set set44 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set50 = defaultedMap49.keySet();
        defaultedMap46.putAll((java.util.Map) defaultedMap49);
        boolean b53 = defaultedMap46.equals((java.lang.Object) 0);
        java.lang.Object obj55 = defaultedMap46.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj59 = defaultedMap46.get((java.lang.Object) obj_array57);
        boolean b60 = defaultedMap40.containsValue(obj59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set66 = defaultedMap65.keySet();
        defaultedMap62.putAll((java.util.Map) defaultedMap65);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set71 = defaultedMap70.keySet();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set77 = defaultedMap76.keySet();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set80 = defaultedMap79.keySet();
        defaultedMap76.putAll((java.util.Map) defaultedMap79);
        java.util.Collection collection82 = defaultedMap79.values();
        boolean b84 = defaultedMap79.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj87 = defaultedMap79.put((java.lang.Object) predicate85, (java.lang.Object) (byte) 10);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate73, predicate85);
        java.lang.Object obj89 = defaultedMap40.remove((java.lang.Object) predicate85);
        try {
            int i90 = fixedOrderComparator37.compare(obj38, obj89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + false + "'", obj59.equals(false));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate13);
        int i17 = defaultedMap1.size();
        int i18 = defaultedMap1.size();
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.String str8 = defaultedMap1.toString();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.keySet();
        defaultedMap11.clear();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Set set15 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        boolean b24 = defaultedMap17.equals((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap17.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) obj_array28);
        boolean b31 = defaultedMap11.containsValue(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set37 = defaultedMap36.keySet();
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set42 = defaultedMap41.keySet();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set48 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set51 = defaultedMap50.keySet();
        defaultedMap47.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection53 = defaultedMap50.values();
        boolean b55 = defaultedMap50.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj58 = defaultedMap50.put((java.lang.Object) predicate56, (java.lang.Object) (byte) 10);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate44, predicate56);
        java.lang.Object obj60 = defaultedMap11.remove((java.lang.Object) predicate56);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate56);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator13, (java.lang.Object) (byte) 1);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) 0.0f);
        int i20 = fixedOrderComparator13.getUnknownObjectBehavior();
        boolean b21 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate29, predicate35);
        int i39 = defaultedMap23.size();
        int i40 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set46 = defaultedMap45.keySet();
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        boolean b49 = defaultedMap42.equals((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap42.remove((java.lang.Object) '#');
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object obj55 = defaultedMap42.get((java.lang.Object) obj_array53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        boolean b64 = fixedOrderComparator62.add((java.lang.Object) 100.0d);
        int i65 = fixedOrderComparator62.getUnknownObjectBehavior();
        boolean b66 = fixedOrderComparator57.add((java.lang.Object) fixedOrderComparator62);
        int i67 = fixedOrderComparator13.compare((java.lang.Object) defaultedMap23, (java.lang.Object) fixedOrderComparator57);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + false + "'", obj55.equals(false));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(i67 == 0);
    }
}

