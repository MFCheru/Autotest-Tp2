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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap5.isEmpty();
        boolean b15 = defaultedMap5.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        boolean b4 = defaultedMap2.isEmpty();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        int i3 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator5.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) b6);
        int i8 = defaultedMap7.size();
        boolean b9 = defaultedMap7.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator17.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Set set21 = defaultedMap19.keySet();
        java.lang.Object obj23 = defaultedMap12.put((java.lang.Object) set21, (java.lang.Object) 0L);
        try {
            boolean b24 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap7, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map map0 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) b2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        defaultedMap3.putAll((java.util.Map) defaultedMap6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.util.Set set12 = defaultedMap10.keySet();
        java.lang.Object obj14 = defaultedMap3.put((java.lang.Object) set12, (java.lang.Object) 0L);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) b16);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.keySet();
        java.util.Set set20 = defaultedMap17.keySet();
        java.util.Collection collection21 = defaultedMap17.values();
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj24 = defaultedMap3.put((java.lang.Object) defaultedMap17, (java.lang.Object) obj_array22);
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Map map0 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) b2);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.keySet();
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) ' ');
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap15.get(obj20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate23);
        try {
            int i25 = fixedOrderComparator2.compare((java.lang.Object) ' ', (java.lang.Object) predicate23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        boolean b4 = defaultedMap2.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Set set17 = defaultedMap15.keySet();
        java.lang.Object obj18 = defaultedMap9.put((java.lang.Object) (-1L), (java.lang.Object) set17);
        java.util.Set set19 = defaultedMap9.entrySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        try {
            boolean b9 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        java.util.Set set5 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Set set5 = defaultedMap2.keySet();
        java.util.Collection collection6 = defaultedMap2.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = defaultedMap2.remove((java.lang.Object) defaultedMap12);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) ' ');
        java.lang.String str9 = defaultedMap5.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) set15, (java.lang.Object) false);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b20 = fixedOrderComparator19.isLocked();
        int i21 = fixedOrderComparator19.getUnknownObjectBehavior();
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.lang.Object obj23 = defaultedMap5.get((java.lang.Object) fixedOrderComparator19);
        int i24 = fixedOrderComparator19.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator19.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(i25 == 2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        try {
            fixedOrderComparator6.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) set8);
        java.util.Set set10 = defaultedMap2.entrySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap12.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) b20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) b23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator25.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator29.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) b30);
        int i32 = defaultedMap31.size();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj35 = defaultedMap2.get((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.String str20 = defaultedMap9.toString();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        int i23 = fixedOrderComparator21.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(i23 == 2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.keySet();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap4.get(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate11, predicate12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        int i18 = defaultedMap16.size();
        java.lang.Object[] obj_array19 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator20.isLocked();
        int i22 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i23 = fixedOrderComparator20.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator27.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) b28);
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) ' ');
        boolean b33 = fixedOrderComparator20.add((java.lang.Object) ' ');
        boolean b34 = defaultedMap16.containsValue((java.lang.Object) fixedOrderComparator20);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.keySet();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap37.get(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate44, predicate45);
        boolean b47 = defaultedMap16.containsKey((java.lang.Object) defaultedMap37);
        java.util.Collection collection48 = defaultedMap37.values();
        try {
            int i49 = fixedOrderComparator1.compare((java.lang.Object) predicate11, (java.lang.Object) collection48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator5.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) b6);
        int i8 = defaultedMap7.size();
        java.lang.Object obj9 = defaultedMap4.remove((java.lang.Object) i8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        boolean b23 = fixedOrderComparator21.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator25.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        int i28 = defaultedMap27.size();
        java.lang.String str29 = defaultedMap27.toString();
        boolean b30 = defaultedMap27.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        boolean b32 = fixedOrderComparator31.isLocked();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b32);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 1);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap33.get(obj38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap27.get((java.lang.Object) map42);
        try {
            boolean b44 = fixedOrderComparator21.addAsEqual((java.lang.Object) 10L, obj43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        int i3 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i5 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i6 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap2.equals((java.lang.Object) predicate7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) b17);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap14.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = defaultedMap14.get((java.lang.Object) obj_array23);
        boolean b26 = defaultedMap2.containsValue((java.lang.Object) obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        java.util.Set set31 = defaultedMap30.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b33 = fixedOrderComparator32.isLocked();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) b33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        defaultedMap34.putAll((java.util.Map) defaultedMap37);
        defaultedMap30.putAll((java.util.Map) defaultedMap37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) b41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator();
        boolean b44 = fixedOrderComparator43.isLocked();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) b44);
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator47.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) b48);
        int i50 = defaultedMap49.size();
        boolean b51 = defaultedMap49.isEmpty();
        defaultedMap45.putAll((java.util.Map) defaultedMap49);
        java.util.Set set53 = defaultedMap49.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        boolean b55 = fixedOrderComparator54.isLocked();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) b55);
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) 1);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        boolean b62 = defaultedMap56.equals((java.lang.Object) predicate61);
        defaultedMap49.putAll((java.util.Map) defaultedMap56);
        boolean b64 = defaultedMap37.containsKey((java.lang.Object) defaultedMap49);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        boolean b66 = fixedOrderComparator65.isLocked();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        java.util.Set set68 = defaultedMap67.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b70 = fixedOrderComparator69.isLocked();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) b70);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator();
        boolean b73 = fixedOrderComparator72.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) b73);
        defaultedMap71.putAll((java.util.Map) defaultedMap74);
        defaultedMap67.putAll((java.util.Map) defaultedMap74);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator();
        boolean b79 = fixedOrderComparator78.isLocked();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) b79);
        java.util.Set set81 = defaultedMap80.entrySet();
        java.util.Set set82 = defaultedMap80.keySet();
        java.lang.Object obj83 = defaultedMap74.put((java.lang.Object) (-1L), (java.lang.Object) set82);
        java.util.Set set84 = defaultedMap74.keySet();
        try {
            boolean b85 = fixedOrderComparator27.addAsEqual((java.lang.Object) b64, (java.lang.Object) defaultedMap74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) set8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) b16);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        int i22 = defaultedMap21.size();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.keySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap28.equals((java.lang.Object) predicate33);
        defaultedMap21.putAll((java.util.Map) defaultedMap28);
        boolean b36 = defaultedMap9.containsKey((java.lang.Object) defaultedMap21);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate37, predicate38);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        boolean b36 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.lang.Object obj39 = defaultedMap28.remove((java.lang.Object) 2);
        java.lang.Object obj40 = defaultedMap9.remove(obj39);
        defaultedMap9.clear();
        java.util.Set set42 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap23.get(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate31);
        boolean b33 = defaultedMap2.containsKey((java.lang.Object) defaultedMap23);
        java.util.Collection collection34 = defaultedMap23.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        boolean b39 = fixedOrderComparator38.isLocked();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) b39);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) b43);
        int i45 = defaultedMap44.size();
        boolean b46 = defaultedMap44.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        boolean b48 = defaultedMap40.isEmpty();
        defaultedMap40.clear();
        java.lang.Object obj51 = defaultedMap40.remove((java.lang.Object) 2);
        java.lang.Object obj52 = defaultedMap23.remove(obj51);
        collections.Factory factory53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, factory53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) ' ');
        java.lang.String str9 = defaultedMap5.toString();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        boolean b36 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.lang.Object obj39 = defaultedMap28.remove((java.lang.Object) 2);
        java.lang.Object obj40 = defaultedMap9.remove(obj39);
        defaultedMap9.clear();
        boolean b43 = defaultedMap9.containsKey((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Set set5 = defaultedMap2.keySet();
        java.util.Collection collection6 = defaultedMap2.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = defaultedMap2.remove((java.lang.Object) defaultedMap12);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Set set9 = defaultedMap6.keySet();
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) defaultedMap6);
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.String str12 = defaultedMap6.toString();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Set set9 = defaultedMap6.keySet();
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) defaultedMap6);
        java.util.Set set11 = defaultedMap6.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        int i15 = defaultedMap14.size();
        boolean b16 = defaultedMap14.isEmpty();
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) (-1.0d));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        java.lang.Object obj13 = defaultedMap2.put((java.lang.Object) set11, (java.lang.Object) 0L);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Collection collection20 = defaultedMap16.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap2.put((java.lang.Object) defaultedMap16, (java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        int i27 = defaultedMap26.size();
        int i28 = defaultedMap26.size();
        java.lang.Object[] obj_array29 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator30.isLocked();
        int i32 = fixedOrderComparator30.getUnknownObjectBehavior();
        int i33 = fixedOrderComparator30.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) b35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) b38);
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap39.containsKey((java.lang.Object) ' ');
        boolean b43 = fixedOrderComparator30.add((java.lang.Object) ' ');
        boolean b44 = defaultedMap26.containsValue((java.lang.Object) fixedOrderComparator30);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator45.isLocked();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) b46);
        int i48 = defaultedMap47.size();
        java.util.Set set49 = defaultedMap47.keySet();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 1);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap47.get(obj52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate54, predicate55);
        boolean b57 = defaultedMap26.containsKey((java.lang.Object) defaultedMap47);
        java.lang.String str58 = defaultedMap26.toString();
        defaultedMap16.putAll((java.util.Map) defaultedMap26);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false + "'", obj53.equals(false));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) b16);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        int i22 = defaultedMap21.size();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.keySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap28.equals((java.lang.Object) predicate33);
        defaultedMap21.putAll((java.util.Map) defaultedMap28);
        boolean b36 = defaultedMap9.containsKey((java.lang.Object) defaultedMap21);
        java.util.Collection collection37 = defaultedMap21.values();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap5.isEmpty();
        defaultedMap5.clear();
        java.lang.Object obj16 = defaultedMap5.remove((java.lang.Object) 2);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) ' ');
        java.lang.String str9 = defaultedMap5.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) set15, (java.lang.Object) false);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b20 = fixedOrderComparator19.isLocked();
        int i21 = fixedOrderComparator19.getUnknownObjectBehavior();
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.lang.Object obj23 = defaultedMap5.get((java.lang.Object) fixedOrderComparator19);
        boolean b24 = fixedOrderComparator19.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        java.lang.String str23 = defaultedMap9.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        int i27 = defaultedMap26.size();
        int i28 = defaultedMap26.size();
        java.util.Set set29 = defaultedMap26.entrySet();
        java.lang.Object obj30 = defaultedMap9.get((java.lang.Object) set29);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) ' ');
        java.lang.String str13 = defaultedMap9.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap9.put((java.lang.Object) set19, (java.lang.Object) false);
        try {
            int i22 = fixedOrderComparator1.compare((java.lang.Object) (byte) -1, obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        java.util.Set set4 = defaultedMap2.keySet();
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) -1);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap2.values();
        defaultedMap2.clear();
        int i9 = defaultedMap2.size();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) ' ');
        int i32 = defaultedMap28.size();
        boolean b33 = defaultedMap28.isEmpty();
        java.util.Set set34 = defaultedMap28.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        java.util.Set set38 = defaultedMap37.entrySet();
        boolean b39 = defaultedMap37.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) b41);
        int i43 = defaultedMap42.size();
        java.util.Set set44 = defaultedMap42.keySet();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap42.get(obj47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate49, predicate50);
        java.lang.Object obj52 = defaultedMap37.get((java.lang.Object) predicate49);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator53.isLocked();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) b54);
        java.util.Set set56 = defaultedMap55.entrySet();
        boolean b57 = defaultedMap55.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator58.isLocked();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) b59);
        int i61 = defaultedMap60.size();
        java.util.Set set62 = defaultedMap60.keySet();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) 1);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap60.get(obj65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate67, predicate68);
        java.lang.Object obj70 = defaultedMap55.get((java.lang.Object) predicate67);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate49, predicate67);
        try {
            boolean b73 = fixedOrderComparator21.addAsEqual((java.lang.Object) predicate67, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + false + "'", obj48.equals(false));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + false + "'", obj52.equals(false));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + false + "'", obj66.equals(false));
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + false + "'", obj70.equals(false));
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj3 = null;
        try {
            boolean b4 = fixedOrderComparator0.addAsEqual((java.lang.Object) predicate2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        boolean b4 = defaultedMap2.isEmpty();
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.keySet();
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Collection collection13 = defaultedMap9.values();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) collection13);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Set set5 = defaultedMap2.keySet();
        java.util.Collection collection6 = defaultedMap2.values();
        java.lang.Object obj7 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) b16);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.keySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap17.get(obj22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) map26);
        boolean b28 = defaultedMap10.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator29.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) b30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b33 = fixedOrderComparator32.isLocked();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) b33);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        int i39 = defaultedMap38.size();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap34.putAll((java.util.Map) defaultedMap38);
        int i42 = defaultedMap38.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator();
        boolean b44 = fixedOrderComparator43.isLocked();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) b44);
        int i46 = defaultedMap45.size();
        java.util.Set set47 = defaultedMap45.keySet();
        java.lang.Object obj48 = defaultedMap38.get((java.lang.Object) defaultedMap45);
        java.lang.Object[] obj_array49 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        java.lang.Object obj51 = defaultedMap38.get((java.lang.Object) fixedOrderComparator50);
        boolean b52 = defaultedMap10.containsKey((java.lang.Object) defaultedMap38);
        boolean b53 = defaultedMap38.isEmpty();
        java.lang.Object obj54 = defaultedMap2.put(obj7, (java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + false + "'", obj48.equals(false));
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + false + "'", obj51.equals(false));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        java.lang.Object obj13 = defaultedMap2.put((java.lang.Object) set11, (java.lang.Object) 0L);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Collection collection20 = defaultedMap16.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap2.put((java.lang.Object) defaultedMap16, (java.lang.Object) obj_array21);
        java.util.Collection collection24 = defaultedMap16.values();
        int i25 = defaultedMap16.size();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) false);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) ' ');
        int i9 = defaultedMap5.size();
        boolean b10 = defaultedMap5.isEmpty();
        java.util.Set set11 = defaultedMap5.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        java.util.Set set15 = defaultedMap14.entrySet();
        boolean b16 = defaultedMap14.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator17.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        int i20 = defaultedMap19.size();
        java.util.Set set21 = defaultedMap19.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 1);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap19.get(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) predicate26);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        java.util.Set set33 = defaultedMap32.entrySet();
        boolean b34 = defaultedMap32.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.keySet();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap37.get(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate44, predicate45);
        java.lang.Object obj47 = defaultedMap32.get((java.lang.Object) predicate44);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate26, predicate44);
        java.lang.Object obj50 = defaultedMap5.get((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + false + "'", obj47.equals(false));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + false + "'", obj50.equals(false));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap5.isEmpty();
        defaultedMap5.clear();
        java.lang.Object obj16 = defaultedMap5.remove((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator17.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b18);
        int i20 = defaultedMap19.size();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) '4');
        java.lang.Object obj23 = defaultedMap5.get((java.lang.Object) b22);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        boolean b4 = defaultedMap2.isEmpty();
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) (-1.0d));
        int i7 = defaultedMap2.size();
        java.util.Set set8 = defaultedMap2.entrySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap2.get(obj7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        int i12 = defaultedMap11.size();
        java.util.Set set13 = defaultedMap11.keySet();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Collection collection15 = defaultedMap11.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) b17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) defaultedMap21);
        defaultedMap2.putAll((java.util.Map) defaultedMap21);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        java.util.Set set4 = defaultedMap2.keySet();
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) -1);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        boolean b13 = defaultedMap2.containsKey((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        int i3 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i5 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) i5);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap2.equals((java.lang.Object) predicate7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        int i12 = defaultedMap11.size();
        java.util.Set set13 = defaultedMap11.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        boolean b17 = defaultedMap11.equals((java.lang.Object) predicate16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator18.isLocked();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) b19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) ' ');
        java.lang.String str27 = defaultedMap23.toString();
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap2.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b16 = fixedOrderComparator15.isLocked();
        int i17 = fixedOrderComparator15.getUnknownObjectBehavior();
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) b23);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) ' ');
        boolean b28 = fixedOrderComparator15.add((java.lang.Object) ' ');
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) fixedOrderComparator15);
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object obj34 = defaultedMap9.remove((java.lang.Object) fixedOrderComparator33);
        boolean b35 = fixedOrderComparator33.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.lang.String str4 = defaultedMap2.toString();
        boolean b5 = defaultedMap2.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        int i9 = defaultedMap8.size();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap8.get(obj13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate15, predicate16);
        java.lang.Object obj18 = defaultedMap2.get((java.lang.Object) map17);
        defaultedMap2.clear();
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        java.lang.String str23 = defaultedMap9.toString();
        boolean b24 = defaultedMap9.isEmpty();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator18.isLocked();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) b19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) ' ');
        boolean b27 = fixedOrderComparator17.add((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap23.get(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate31);
        boolean b33 = defaultedMap2.containsKey((java.lang.Object) defaultedMap23);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) b35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) b38);
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator41.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) b42);
        java.util.Set set44 = defaultedMap43.entrySet();
        java.util.Set set45 = defaultedMap43.keySet();
        java.lang.Object obj47 = defaultedMap36.put((java.lang.Object) set45, (java.lang.Object) 0L);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b49 = fixedOrderComparator48.isLocked();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) b49);
        int i51 = defaultedMap50.size();
        java.util.Set set52 = defaultedMap50.keySet();
        java.util.Set set53 = defaultedMap50.keySet();
        java.util.Collection collection54 = defaultedMap50.values();
        java.lang.Object[] obj_array55 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object obj57 = defaultedMap36.put((java.lang.Object) defaultedMap50, (java.lang.Object) obj_array55);
        java.lang.Object obj58 = defaultedMap2.get((java.lang.Object) obj_array55);
        int i59 = defaultedMap2.size();
        boolean b60 = defaultedMap2.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        boolean b62 = fixedOrderComparator61.isLocked();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) b62);
        java.util.Set set64 = defaultedMap63.entrySet();
        boolean b65 = defaultedMap63.isEmpty();
        java.util.Collection collection66 = defaultedMap63.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) b68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        boolean b71 = fixedOrderComparator70.isLocked();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) b71);
        defaultedMap69.putAll((java.util.Map) defaultedMap72);
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator();
        boolean b75 = fixedOrderComparator74.isLocked();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) b75);
        java.util.Set set77 = defaultedMap76.entrySet();
        java.util.Set set78 = defaultedMap76.keySet();
        java.lang.Object obj80 = defaultedMap69.put((java.lang.Object) set78, (java.lang.Object) 0L);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, obj80);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) map81);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + false + "'", obj58.equals(false));
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) ' ');
        int i9 = defaultedMap5.size();
        boolean b10 = defaultedMap5.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) b12);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap13.equals((java.lang.Object) predicate18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator20.isLocked();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) b21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator27.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) b28);
        int i30 = defaultedMap29.size();
        boolean b31 = defaultedMap29.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        boolean b33 = defaultedMap25.isEmpty();
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        java.lang.Object obj36 = defaultedMap25.get((java.lang.Object) obj_array34);
        boolean b37 = defaultedMap13.containsValue((java.lang.Object) obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b39 = defaultedMap5.containsKey((java.lang.Object) fixedOrderComparator38);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap2.equals((java.lang.Object) predicate7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        int i12 = defaultedMap11.size();
        java.util.Set set13 = defaultedMap11.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        boolean b17 = defaultedMap11.equals((java.lang.Object) predicate16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator18.isLocked();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) b19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap23.containsKey((java.lang.Object) ' ');
        java.lang.String str27 = defaultedMap23.toString();
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap2.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap23);
        defaultedMap23.clear();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        boolean b36 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.lang.Object obj39 = defaultedMap28.remove((java.lang.Object) 2);
        java.lang.Object obj40 = defaultedMap9.remove(obj39);
        defaultedMap9.clear();
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        java.lang.Object obj13 = defaultedMap2.put((java.lang.Object) set11, (java.lang.Object) 0L);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Collection collection20 = defaultedMap16.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap2.put((java.lang.Object) defaultedMap16, (java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator29.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) b30);
        defaultedMap28.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) ' ');
        int i35 = defaultedMap31.size();
        boolean b36 = fixedOrderComparator25.add((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b4 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap23.get(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate31);
        boolean b33 = defaultedMap2.containsKey((java.lang.Object) defaultedMap23);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) b35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) b38);
        defaultedMap36.putAll((java.util.Map) defaultedMap39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator41.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) b42);
        java.util.Set set44 = defaultedMap43.entrySet();
        java.util.Set set45 = defaultedMap43.keySet();
        java.lang.Object obj47 = defaultedMap36.put((java.lang.Object) set45, (java.lang.Object) 0L);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b49 = fixedOrderComparator48.isLocked();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) b49);
        int i51 = defaultedMap50.size();
        java.util.Set set52 = defaultedMap50.keySet();
        java.util.Set set53 = defaultedMap50.keySet();
        java.util.Collection collection54 = defaultedMap50.values();
        java.lang.Object[] obj_array55 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object obj57 = defaultedMap36.put((java.lang.Object) defaultedMap50, (java.lang.Object) obj_array55);
        java.lang.Object obj58 = defaultedMap2.get((java.lang.Object) obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        boolean b62 = fixedOrderComparator61.isLocked();
        int i63 = fixedOrderComparator61.getUnknownObjectBehavior();
        boolean b64 = fixedOrderComparator61.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        boolean b66 = fixedOrderComparator65.isLocked();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        java.util.Set set68 = defaultedMap67.entrySet();
        java.util.Set set69 = defaultedMap67.keySet();
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) (short) -1);
        try {
            boolean b72 = fixedOrderComparator60.addAsEqual((java.lang.Object) b64, obj71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + false + "'", obj58.equals(false));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + false + "'", obj71.equals(false));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        boolean b4 = defaultedMap2.isEmpty();
        java.util.Collection collection5 = defaultedMap2.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Set set17 = defaultedMap15.keySet();
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) set17, (java.lang.Object) 0L);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, obj19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        java.util.Set set24 = defaultedMap23.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator25.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        defaultedMap23.putAll((java.util.Map) defaultedMap30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) b41);
        int i43 = defaultedMap42.size();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator47.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) b48);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 1);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        boolean b55 = defaultedMap49.equals((java.lang.Object) predicate54);
        defaultedMap42.putAll((java.util.Map) defaultedMap49);
        boolean b57 = defaultedMap30.containsKey((java.lang.Object) defaultedMap42);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator58.isLocked();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) b59);
        int i61 = defaultedMap60.size();
        java.lang.String str62 = defaultedMap60.toString();
        boolean b63 = defaultedMap60.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator();
        boolean b65 = fixedOrderComparator64.isLocked();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) b65);
        int i67 = defaultedMap66.size();
        java.util.Set set68 = defaultedMap66.keySet();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 1);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap66.get(obj71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate73, predicate74);
        java.lang.Object obj76 = defaultedMap60.get((java.lang.Object) map75);
        defaultedMap60.clear();
        java.lang.Object obj78 = defaultedMap2.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap60);
        collections.Factory factory79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, factory79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + false + "'", obj76.equals(false));
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertTrue(i18 == 2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap2.values();
        defaultedMap2.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.keySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap14.equals((java.lang.Object) predicate19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        boolean b29 = defaultedMap23.equals((java.lang.Object) predicate28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) ' ');
        java.lang.String str39 = defaultedMap35.toString();
        java.util.Collection collection40 = defaultedMap35.values();
        java.lang.Object obj41 = defaultedMap14.put((java.lang.Object) defaultedMap23, (java.lang.Object) defaultedMap35);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate42, predicate43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator45.isLocked();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) b46);
        int i48 = defaultedMap47.size();
        java.util.Set set49 = defaultedMap47.keySet();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        boolean b53 = defaultedMap47.equals((java.lang.Object) predicate52);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        boolean b55 = fixedOrderComparator54.isLocked();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) b55);
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) 1);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        boolean b62 = defaultedMap56.equals((java.lang.Object) predicate61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator();
        boolean b64 = fixedOrderComparator63.isLocked();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) b64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        boolean b67 = fixedOrderComparator66.isLocked();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) b67);
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        boolean b71 = defaultedMap68.containsKey((java.lang.Object) ' ');
        java.lang.String str72 = defaultedMap68.toString();
        java.util.Collection collection73 = defaultedMap68.values();
        java.lang.Object obj74 = defaultedMap47.put((java.lang.Object) defaultedMap56, (java.lang.Object) defaultedMap68);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate42, predicate76);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) map78);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator2.add(obj4);
        java.lang.Object obj6 = null;
        boolean b7 = fixedOrderComparator2.add(obj6);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        boolean b4 = defaultedMap2.isEmpty();
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.keySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap9.get(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate16, predicate17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) b23);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) ' ');
        int i28 = defaultedMap24.size();
        boolean b29 = defaultedMap24.isEmpty();
        java.util.Set set30 = defaultedMap24.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        boolean b32 = fixedOrderComparator31.isLocked();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b32);
        java.util.Set set34 = defaultedMap33.entrySet();
        boolean b35 = defaultedMap33.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.keySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 1);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap38.get(obj43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate45, predicate46);
        java.lang.Object obj48 = defaultedMap33.get((java.lang.Object) predicate45);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator49.isLocked();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) b50);
        java.util.Set set52 = defaultedMap51.entrySet();
        boolean b53 = defaultedMap51.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        boolean b55 = fixedOrderComparator54.isLocked();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) b55);
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) 1);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap56.get(obj61);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate63, predicate64);
        java.lang.Object obj66 = defaultedMap51.get((java.lang.Object) predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate45, predicate63);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate16, predicate63);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + false + "'", obj48.equals(false));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + false + "'", obj62.equals(false));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + false + "'", obj66.equals(false));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        java.util.Set set23 = defaultedMap9.entrySet();
        java.util.Collection collection24 = defaultedMap9.values();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        int i33 = defaultedMap32.size();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        boolean b36 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        java.lang.Object obj39 = defaultedMap28.remove((java.lang.Object) 2);
        java.lang.Object obj40 = defaultedMap9.remove(obj39);
        java.util.Set set41 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap2.equals((java.lang.Object) predicate7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) b17);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap14.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = defaultedMap14.get((java.lang.Object) obj_array23);
        boolean b26 = defaultedMap2.containsValue((java.lang.Object) obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator27.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) b28);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.util.Set set31 = defaultedMap29.keySet();
        boolean b32 = defaultedMap2.containsValue((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array14);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap2.equals((java.lang.Object) predicate7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        int i12 = defaultedMap11.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        boolean b19 = defaultedMap11.containsKey((java.lang.Object) defaultedMap15);
        boolean b20 = defaultedMap2.containsKey((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap23.get(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate31);
        boolean b33 = defaultedMap2.containsKey((java.lang.Object) defaultedMap23);
        java.util.Collection collection34 = defaultedMap23.values();
        java.lang.String str35 = defaultedMap23.toString();
        boolean b36 = defaultedMap23.isEmpty();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        boolean b4 = defaultedMap2.isEmpty();
        java.util.Collection collection5 = defaultedMap2.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Set set17 = defaultedMap15.keySet();
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) set17, (java.lang.Object) 0L);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, obj19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        java.util.Set set24 = defaultedMap23.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator25.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        defaultedMap23.putAll((java.util.Map) defaultedMap30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) b41);
        int i43 = defaultedMap42.size();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator47.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) b48);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 1);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        boolean b55 = defaultedMap49.equals((java.lang.Object) predicate54);
        defaultedMap42.putAll((java.util.Map) defaultedMap49);
        boolean b57 = defaultedMap30.containsKey((java.lang.Object) defaultedMap42);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator58.isLocked();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) b59);
        int i61 = defaultedMap60.size();
        java.lang.String str62 = defaultedMap60.toString();
        boolean b63 = defaultedMap60.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator();
        boolean b65 = fixedOrderComparator64.isLocked();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) b65);
        int i67 = defaultedMap66.size();
        java.util.Set set68 = defaultedMap66.keySet();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 1);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap66.get(obj71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate73, predicate74);
        java.lang.Object obj76 = defaultedMap60.get((java.lang.Object) map75);
        defaultedMap60.clear();
        java.lang.Object obj78 = defaultedMap2.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap60);
        java.util.Collection collection79 = defaultedMap30.values();
        int i80 = defaultedMap30.size();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + false + "'", obj76.equals(false));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(i80 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator5.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) b6);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b9 = defaultedMap7.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap12.get(obj17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) predicate19);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) predicate19);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) ' ');
        int i9 = defaultedMap5.size();
        boolean b10 = defaultedMap5.isEmpty();
        java.util.Set set11 = defaultedMap5.keySet();
        java.lang.String str12 = defaultedMap5.toString();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.keySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 1);
        java.util.Collection collection33 = defaultedMap28.values();
        int i34 = defaultedMap28.size();
        boolean b35 = fixedOrderComparator24.add((java.lang.Object) defaultedMap28);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator39.isLocked();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) b40);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) ' ');
        java.lang.String str45 = defaultedMap41.toString();
        java.util.Set set46 = defaultedMap41.entrySet();
        try {
            boolean b47 = fixedOrderComparator6.addAsEqual((java.lang.Object) b35, (java.lang.Object) defaultedMap41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        boolean b4 = defaultedMap2.isEmpty();
        java.util.Collection collection5 = defaultedMap2.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Set set17 = defaultedMap15.keySet();
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) set17, (java.lang.Object) 0L);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, obj19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        java.util.Set set24 = defaultedMap23.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator25.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        defaultedMap23.putAll((java.util.Map) defaultedMap30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) b37);
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) b41);
        int i43 = defaultedMap42.size();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator47.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) b48);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 1);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        boolean b55 = defaultedMap49.equals((java.lang.Object) predicate54);
        defaultedMap42.putAll((java.util.Map) defaultedMap49);
        boolean b57 = defaultedMap30.containsKey((java.lang.Object) defaultedMap42);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator58.isLocked();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) b59);
        int i61 = defaultedMap60.size();
        java.lang.String str62 = defaultedMap60.toString();
        boolean b63 = defaultedMap60.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator();
        boolean b65 = fixedOrderComparator64.isLocked();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) b65);
        int i67 = defaultedMap66.size();
        java.util.Set set68 = defaultedMap66.keySet();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 1);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap66.get(obj71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate73, predicate74);
        java.lang.Object obj76 = defaultedMap60.get((java.lang.Object) map75);
        defaultedMap60.clear();
        java.lang.Object obj78 = defaultedMap2.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap60);
        boolean b79 = defaultedMap30.isEmpty();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + false + "'", obj72.equals(false));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + false + "'", obj76.equals(false));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b79 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.lang.String str4 = defaultedMap2.toString();
        java.util.Collection collection5 = defaultedMap2.values();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.lang.String str4 = defaultedMap2.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator5.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) b6);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        boolean b13 = defaultedMap7.equals((java.lang.Object) predicate12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        boolean b22 = defaultedMap16.equals((java.lang.Object) predicate21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) ' ');
        java.lang.String str32 = defaultedMap28.toString();
        java.util.Collection collection33 = defaultedMap28.values();
        java.lang.Object obj34 = defaultedMap7.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap28);
        boolean b35 = defaultedMap2.containsValue((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Set set5 = defaultedMap2.keySet();
        java.util.Collection collection6 = defaultedMap2.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = defaultedMap2.remove((java.lang.Object) defaultedMap12);
        defaultedMap12.clear();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap5.isEmpty();
        defaultedMap5.clear();
        java.util.Collection collection15 = defaultedMap5.values();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) b16);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        int i22 = defaultedMap21.size();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.keySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        boolean b34 = defaultedMap28.equals((java.lang.Object) predicate33);
        defaultedMap21.putAll((java.util.Map) defaultedMap28);
        boolean b36 = defaultedMap9.containsKey((java.lang.Object) defaultedMap21);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        boolean b38 = defaultedMap9.containsKey((java.lang.Object) predicate37);
        java.util.Set set39 = defaultedMap9.keySet();
        java.lang.String str40 = defaultedMap9.toString();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator2.getUnknownObjectBehavior();
        fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) 1);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        boolean b8 = defaultedMap2.equals((java.lang.Object) predicate7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) b17);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap14.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = defaultedMap14.get((java.lang.Object) obj_array23);
        boolean b26 = defaultedMap2.containsValue((java.lang.Object) obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        fixedOrderComparator27.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        java.util.Set set21 = defaultedMap2.entrySet();
        java.util.Collection collection22 = defaultedMap2.values();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) b15);
        int i17 = defaultedMap16.size();
        java.util.Set set18 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) fixedOrderComparator21);
        java.util.Set set23 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) ' ');
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) ' ');
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator6);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap23.get(obj28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate31);
        boolean b33 = defaultedMap2.containsKey((java.lang.Object) defaultedMap23);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) b35);
        int i37 = defaultedMap36.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        boolean b39 = fixedOrderComparator38.isLocked();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) b39);
        int i41 = defaultedMap40.size();
        java.util.Set set42 = defaultedMap40.keySet();
        java.util.Set set43 = defaultedMap40.keySet();
        boolean b44 = defaultedMap36.containsKey((java.lang.Object) defaultedMap40);
        java.lang.Object obj46 = defaultedMap36.get((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator47.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) b48);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b51 = fixedOrderComparator50.isLocked();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) b51);
        defaultedMap49.putAll((java.util.Map) defaultedMap52);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        boolean b55 = fixedOrderComparator54.isLocked();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) b55);
        int i57 = defaultedMap56.size();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap52.putAll((java.util.Map) defaultedMap56);
        int i60 = defaultedMap56.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        boolean b62 = fixedOrderComparator61.isLocked();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) b62);
        int i64 = defaultedMap63.size();
        java.util.Set set65 = defaultedMap63.keySet();
        java.lang.Object obj66 = defaultedMap56.get((java.lang.Object) defaultedMap63);
        java.lang.Object[] obj_array67 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        java.lang.Object obj69 = defaultedMap56.get((java.lang.Object) fixedOrderComparator68);
        java.lang.String str70 = defaultedMap56.toString();
        java.lang.Object obj71 = defaultedMap23.put((java.lang.Object) defaultedMap36, (java.lang.Object) defaultedMap56);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + false + "'", obj66.equals(false));
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + false + "'", obj69.equals(false));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        boolean b4 = defaultedMap2.isEmpty();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (short) 100);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap2.get(obj7);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) ' ');
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Set set10 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        java.util.Set set3 = defaultedMap2.entrySet();
        boolean b4 = defaultedMap2.isEmpty();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (short) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.keySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap9.get(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap2.get((java.lang.Object) map18);
        boolean b20 = defaultedMap2.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        int i31 = defaultedMap30.size();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        int i34 = defaultedMap30.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.keySet();
        java.lang.Object obj40 = defaultedMap30.get((java.lang.Object) defaultedMap37);
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj43 = defaultedMap30.get((java.lang.Object) fixedOrderComparator42);
        boolean b44 = defaultedMap2.containsKey((java.lang.Object) defaultedMap30);
        boolean b45 = defaultedMap30.isEmpty();
        java.util.Set set46 = defaultedMap30.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator47.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) b48);
        java.util.Set set50 = defaultedMap49.entrySet();
        boolean b51 = defaultedMap30.containsValue((java.lang.Object) set50);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + false + "'", obj40.equals(false));
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) b1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        int i10 = defaultedMap9.size();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        int i13 = defaultedMap9.size();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b16 = fixedOrderComparator15.isLocked();
        int i17 = fixedOrderComparator15.getUnknownObjectBehavior();
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) b23);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) ' ');
        boolean b28 = fixedOrderComparator15.add((java.lang.Object) ' ');
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) fixedOrderComparator15);
        int i30 = fixedOrderComparator15.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        boolean b32 = fixedOrderComparator31.isLocked();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b32);
        int i34 = defaultedMap33.size();
        int i35 = defaultedMap33.size();
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        int i39 = fixedOrderComparator37.getUnknownObjectBehavior();
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator41.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) b42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b45 = fixedOrderComparator44.isLocked();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) b45);
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) ' ');
        boolean b50 = fixedOrderComparator37.add((java.lang.Object) ' ');
        boolean b51 = defaultedMap33.containsValue((java.lang.Object) fixedOrderComparator37);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        boolean b53 = fixedOrderComparator52.isLocked();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) b53);
        int i55 = defaultedMap54.size();
        java.util.Set set56 = defaultedMap54.keySet();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 1);
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = defaultedMap54.get(obj59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate61, predicate62);
        boolean b64 = defaultedMap33.containsKey((java.lang.Object) defaultedMap54);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        boolean b66 = fixedOrderComparator65.isLocked();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) b66);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator();
        boolean b69 = fixedOrderComparator68.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) b69);
        defaultedMap67.putAll((java.util.Map) defaultedMap70);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator();
        boolean b73 = fixedOrderComparator72.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) b73);
        java.util.Set set75 = defaultedMap74.entrySet();
        java.util.Set set76 = defaultedMap74.keySet();
        java.lang.Object obj78 = defaultedMap67.put((java.lang.Object) set76, (java.lang.Object) 0L);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator();
        boolean b80 = fixedOrderComparator79.isLocked();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) b80);
        int i82 = defaultedMap81.size();
        java.util.Set set83 = defaultedMap81.keySet();
        java.util.Set set84 = defaultedMap81.keySet();
        java.util.Collection collection85 = defaultedMap81.values();
        java.lang.Object[] obj_array86 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array86);
        java.lang.Object obj88 = defaultedMap67.put((java.lang.Object) defaultedMap81, (java.lang.Object) obj_array86);
        java.lang.Object obj89 = defaultedMap33.get((java.lang.Object) obj_array86);
        boolean b90 = fixedOrderComparator15.add((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + false + "'", obj60.equals(false));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(obj_array86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + false + "'", obj89.equals(false));
        org.junit.Assert.assertTrue(b90 == true);
    }
}

