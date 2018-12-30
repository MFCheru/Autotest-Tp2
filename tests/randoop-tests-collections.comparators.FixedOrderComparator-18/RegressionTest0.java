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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
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
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        try {
            int i7 = fixedOrderComparator4.compare(obj5, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            int i7 = fixedOrderComparator4.compare((java.lang.Object) 10L, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        try {
            int i16 = fixedOrderComparator12.compare((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) ' ');
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1));
        java.lang.Object obj18 = defaultedMap9.remove((java.lang.Object) (byte) 10);
        try {
            boolean b19 = fixedOrderComparator4.addAsEqual((java.lang.Object) 10L, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        int i24 = defaultedMap19.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array29 = new java.lang.Object[] { true, defaultedMap28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) predicate37);
        defaultedMap36.clear();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        int i41 = defaultedMap36.size();
        java.util.Set set42 = defaultedMap36.keySet();
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) b32, (java.lang.Object) set42);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) predicate11);
        defaultedMap10.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection15 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) false);
        try {
            int i20 = fixedOrderComparator4.compare((java.lang.Object) collection15, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        defaultedMap18.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        int i23 = defaultedMap18.size();
        java.util.Set set24 = defaultedMap18.keySet();
        java.util.Set set25 = defaultedMap18.keySet();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) set25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        boolean b29 = defaultedMap1.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        defaultedMap17.clear();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { true, defaultedMap24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj27 = defaultedMap15.get((java.lang.Object) fixedOrderComparator26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) predicate31);
        boolean b33 = defaultedMap30.isEmpty();
        java.util.Set set34 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) '4');
        java.util.Set set39 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) predicate44);
        defaultedMap43.clear();
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        int i48 = defaultedMap43.size();
        java.util.Set set49 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set52 = defaultedMap51.entrySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) set52);
        java.lang.Object obj56 = defaultedMap43.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) predicate61);
        defaultedMap60.clear();
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array68 = new java.lang.Object[] { true, defaultedMap67 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        java.lang.Object obj70 = defaultedMap58.get((java.lang.Object) fixedOrderComparator69);
        java.lang.Object obj72 = defaultedMap58.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        boolean b78 = defaultedMap76.containsKey((java.lang.Object) predicate77);
        defaultedMap76.clear();
        defaultedMap74.putAll((java.util.Map) defaultedMap76);
        int i81 = defaultedMap76.size();
        defaultedMap58.putAll((java.util.Map) defaultedMap76);
        java.lang.Object[] obj_array83 = new java.lang.Object[] { defaultedMap15, 0L, defaultedMap30, set39, '#', defaultedMap76 };
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        boolean b90 = defaultedMap88.containsKey((java.lang.Object) predicate89);
        defaultedMap88.clear();
        defaultedMap86.putAll((java.util.Map) defaultedMap88);
        int i93 = defaultedMap88.size();
        java.util.Set set94 = defaultedMap88.keySet();
        collections.map.DefaultedMap defaultedMap96 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set97 = defaultedMap96.entrySet();
        java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap88, (java.lang.Object) set97);
        try {
            boolean b99 = fixedOrderComparator12.addAsEqual((java.lang.Object) fixedOrderComparator84, (java.lang.Object) set97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + ' ' + "'", obj27.equals(' '));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + ' ' + "'", obj70.equals(' '));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(i93 == 0);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i16 = defaultedMap11.size();
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        boolean b33 = fixedOrderComparator5.addAsEqual((java.lang.Object) map21, obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) predicate38);
        defaultedMap37.clear();
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        int i42 = defaultedMap37.size();
        java.util.Set set43 = defaultedMap37.keySet();
        java.util.Set set44 = defaultedMap37.keySet();
        try {
            boolean b46 = fixedOrderComparator5.addAsEqual((java.lang.Object) set44, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, (java.lang.Object) (byte) 1);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) predicate6);
        defaultedMap5.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array13 = new java.lang.Object[] { true, defaultedMap12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap3.get((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj17 = defaultedMap3.remove((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) predicate21);
        boolean b23 = defaultedMap20.isEmpty();
        java.util.Set set24 = defaultedMap20.keySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap20);
        try {
            boolean b26 = fixedOrderComparator0.addAsEqual(obj1, (java.lang.Object) defaultedMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) predicate11);
        defaultedMap10.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        int i15 = defaultedMap10.size();
        java.util.Set set16 = defaultedMap10.keySet();
        java.util.Set set17 = defaultedMap10.keySet();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) set17);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + ' ' + "'", obj6.equals(' '));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i34 = defaultedMap29.size();
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) set38);
        java.lang.Object obj42 = defaultedMap29.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { true, defaultedMap53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        defaultedMap62.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i67 = defaultedMap62.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap62);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { defaultedMap1, 0L, defaultedMap16, set25, '#', defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        boolean b71 = fixedOrderComparator70.isLocked();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set12);
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) ' ');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1));
        java.lang.Object obj27 = defaultedMap18.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = defaultedMap3.get(obj27);
        java.util.Set set29 = defaultedMap3.keySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + ' ' + "'", obj28.equals(' '));
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        defaultedMap1.clear();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 2);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' ' + "'", obj10.equals(' '));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1));
        java.lang.Object obj13 = defaultedMap4.remove((java.lang.Object) (byte) 10);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "hi!", obj16);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap1.containsKey(obj13);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        java.util.Set set10 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) predicate15);
        defaultedMap14.clear();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) ' ');
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) predicate31);
        defaultedMap30.clear();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        int i35 = defaultedMap30.size();
        java.util.Set set36 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap38.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) set39);
        boolean b41 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) predicate46);
        defaultedMap45.clear();
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        int i50 = defaultedMap45.size();
        java.util.Set set51 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set54 = defaultedMap53.entrySet();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) set54);
        java.lang.Object obj56 = defaultedMap30.get((java.lang.Object) map55);
        boolean b57 = defaultedMap14.containsValue((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array61 = new java.lang.Object[] { true, defaultedMap60 };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj63 = defaultedMap30.get((java.lang.Object) obj_array61);
        boolean b64 = defaultedMap3.equals(obj63);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + ' ' + "'", obj26.equals(' '));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + ' ' + "'", obj63.equals(' '));
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) predicate11);
        defaultedMap10.clear();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) (-1.0f));
        boolean b16 = defaultedMap3.containsKey(obj15);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set12);
        boolean b14 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        defaultedMap18.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        int i23 = defaultedMap18.size();
        java.util.Set set24 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        defaultedMap28.clear();
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array36 = new java.lang.Object[] { true, defaultedMap35 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj38 = defaultedMap26.get((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap26.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) predicate44);
        boolean b46 = defaultedMap43.isEmpty();
        java.util.Set set47 = defaultedMap43.keySet();
        defaultedMap26.putAll((java.util.Map) defaultedMap43);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap43);
        defaultedMap3.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap3.containsValue(obj51);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + ' ' + "'", obj38.equals(' '));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        defaultedMap17.clear();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        int i22 = defaultedMap17.size();
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1));
        java.lang.Object obj38 = defaultedMap29.remove((java.lang.Object) (byte) 10);
        boolean b39 = fixedOrderComparator11.addAsEqual((java.lang.Object) map27, obj38);
        defaultedMap1.putAll(map27);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) predicate9);
        defaultedMap8.clear();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        int i13 = defaultedMap8.size();
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) set17);
        boolean b19 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        defaultedMap23.clear();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        int i28 = defaultedMap23.size();
        java.util.Set set29 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set32 = defaultedMap31.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set32);
        java.lang.Object obj34 = defaultedMap8.get((java.lang.Object) map33);
        boolean b36 = defaultedMap8.containsKey((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + ' ' + "'", obj34.equals(' '));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + ' ' + "'", obj37.equals(' '));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + ' ' + "'", obj6.equals(' '));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 1L);
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) '4');
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b17, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { true, defaultedMap22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array29 = new java.lang.Object[] { true, defaultedMap28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) '4');
        boolean b38 = fixedOrderComparator31.add((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) fixedOrderComparator31);
        try {
            fixedOrderComparator31.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) ' ');
        java.lang.Object obj15 = defaultedMap3.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        int i24 = defaultedMap19.size();
        java.util.Set set25 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap27.entrySet();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) set28);
        boolean b30 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) predicate35);
        defaultedMap34.clear();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        int i39 = defaultedMap34.size();
        java.util.Set set40 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set43 = defaultedMap42.entrySet();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) set43);
        java.lang.Object obj45 = defaultedMap19.get((java.lang.Object) map44);
        boolean b46 = defaultedMap3.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array50 = new java.lang.Object[] { true, defaultedMap49 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj52 = defaultedMap19.get((java.lang.Object) obj_array50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set56 = defaultedMap55.entrySet();
        java.lang.Object obj57 = defaultedMap19.put((java.lang.Object) 0.0d, (java.lang.Object) set56);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' ' + "'", obj45.equals(' '));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + ' ' + "'", obj52.equals(' '));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array12 = new java.lang.Object[] { true, defaultedMap11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b16 = fixedOrderComparator14.add((java.lang.Object) 10);
        boolean b17 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) predicate22);
        defaultedMap21.clear();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b26 = fixedOrderComparator14.add((java.lang.Object) defaultedMap19);
        try {
            boolean b27 = fixedOrderComparator5.addAsEqual((java.lang.Object) ' ', (java.lang.Object) b26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) '4');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) set11);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + ' ' + "'", obj14.equals(' '));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        boolean b21 = defaultedMap18.isEmpty();
        java.util.Set set22 = defaultedMap18.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i34 = defaultedMap29.size();
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) set38);
        java.lang.Object obj42 = defaultedMap29.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { true, defaultedMap53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        defaultedMap62.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i67 = defaultedMap62.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap62);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { defaultedMap1, 0L, defaultedMap16, set25, '#', defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) predicate75);
        defaultedMap74.clear();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        int i79 = defaultedMap74.size();
        java.util.Set set80 = defaultedMap74.keySet();
        boolean b81 = fixedOrderComparator70.add((java.lang.Object) set80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array85 = new java.lang.Object[] { true, defaultedMap84 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        boolean b88 = fixedOrderComparator70.add((java.lang.Object) obj_array85);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        boolean b92 = defaultedMap90.containsKey((java.lang.Object) predicate91);
        boolean b93 = defaultedMap90.isEmpty();
        defaultedMap90.clear();
        java.lang.Object obj95 = null;
        try {
            int i96 = fixedOrderComparator70.compare((java.lang.Object) defaultedMap90, obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        java.util.Set set11 = defaultedMap4.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) predicate14);
        defaultedMap13.clear();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array21 = new java.lang.Object[] { true, defaultedMap20 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj25 = defaultedMap11.remove((java.lang.Object) (-1.0f));
        java.util.Set set26 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        boolean b31 = defaultedMap28.isEmpty();
        java.util.Set set32 = defaultedMap28.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap28);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap28);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + ' ' + "'", obj23.equals(' '));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i34 = defaultedMap29.size();
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) set38);
        java.lang.Object obj42 = defaultedMap29.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { true, defaultedMap53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        defaultedMap62.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i67 = defaultedMap62.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap62);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { defaultedMap1, 0L, defaultedMap16, set25, '#', defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) predicate75);
        defaultedMap74.clear();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        int i79 = defaultedMap74.size();
        java.util.Set set80 = defaultedMap74.keySet();
        boolean b81 = fixedOrderComparator70.add((java.lang.Object) set80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array85 = new java.lang.Object[] { true, defaultedMap84 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        boolean b88 = fixedOrderComparator70.add((java.lang.Object) obj_array85);
        try {
            fixedOrderComparator70.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i16 = defaultedMap11.size();
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        boolean b33 = fixedOrderComparator5.addAsEqual((java.lang.Object) map21, obj32);
        boolean b34 = fixedOrderComparator5.isLocked();
        boolean b35 = fixedOrderComparator5.isLocked();
        fixedOrderComparator5.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) '4');
        java.util.Set set18 = defaultedMap15.entrySet();
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) '4');
        java.util.Set set24 = defaultedMap21.entrySet();
        java.util.Set set25 = defaultedMap21.keySet();
        boolean b26 = defaultedMap15.equals((java.lang.Object) set25);
        java.lang.Object obj28 = defaultedMap15.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) predicate33);
        defaultedMap32.clear();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        int i37 = defaultedMap32.size();
        java.util.Set set38 = defaultedMap32.keySet();
        java.util.Set set39 = defaultedMap32.keySet();
        java.util.Collection collection40 = defaultedMap32.values();
        boolean b41 = defaultedMap15.containsValue((java.lang.Object) collection40);
        boolean b42 = defaultedMap1.equals((java.lang.Object) b41);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + ' ' + "'", obj28.equals(' '));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set17 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        boolean b22 = defaultedMap19.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 1L);
        boolean b25 = defaultedMap16.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) '4');
        java.util.Set set30 = defaultedMap27.entrySet();
        java.util.Set set31 = defaultedMap27.keySet();
        int i32 = defaultedMap27.size();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap27);
        try {
            boolean b34 = fixedOrderComparator13.addAsEqual((java.lang.Object) 1.0d, (java.lang.Object) map33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) '4');
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b17, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { true, defaultedMap22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array29 = new java.lang.Object[] { true, defaultedMap28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) '4');
        boolean b38 = fixedOrderComparator31.add((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) fixedOrderComparator31);
        try {
            fixedOrderComparator24.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        int i8 = fixedOrderComparator5.getUnknownObjectBehavior();
        try {
            fixedOrderComparator5.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set12);
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) ' ');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1));
        java.lang.Object obj27 = defaultedMap18.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = defaultedMap3.get(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) predicate33);
        boolean b35 = defaultedMap32.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 1L);
        boolean b38 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj39 = defaultedMap3.get((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + ' ' + "'", obj28.equals(' '));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + ' ' + "'", obj39.equals(' '));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        java.util.Set set10 = defaultedMap3.keySet();
        int i11 = defaultedMap3.size();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set17 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        boolean b22 = defaultedMap19.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 1L);
        boolean b25 = defaultedMap16.containsValue((java.lang.Object) defaultedMap19);
        java.lang.Object obj26 = defaultedMap3.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + ' ' + "'", obj26.equals(' '));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) ' ');
        java.lang.Object obj15 = defaultedMap3.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap17.entrySet();
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) set18);
        java.lang.Object obj21 = defaultedMap3.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { true, defaultedMap24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b29 = defaultedMap3.equals((java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array25);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + ' ' + "'", obj19.equals(' '));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        boolean b21 = defaultedMap18.isEmpty();
        java.util.Set set22 = defaultedMap18.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) predicate7);
        defaultedMap6.clear();
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100);
        java.util.Collection collection13 = defaultedMap6.values();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) collection13);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + ' ' + "'", obj12.equals(' '));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator5.isLocked();
        try {
            fixedOrderComparator5.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b13 = defaultedMap4.containsValue((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        defaultedMap17.clear();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        int i22 = defaultedMap17.size();
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) set26);
        java.lang.Object obj30 = defaultedMap17.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) ' ');
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1));
        java.lang.Object obj41 = defaultedMap32.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = defaultedMap17.get(obj41);
        java.lang.Object obj43 = defaultedMap12.get(obj42);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + ' ' + "'", obj42.equals(' '));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) '4');
        java.util.Set set15 = defaultedMap12.entrySet();
        java.util.Set set16 = defaultedMap12.keySet();
        int i17 = defaultedMap12.size();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap12);
        defaultedMap12.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) '4');
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b17, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { true, defaultedMap22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array29 = new java.lang.Object[] { true, defaultedMap28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) '4');
        boolean b38 = fixedOrderComparator31.add((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) fixedOrderComparator31);
        try {
            fixedOrderComparator31.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        defaultedMap16.clear();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        int i21 = defaultedMap16.size();
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) set25);
        java.util.Set set28 = defaultedMap1.entrySet();
        java.util.Set set29 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) predicate10);
        defaultedMap9.clear();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array17 = new java.lang.Object[] { true, defaultedMap16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) fixedOrderComparator18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) false);
        boolean b24 = fixedOrderComparator4.addAsEqual((java.lang.Object) defaultedMap7, obj23);
        java.util.Set set25 = defaultedMap7.keySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + ' ' + "'", obj19.equals(' '));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) (short) 0);
        int i11 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i16 = defaultedMap11.size();
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        boolean b33 = fixedOrderComparator5.addAsEqual((java.lang.Object) map21, obj32);
        boolean b34 = fixedOrderComparator5.isLocked();
        int i35 = fixedOrderComparator5.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) predicate38);
        boolean b40 = defaultedMap37.isEmpty();
        java.util.Set set41 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array45 = new java.lang.Object[] { true, defaultedMap44 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b48 = defaultedMap37.containsKey((java.lang.Object) obj_array45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) '4');
        boolean b53 = defaultedMap50.isEmpty();
        java.lang.Object obj55 = defaultedMap37.put((java.lang.Object) b53, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array59 = new java.lang.Object[] { true, defaultedMap58 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        boolean b61 = fixedOrderComparator60.isLocked();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array65 = new java.lang.Object[] { true, defaultedMap64 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b69 = fixedOrderComparator67.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj73 = defaultedMap71.remove((java.lang.Object) '4');
        boolean b74 = fixedOrderComparator67.add((java.lang.Object) defaultedMap71);
        java.lang.Object obj75 = defaultedMap37.put((java.lang.Object) fixedOrderComparator60, (java.lang.Object) fixedOrderComparator67);
        boolean b76 = fixedOrderComparator5.add((java.lang.Object) fixedOrderComparator67);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) predicate13);
        boolean b15 = defaultedMap12.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1L);
        boolean b18 = defaultedMap9.containsValue((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) '4');
        java.util.Set set23 = defaultedMap20.entrySet();
        java.util.Set set24 = defaultedMap20.keySet();
        int i25 = defaultedMap20.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap20);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) map26);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) '4');
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b17, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { true, defaultedMap22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array29 = new java.lang.Object[] { true, defaultedMap28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) '4');
        boolean b38 = fixedOrderComparator31.add((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) fixedOrderComparator31);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap1.remove(obj40);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) predicate14);
        defaultedMap13.clear();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array21 = new java.lang.Object[] { true, defaultedMap20 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj25 = defaultedMap11.remove((java.lang.Object) (-1.0f));
        java.util.Set set26 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        boolean b31 = defaultedMap28.isEmpty();
        java.util.Set set32 = defaultedMap28.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap28);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap28);
        int i35 = defaultedMap28.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + ' ' + "'", obj23.equals(' '));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set12);
        boolean b14 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        defaultedMap18.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        int i23 = defaultedMap18.size();
        java.util.Set set24 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set27 = defaultedMap26.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) set27);
        java.lang.Object obj29 = defaultedMap3.get((java.lang.Object) map28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array33 = new java.lang.Object[] { true, defaultedMap32 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b37 = fixedOrderComparator35.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) predicate42);
        defaultedMap41.clear();
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        int i46 = defaultedMap41.size();
        java.util.Set set47 = defaultedMap41.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set50 = defaultedMap49.entrySet();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) set50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) ' ');
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) (-1));
        java.lang.Object obj62 = defaultedMap53.remove((java.lang.Object) (byte) 10);
        boolean b63 = fixedOrderComparator35.addAsEqual((java.lang.Object) map51, obj62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) predicate68);
        defaultedMap67.clear();
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        int i72 = defaultedMap67.size();
        java.util.Set set73 = defaultedMap67.keySet();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set76 = defaultedMap75.entrySet();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) set76);
        java.lang.Object obj80 = defaultedMap67.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        boolean b84 = defaultedMap82.containsKey((java.lang.Object) predicate83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) ' ');
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) (-1));
        java.lang.Object obj91 = defaultedMap82.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj92 = defaultedMap67.get(obj91);
        java.util.Map map93 = collections.map.DefaultedMap.decorate(map51, obj91);
        java.lang.Object obj94 = defaultedMap3.get((java.lang.Object) map51);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + ' ' + "'", obj29.equals(' '));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + ' ' + "'", obj92.equals(' '));
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + ' ' + "'", obj94.equals(' '));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i34 = defaultedMap29.size();
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) set38);
        java.lang.Object obj42 = defaultedMap29.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { true, defaultedMap53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        defaultedMap62.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i67 = defaultedMap62.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap62);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { defaultedMap1, 0L, defaultedMap16, set25, '#', defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) predicate75);
        defaultedMap74.clear();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        int i79 = defaultedMap74.size();
        java.util.Set set80 = defaultedMap74.keySet();
        boolean b81 = fixedOrderComparator70.add((java.lang.Object) set80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array85 = new java.lang.Object[] { true, defaultedMap84 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        boolean b88 = fixedOrderComparator70.add((java.lang.Object) obj_array85);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array92 = new java.lang.Object[] { true, defaultedMap91 };
        collections.comparators.FixedOrderComparator fixedOrderComparator93 = new collections.comparators.FixedOrderComparator(obj_array92);
        collections.comparators.FixedOrderComparator fixedOrderComparator94 = new collections.comparators.FixedOrderComparator(obj_array92);
        boolean b95 = fixedOrderComparator70.add((java.lang.Object) obj_array92);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(obj_array92);
        org.junit.Assert.assertTrue(b95 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i16 = defaultedMap11.size();
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        boolean b33 = fixedOrderComparator5.addAsEqual((java.lang.Object) map21, obj32);
        boolean b34 = fixedOrderComparator5.isLocked();
        boolean b35 = fixedOrderComparator5.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) predicate38);
        boolean b40 = fixedOrderComparator5.add((java.lang.Object) defaultedMap37);
        int i41 = fixedOrderComparator5.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) '4');
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b17, (java.lang.Object) false);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) '4');
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b17, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { true, defaultedMap22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array29 = new java.lang.Object[] { true, defaultedMap28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) '4');
        boolean b38 = fixedOrderComparator31.add((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) fixedOrderComparator31);
        int i40 = fixedOrderComparator31.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i40 == 2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1));
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) predicate9);
        defaultedMap8.clear();
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey(obj13);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i16 = defaultedMap11.size();
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        boolean b33 = fixedOrderComparator5.addAsEqual((java.lang.Object) map21, obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) ' ');
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (-1));
        java.lang.Object obj44 = defaultedMap35.remove((java.lang.Object) (byte) 10);
        boolean b46 = defaultedMap35.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) predicate51);
        defaultedMap50.clear();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        int i55 = defaultedMap50.size();
        java.util.Set set56 = defaultedMap50.keySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set59 = defaultedMap58.entrySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) set59);
        java.lang.Object obj61 = defaultedMap35.remove((java.lang.Object) set59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) '4');
        java.util.Set set66 = defaultedMap63.entrySet();
        java.lang.Object obj67 = defaultedMap35.get((java.lang.Object) set66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array72 = new java.lang.Object[] { true, defaultedMap71 };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        try {
            int i74 = fixedOrderComparator5.compare((java.lang.Object) defaultedMap35, (java.lang.Object) obj_array72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + ' ' + "'", obj67.equals(' '));
        org.junit.Assert.assertNotNull(obj_array72);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 0);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) 10);
        java.lang.Object obj16 = defaultedMap1.put(obj7, (java.lang.Object) b15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection8 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        boolean b21 = defaultedMap18.isEmpty();
        java.util.Set set22 = defaultedMap18.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj24);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) '4');
        java.util.Set set15 = defaultedMap12.entrySet();
        java.util.Set set16 = defaultedMap12.keySet();
        int i17 = defaultedMap12.size();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) 10L);
        defaultedMap12.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i34 = defaultedMap29.size();
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) set38);
        java.lang.Object obj42 = defaultedMap29.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { true, defaultedMap53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        defaultedMap62.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i67 = defaultedMap62.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap62);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { defaultedMap1, 0L, defaultedMap16, set25, '#', defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) predicate75);
        defaultedMap74.clear();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        int i79 = defaultedMap74.size();
        java.util.Set set80 = defaultedMap74.keySet();
        boolean b81 = fixedOrderComparator70.add((java.lang.Object) set80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array85 = new java.lang.Object[] { true, defaultedMap84 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        boolean b88 = fixedOrderComparator70.add((java.lang.Object) obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array85);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) '4');
        boolean b12 = fixedOrderComparator5.add((java.lang.Object) defaultedMap9);
        boolean b13 = fixedOrderComparator5.isLocked();
        try {
            fixedOrderComparator5.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set12);
        boolean b14 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        defaultedMap18.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        int i23 = defaultedMap18.size();
        java.util.Set set24 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        defaultedMap28.clear();
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array36 = new java.lang.Object[] { true, defaultedMap35 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj38 = defaultedMap26.get((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap26.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) predicate44);
        boolean b46 = defaultedMap43.isEmpty();
        java.util.Set set47 = defaultedMap43.keySet();
        defaultedMap26.putAll((java.util.Map) defaultedMap43);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap43);
        defaultedMap3.putAll((java.util.Map) defaultedMap18);
        collections.Factory factory51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, factory51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + ' ' + "'", obj38.equals(' '));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        int i24 = defaultedMap19.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.isEmpty();
        java.lang.String str27 = defaultedMap19.toString();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        java.util.Set set10 = defaultedMap3.keySet();
        int i11 = defaultedMap3.size();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate12, predicate13);
        boolean b16 = defaultedMap3.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b13 = defaultedMap4.containsValue((java.lang.Object) defaultedMap12);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) (-1L));
        int i15 = fixedOrderComparator12.getUnknownObjectBehavior();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) i15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        java.util.Set set21 = defaultedMap18.entrySet();
        try {
            int i22 = fixedOrderComparator14.compare((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        defaultedMap17.clear();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { true, defaultedMap24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj27 = defaultedMap15.get((java.lang.Object) fixedOrderComparator26);
        java.lang.Object obj29 = defaultedMap15.remove((java.lang.Object) (-1.0f));
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 0.0f);
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + ' ' + "'", obj27.equals(' '));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) '4');
        boolean b12 = fixedOrderComparator5.add((java.lang.Object) defaultedMap9);
        int i13 = defaultedMap9.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        defaultedMap16.clear();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        int i21 = defaultedMap16.size();
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) set25);
        java.util.Set set28 = defaultedMap1.entrySet();
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Set set7 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b14 = defaultedMap3.containsKey((java.lang.Object) obj_array11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) '4');
        boolean b19 = defaultedMap16.isEmpty();
        java.lang.Object obj21 = defaultedMap3.put((java.lang.Object) b19, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { true, defaultedMap24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { true, defaultedMap30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) '4');
        boolean b40 = fixedOrderComparator33.add((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = defaultedMap3.put((java.lang.Object) fixedOrderComparator26, (java.lang.Object) fixedOrderComparator33);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) predicate46);
        defaultedMap45.clear();
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array53 = new java.lang.Object[] { true, defaultedMap52 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object obj55 = defaultedMap43.get((java.lang.Object) fixedOrderComparator54);
        java.lang.Object obj56 = defaultedMap3.get((java.lang.Object) defaultedMap43);
        boolean b57 = defaultedMap1.containsKey((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + ' ' + "'", obj55.equals(' '));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        defaultedMap16.clear();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array24 = new java.lang.Object[] { true, defaultedMap23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) fixedOrderComparator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        boolean b32 = defaultedMap29.isEmpty();
        java.util.Set set33 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) '4');
        java.util.Set set38 = defaultedMap35.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) predicate43);
        defaultedMap42.clear();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        int i47 = defaultedMap42.size();
        java.util.Set set48 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set51 = defaultedMap50.entrySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) set51);
        java.lang.Object obj55 = defaultedMap42.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) predicate60);
        defaultedMap59.clear();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array67 = new java.lang.Object[] { true, defaultedMap66 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        java.lang.Object obj69 = defaultedMap57.get((java.lang.Object) fixedOrderComparator68);
        java.lang.Object obj71 = defaultedMap57.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        boolean b77 = defaultedMap75.containsKey((java.lang.Object) predicate76);
        defaultedMap75.clear();
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        int i80 = defaultedMap75.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap75);
        java.lang.Object[] obj_array82 = new java.lang.Object[] { defaultedMap14, 0L, defaultedMap29, set38, '#', defaultedMap75 };
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array82);
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) fixedOrderComparator83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj88 = defaultedMap86.get((java.lang.Object) false);
        boolean b89 = fixedOrderComparator83.add((java.lang.Object) defaultedMap86);
        boolean b90 = fixedOrderComparator83.isLocked();
        boolean b91 = fixedOrderComparator83.isLocked();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + ' ' + "'", obj26.equals(' '));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + ' ' + "'", obj69.equals(' '));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(obj_array82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + ' ' + "'", obj84.equals(' '));
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + (byte) 0 + "'", obj88.equals((byte) 0));
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        int i24 = defaultedMap19.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.lang.String str26 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        boolean b31 = defaultedMap28.isEmpty();
        java.util.Set set32 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array36 = new java.lang.Object[] { true, defaultedMap35 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b39 = defaultedMap28.containsKey((java.lang.Object) obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) obj_array36);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + ' ' + "'", obj41.equals(' '));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array8 = new java.lang.Object[] { true, defaultedMap7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) 10);
        boolean b13 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        defaultedMap17.clear();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b22 = fixedOrderComparator10.add((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) predicate25);
        boolean b27 = defaultedMap24.isEmpty();
        java.util.Set set28 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array32 = new java.lang.Object[] { true, defaultedMap31 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b35 = defaultedMap24.containsKey((java.lang.Object) obj_array32);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) fixedOrderComparator10, (java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) predicate10);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        boolean b16 = fixedOrderComparator5.add((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        boolean b8 = fixedOrderComparator5.isLocked();
        fixedOrderComparator5.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator5.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) '4');
        boolean b12 = fixedOrderComparator5.add((java.lang.Object) defaultedMap9);
        boolean b13 = fixedOrderComparator5.isLocked();
        int i14 = fixedOrderComparator5.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) predicate15);
        defaultedMap14.clear();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array22 = new java.lang.Object[] { true, defaultedMap21 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) (-1L));
        int i26 = fixedOrderComparator23.getUnknownObjectBehavior();
        boolean b27 = defaultedMap12.containsValue((java.lang.Object) i26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1));
        java.lang.Object obj38 = defaultedMap29.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        int i51 = defaultedMap46.size();
        java.util.Set set52 = defaultedMap46.keySet();
        java.util.Set set53 = defaultedMap46.keySet();
        java.lang.Object obj54 = defaultedMap40.get((java.lang.Object) set53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap40);
        defaultedMap12.putAll(map55);
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) predicate62);
        defaultedMap61.clear();
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array69 = new java.lang.Object[] { true, defaultedMap68 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        java.lang.Object obj71 = defaultedMap59.get((java.lang.Object) fixedOrderComparator70);
        java.lang.Object obj73 = defaultedMap59.remove((java.lang.Object) (-1.0f));
        java.util.Set set74 = defaultedMap59.keySet();
        boolean b75 = defaultedMap1.equals((java.lang.Object) defaultedMap59);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' ' + "'", obj10.equals(' '));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 0 + "'", obj42.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 0 + "'", obj54.equals((byte) 0));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + ' ' + "'", obj71.equals(' '));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(b75 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set8 = defaultedMap3.keySet();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) predicate14);
        defaultedMap13.clear();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        int i18 = defaultedMap13.size();
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap21.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) set22);
        boolean b24 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        defaultedMap28.clear();
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        int i33 = defaultedMap28.size();
        java.util.Set set34 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set37);
        java.lang.Object obj39 = defaultedMap13.get((java.lang.Object) map38);
        boolean b40 = defaultedMap3.containsKey((java.lang.Object) map38);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap3.get(obj41);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + ' ' + "'", obj39.equals(' '));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + ' ' + "'", obj42.equals(' '));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) '4');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) set11);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + ' ' + "'", obj14.equals(' '));
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        boolean b8 = fixedOrderComparator5.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) predicate13);
        defaultedMap12.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array20 = new java.lang.Object[] { true, defaultedMap19 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap10.get((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj24 = defaultedMap10.remove((java.lang.Object) (-1.0f));
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 0.0f);
        boolean b27 = defaultedMap10.isEmpty();
        boolean b28 = fixedOrderComparator5.add((java.lang.Object) b27);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + ' ' + "'", obj22.equals(' '));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) predicate7);
        defaultedMap6.clear();
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100);
        java.util.Collection collection13 = defaultedMap6.values();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) collection13);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + ' ' + "'", obj12.equals(' '));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap1.keySet();
        int i17 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        defaultedMap16.clear();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        int i21 = defaultedMap16.size();
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) '4');
        java.util.Set set32 = defaultedMap29.entrySet();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) set32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + ' ' + "'", obj33.equals(' '));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i34 = defaultedMap29.size();
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) set38);
        java.lang.Object obj42 = defaultedMap29.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { true, defaultedMap53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        defaultedMap62.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i67 = defaultedMap62.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap62);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { defaultedMap1, 0L, defaultedMap16, set25, '#', defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) predicate75);
        defaultedMap74.clear();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        int i79 = defaultedMap74.size();
        java.util.Set set80 = defaultedMap74.keySet();
        boolean b81 = fixedOrderComparator70.add((java.lang.Object) set80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array85 = new java.lang.Object[] { true, defaultedMap84 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        boolean b88 = fixedOrderComparator70.add((java.lang.Object) obj_array85);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator70);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        java.util.Set set10 = defaultedMap3.keySet();
        int i11 = defaultedMap3.size();
        int i12 = defaultedMap3.size();
        int i13 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        defaultedMap17.clear();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        int i22 = defaultedMap17.size();
        java.util.Set set23 = defaultedMap17.keySet();
        java.util.Set set24 = defaultedMap17.keySet();
        int i25 = defaultedMap17.size();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) predicate34);
        defaultedMap33.clear();
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        int i38 = defaultedMap33.size();
        java.util.Set set39 = defaultedMap33.keySet();
        java.util.Set set40 = defaultedMap33.keySet();
        java.util.Collection collection41 = defaultedMap33.values();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate(map28, predicate29, predicate42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) predicate50);
        defaultedMap49.clear();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array57 = new java.lang.Object[] { true, defaultedMap56 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj59 = defaultedMap47.get((java.lang.Object) fixedOrderComparator58);
        java.lang.Object obj61 = defaultedMap47.remove((java.lang.Object) (-1.0f));
        java.util.Set set62 = defaultedMap47.keySet();
        boolean b63 = defaultedMap47.isEmpty();
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) predicate68);
        boolean b70 = defaultedMap67.isEmpty();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) 1L);
        boolean b73 = defaultedMap65.equals((java.lang.Object) defaultedMap67);
        defaultedMap47.putAll((java.util.Map) defaultedMap67);
        java.lang.Object obj75 = defaultedMap3.put((java.lang.Object) predicate42, (java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + ' ' + "'", obj59.equals(' '));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 1L);
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        int i24 = defaultedMap19.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array38 = new java.lang.Object[] { true, defaultedMap37 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        int i51 = defaultedMap46.size();
        java.util.Set set52 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set55 = defaultedMap54.entrySet();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) set55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) ' ');
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) (-1));
        java.lang.Object obj67 = defaultedMap58.remove((java.lang.Object) (byte) 10);
        boolean b68 = fixedOrderComparator40.addAsEqual((java.lang.Object) map56, obj67);
        defaultedMap30.putAll(map56);
        boolean b70 = defaultedMap1.containsKey((java.lang.Object) map56);
        java.util.Collection collection71 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + ' ' + "'", obj28.equals(' '));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection71);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        int i24 = defaultedMap19.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap30);
        java.util.Collection collection32 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + ' ' + "'", obj28.equals(' '));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) '4');
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) b17, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { true, defaultedMap22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array29 = new java.lang.Object[] { true, defaultedMap28 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) '4');
        boolean b38 = fixedOrderComparator31.add((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) fixedOrderComparator31);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) predicate44);
        defaultedMap43.clear();
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj49 = defaultedMap43.get((java.lang.Object) 100);
        java.util.Collection collection50 = defaultedMap43.values();
        java.lang.Object obj51 = defaultedMap1.remove((java.lang.Object) collection50);
        int i52 = defaultedMap1.size();
        collections.Factory factory53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + ' ' + "'", obj49.equals(' '));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(i52 == 2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        defaultedMap18.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        int i23 = defaultedMap18.size();
        java.util.Set set24 = defaultedMap18.keySet();
        java.util.Set set25 = defaultedMap18.keySet();
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) set25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        java.lang.String str28 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 0 + "'", obj14.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 0 + "'", obj26.equals((byte) 0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        java.util.Set set10 = defaultedMap3.keySet();
        int i11 = defaultedMap3.size();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set17 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) ' ');
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1));
        java.lang.Object obj28 = defaultedMap19.remove((java.lang.Object) (byte) 10);
        boolean b29 = defaultedMap16.containsKey((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) '4');
        boolean b34 = defaultedMap31.isEmpty();
        java.util.Set set35 = defaultedMap31.entrySet();
        boolean b36 = defaultedMap16.containsValue((java.lang.Object) defaultedMap31);
        java.lang.Object obj37 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + ' ' + "'", obj37.equals(' '));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) predicate10);
        defaultedMap9.clear();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array17 = new java.lang.Object[] { true, defaultedMap16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) fixedOrderComparator18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) false);
        boolean b24 = fixedOrderComparator4.addAsEqual((java.lang.Object) defaultedMap7, obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        defaultedMap28.clear();
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) ' ');
        java.lang.Object obj40 = defaultedMap28.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set43 = defaultedMap42.entrySet();
        java.lang.Object obj44 = defaultedMap28.get((java.lang.Object) set43);
        defaultedMap7.putAll((java.util.Map) defaultedMap28);
        defaultedMap7.clear();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + ' ' + "'", obj19.equals(' '));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 0 + "'", obj23.equals((byte) 0));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + ' ' + "'", obj40.equals(' '));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + ' ' + "'", obj44.equals(' '));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set8 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) '4');
        java.util.Set set13 = defaultedMap10.entrySet();
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) '4');
        java.util.Set set19 = defaultedMap16.entrySet();
        java.util.Set set20 = defaultedMap16.keySet();
        boolean b21 = defaultedMap10.equals((java.lang.Object) set20);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) "hi!");
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection25 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + ' ' + "'", obj23.equals(' '));
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set12);
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) predicate22);
        boolean b24 = defaultedMap21.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 1L);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b30 = defaultedMap21.containsValue((java.lang.Object) defaultedMap29);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) predicate34);
        boolean b36 = defaultedMap33.isEmpty();
        java.util.Set set37 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array41 = new java.lang.Object[] { true, defaultedMap40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = defaultedMap33.containsKey((java.lang.Object) obj_array41);
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap33.containsKey(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) predicate51);
        defaultedMap50.clear();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        int i55 = defaultedMap50.size();
        java.util.Set set56 = defaultedMap50.keySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set59 = defaultedMap58.entrySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) set59);
        defaultedMap33.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) predicate64);
        java.util.Set set66 = defaultedMap63.entrySet();
        java.lang.Object obj67 = defaultedMap33.get((java.lang.Object) defaultedMap63);
        boolean b68 = defaultedMap3.containsValue((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + ' ' + "'", obj67.equals(' '));
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b13 = defaultedMap4.containsValue((java.lang.Object) defaultedMap12);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map8);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        defaultedMap16.clear();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        int i21 = defaultedMap16.size();
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) '4');
        java.util.Set set32 = defaultedMap29.entrySet();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) set32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set35 = defaultedMap34.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + ' ' + "'", obj33.equals(' '));
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set12);
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) predicate22);
        boolean b24 = defaultedMap21.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 1L);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b30 = defaultedMap21.containsValue((java.lang.Object) defaultedMap29);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection32 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) (-1L));
        int i15 = fixedOrderComparator12.getUnknownObjectBehavior();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) i15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) ' ');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1));
        java.lang.Object obj27 = defaultedMap18.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) predicate36);
        defaultedMap35.clear();
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        int i40 = defaultedMap35.size();
        java.util.Set set41 = defaultedMap35.keySet();
        java.util.Set set42 = defaultedMap35.keySet();
        java.lang.Object obj43 = defaultedMap29.get((java.lang.Object) set42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap29);
        defaultedMap1.putAll(map44);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 0 + "'", obj43.equals((byte) 0));
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) '4');
        boolean b12 = fixedOrderComparator5.add((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate17);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 1L);
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        boolean b14 = defaultedMap11.isEmpty();
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) ' ');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1));
        boolean b26 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1));
        java.lang.Object obj13 = defaultedMap4.remove((java.lang.Object) (byte) 10);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 10);
        java.util.Collection collection15 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) predicate5);
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b13 = defaultedMap4.containsValue((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array17 = new java.lang.Object[] { true, defaultedMap16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b21 = fixedOrderComparator19.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        defaultedMap25.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        int i30 = defaultedMap25.size();
        java.util.Set set31 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) set34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) ' ');
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1));
        java.lang.Object obj46 = defaultedMap37.remove((java.lang.Object) (byte) 10);
        boolean b47 = fixedOrderComparator19.addAsEqual((java.lang.Object) map35, obj46);
        boolean b48 = fixedOrderComparator19.isLocked();
        boolean b49 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) predicate52);
        boolean b54 = fixedOrderComparator19.add((java.lang.Object) defaultedMap51);
        java.util.Set set55 = defaultedMap51.entrySet();
        boolean b56 = defaultedMap12.containsKey((java.lang.Object) set55);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i16 = defaultedMap11.size();
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        boolean b33 = fixedOrderComparator5.addAsEqual((java.lang.Object) map21, obj32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) map21);
        java.lang.String str35 = defaultedMap34.toString();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array3);
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) '4');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) set11);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        defaultedMap18.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) ' ');
        java.lang.Object obj30 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) predicate35);
        defaultedMap34.clear();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        int i39 = defaultedMap34.size();
        java.util.Set set40 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set43 = defaultedMap42.entrySet();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) set43);
        boolean b45 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) predicate50);
        defaultedMap49.clear();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        int i54 = defaultedMap49.size();
        java.util.Set set55 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set58 = defaultedMap57.entrySet();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) set58);
        java.lang.Object obj60 = defaultedMap34.get((java.lang.Object) map59);
        boolean b61 = defaultedMap18.containsValue((java.lang.Object) defaultedMap34);
        int i62 = defaultedMap18.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + ' ' + "'", obj14.equals(' '));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' ' + "'", obj30.equals(' '));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + ' ' + "'", obj60.equals(' '));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) 100);
        java.util.Collection collection10 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) predicate15);
        defaultedMap14.clear();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array22 = new java.lang.Object[] { true, defaultedMap21 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj24 = defaultedMap12.get((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap12.remove((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap12.keySet();
        boolean b28 = defaultedMap12.isEmpty();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) predicate33);
        boolean b35 = defaultedMap32.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 1L);
        boolean b38 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        defaultedMap12.putAll((java.util.Map) defaultedMap32);
        defaultedMap3.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set43 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) predicate46);
        boolean b48 = defaultedMap45.isEmpty();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 1L);
        boolean b51 = defaultedMap42.containsValue((java.lang.Object) defaultedMap45);
        boolean b52 = defaultedMap32.containsValue((java.lang.Object) b51);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + ' ' + "'", obj9.equals(' '));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + ' ' + "'", obj24.equals(' '));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array3 = new java.lang.Object[] { true, defaultedMap2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) predicate12);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        int i16 = defaultedMap11.size();
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        boolean b33 = fixedOrderComparator5.addAsEqual((java.lang.Object) map21, obj32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) map21);
        java.util.Collection collection35 = defaultedMap34.values();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { true, defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        boolean b20 = defaultedMap17.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1L);
        boolean b23 = fixedOrderComparator14.add((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) predicate9);
        boolean b11 = defaultedMap8.isEmpty();
        java.util.Set set12 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array16 = new java.lang.Object[] { true, defaultedMap15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = defaultedMap8.containsKey((java.lang.Object) obj_array16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap8.containsKey(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        defaultedMap25.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        int i30 = defaultedMap25.size();
        java.util.Set set31 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) set34);
        defaultedMap8.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) predicate41);
        defaultedMap40.clear();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array48 = new java.lang.Object[] { true, defaultedMap47 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj50 = defaultedMap38.get((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj52 = defaultedMap38.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) predicate57);
        defaultedMap56.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        int i61 = defaultedMap56.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap56);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj65 = defaultedMap38.get((java.lang.Object) (byte) 0);
        defaultedMap25.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) predicate71);
        defaultedMap70.clear();
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        int i75 = defaultedMap70.size();
        java.util.Set set76 = defaultedMap70.keySet();
        java.util.Set set77 = defaultedMap70.keySet();
        java.util.Collection collection78 = defaultedMap70.values();
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate79, predicate80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        boolean b85 = defaultedMap83.containsKey((java.lang.Object) predicate84);
        java.util.Set set86 = defaultedMap83.entrySet();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate79, predicate88);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate(map6, predicate79, predicate91);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + ' ' + "'", obj50.equals(' '));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + ' ' + "'", obj65.equals(' '));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) predicate7);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array14 = new java.lang.Object[] { true, defaultedMap13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = defaultedMap6.containsKey((java.lang.Object) obj_array14);
        java.lang.String str18 = defaultedMap6.toString();
        java.lang.Object obj20 = defaultedMap6.get((java.lang.Object) 10L);
        boolean b21 = defaultedMap1.equals(obj20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + ' ' + "'", obj20.equals(' '));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set8 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) '4');
        java.util.Set set13 = defaultedMap10.entrySet();
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) '4');
        java.util.Set set19 = defaultedMap16.entrySet();
        java.util.Set set20 = defaultedMap16.keySet();
        boolean b21 = defaultedMap10.equals((java.lang.Object) set20);
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) "hi!");
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        java.util.Set set25 = defaultedMap10.entrySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + ' ' + "'", obj23.equals(' '));
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap1.keySet();
        boolean b17 = defaultedMap1.isEmpty();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) predicate22);
        boolean b24 = defaultedMap21.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 1L);
        boolean b27 = defaultedMap19.equals((java.lang.Object) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap30.entrySet();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Collection collection37 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) predicate40);
        defaultedMap39.clear();
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap39);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) '4');
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        int i24 = defaultedMap19.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) '4');
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array38 = new java.lang.Object[] { true, defaultedMap37 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        int i51 = defaultedMap46.size();
        java.util.Set set52 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set55 = defaultedMap54.entrySet();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) set55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) ' ');
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) (-1));
        java.lang.Object obj67 = defaultedMap58.remove((java.lang.Object) (byte) 10);
        boolean b68 = fixedOrderComparator40.addAsEqual((java.lang.Object) map56, obj67);
        defaultedMap30.putAll(map56);
        boolean b70 = defaultedMap1.containsKey((java.lang.Object) map56);
        collections.Transformer transformer71 = null;
        try {
            java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + ' ' + "'", obj28.equals(' '));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1));
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        defaultedMap16.clear();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        int i21 = defaultedMap16.size();
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) predicate32);
        defaultedMap31.clear();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        int i36 = defaultedMap31.size();
        java.util.Set set37 = defaultedMap31.keySet();
        java.util.Set set38 = defaultedMap31.keySet();
        java.util.Collection collection39 = defaultedMap31.values();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate43);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array11 = new java.lang.Object[] { true, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) predicate17);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) '4');
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) predicate30);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        int i34 = defaultedMap29.size();
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) set38);
        java.lang.Object obj42 = defaultedMap29.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        defaultedMap46.clear();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { true, defaultedMap53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap44.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        defaultedMap62.clear();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        int i67 = defaultedMap62.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap62);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { defaultedMap1, 0L, defaultedMap16, set25, '#', defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) predicate75);
        defaultedMap74.clear();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array82 = new java.lang.Object[] { true, defaultedMap81 };
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array82);
        java.lang.Object obj84 = defaultedMap72.get((java.lang.Object) fixedOrderComparator83);
        java.lang.Object obj86 = defaultedMap72.remove((java.lang.Object) (-1.0f));
        java.util.Set set87 = defaultedMap72.keySet();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array91 = new java.lang.Object[] { true, defaultedMap90 };
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array91);
        boolean b94 = fixedOrderComparator92.add((java.lang.Object) (-1L));
        int i95 = fixedOrderComparator92.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap96 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator92);
        boolean b97 = fixedOrderComparator70.addAsEqual((java.lang.Object) set87, (java.lang.Object) defaultedMap96);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' ' + "'", obj13.equals(' '));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + ' ' + "'", obj56.equals(' '));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(obj_array82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + ' ' + "'", obj84.equals(' '));
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(obj_array91);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(i95 == 2);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) predicate13);
        defaultedMap12.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array20 = new java.lang.Object[] { true, defaultedMap19 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap10.get((java.lang.Object) fixedOrderComparator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        boolean b28 = defaultedMap25.isEmpty();
        java.util.Set set29 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) '4');
        java.util.Set set34 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) predicate39);
        defaultedMap38.clear();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        int i43 = defaultedMap38.size();
        java.util.Set set44 = defaultedMap38.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set47 = defaultedMap46.entrySet();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) set47);
        java.lang.Object obj51 = defaultedMap38.put((java.lang.Object) '#', (java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) predicate56);
        defaultedMap55.clear();
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array63 = new java.lang.Object[] { true, defaultedMap62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        java.lang.Object obj65 = defaultedMap53.get((java.lang.Object) fixedOrderComparator64);
        java.lang.Object obj67 = defaultedMap53.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) predicate72);
        defaultedMap71.clear();
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        int i76 = defaultedMap71.size();
        defaultedMap53.putAll((java.util.Map) defaultedMap71);
        java.lang.Object[] obj_array78 = new java.lang.Object[] { defaultedMap10, 0L, defaultedMap25, set34, '#', defaultedMap71 };
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array78);
        java.lang.Object obj80 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        boolean b84 = defaultedMap82.containsKey((java.lang.Object) predicate83);
        boolean b85 = defaultedMap82.isEmpty();
        java.util.Set set86 = defaultedMap82.keySet();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.lang.Object[] obj_array90 = new java.lang.Object[] { true, defaultedMap89 };
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array90);
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array90);
        boolean b93 = defaultedMap82.containsKey((java.lang.Object) obj_array90);
        java.lang.Object obj94 = null;
        boolean b95 = defaultedMap82.containsKey(obj94);
        java.lang.Object obj96 = defaultedMap1.get((java.lang.Object) defaultedMap82);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + ' ' + "'", obj22.equals(' '));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + ' ' + "'", obj65.equals(' '));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(obj_array78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(obj_array90);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + ' ' + "'", obj96.equals(' '));
    }
}

