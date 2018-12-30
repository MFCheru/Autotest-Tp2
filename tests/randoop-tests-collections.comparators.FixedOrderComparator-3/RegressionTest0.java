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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.equals((java.lang.Object) "");
        boolean b17 = defaultedMap10.equals((java.lang.Object) defaultedMap13);
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        defaultedMap5.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        try {
            fixedOrderComparator35.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        boolean b40 = defaultedMap37.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b43 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b48 = defaultedMap45.equals((java.lang.Object) "");
        boolean b49 = defaultedMap42.equals((java.lang.Object) defaultedMap45);
        defaultedMap37.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj62 = defaultedMap52.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) defaultedMap64, (java.lang.Object) "");
        java.lang.Object obj67 = defaultedMap37.remove((java.lang.Object) defaultedMap64);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { obj67, predicate68, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        java.lang.Object obj72 = null;
        try {
            boolean b73 = fixedOrderComparator35.addAsEqual((java.lang.Object) obj_array70, obj72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(obj_array70);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        try {
            fixedOrderComparator35.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) -1 + "'", obj5.equals((short) -1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) (byte) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator35.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.equals((java.lang.Object) "");
        boolean b17 = defaultedMap10.equals((java.lang.Object) defaultedMap13);
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        defaultedMap5.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        boolean b21 = defaultedMap5.isEmpty();
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        try {
            fixedOrderComparator11.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        int i14 = defaultedMap7.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.equals((java.lang.Object) "");
        boolean b17 = defaultedMap10.equals((java.lang.Object) defaultedMap13);
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        defaultedMap5.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) "{}");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) -1 + "'", obj22.equals((short) -1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) b28);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) -1 + "'", obj19.equals((short) -1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str11 = defaultedMap5.toString();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) str11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap1.remove(obj17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        try {
            int i39 = fixedOrderComparator35.compare((java.lang.Object) (short) -1, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Set set40 = defaultedMap38.entrySet();
        try {
            int i41 = fixedOrderComparator35.compare((java.lang.Object) "hi!", (java.lang.Object) defaultedMap38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        fixedOrderComparator35.setUnknownObjectBehavior(1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj5 = defaultedMap2.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap2.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) defaultedMap50, (java.lang.Object) "");
        java.lang.Object obj53 = defaultedMap23.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap50.get((java.lang.Object) true);
        defaultedMap50.clear();
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap50);
        boolean b58 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj63 = defaultedMap60.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set64 = defaultedMap60.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b67 = defaultedMap66.isEmpty();
        boolean b69 = defaultedMap66.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b72 = defaultedMap71.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "");
        boolean b78 = defaultedMap71.equals((java.lang.Object) defaultedMap74);
        defaultedMap66.putAll((java.util.Map) defaultedMap74);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj84 = defaultedMap81.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj89 = defaultedMap86.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj91 = defaultedMap81.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj95 = defaultedMap81.put((java.lang.Object) defaultedMap93, (java.lang.Object) "");
        java.lang.Object obj96 = defaultedMap66.remove((java.lang.Object) defaultedMap93);
        boolean b97 = defaultedMap60.containsKey((java.lang.Object) defaultedMap93);
        defaultedMap50.putAll((java.util.Map) defaultedMap60);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap33.clear();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) (short) 0);
        int i40 = defaultedMap33.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap33);
        java.util.Collection collection42 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) -1 + "'", obj39.equals((short) -1));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        try {
            boolean b40 = fixedOrderComparator35.addAsEqual((java.lang.Object) 0L, (java.lang.Object) predicate38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertNotNull(predicate38);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate25);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set19 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "");
        boolean b33 = defaultedMap26.equals((java.lang.Object) defaultedMap29);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap48, (java.lang.Object) "");
        java.lang.Object obj51 = defaultedMap21.remove((java.lang.Object) defaultedMap48);
        boolean b52 = defaultedMap15.containsKey((java.lang.Object) defaultedMap48);
        boolean b53 = fixedOrderComparator11.add((java.lang.Object) b52);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        java.util.Set set16 = defaultedMap13.keySet();
        int i17 = defaultedMap13.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) "");
        boolean b23 = defaultedMap16.equals((java.lang.Object) defaultedMap19);
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        boolean b25 = defaultedMap19.isEmpty();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap19.equals(obj26);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        java.util.Set set29 = defaultedMap19.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        boolean b15 = fixedOrderComparator11.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 'a');
        boolean b22 = fixedOrderComparator11.addAsEqual((java.lang.Object) defaultedMap17, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.equals((java.lang.Object) "");
        boolean b30 = defaultedMap23.equals((java.lang.Object) defaultedMap26);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) defaultedMap45, (java.lang.Object) "");
        java.lang.Object obj48 = defaultedMap18.remove((java.lang.Object) defaultedMap45);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { obj48, predicate49, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        int i53 = fixedOrderComparator52.getUnknownObjectBehavior();
        int i54 = fixedOrderComparator52.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b57 = defaultedMap56.isEmpty();
        java.util.Set set58 = defaultedMap56.entrySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj63 = defaultedMap60.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj68 = defaultedMap65.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj70 = defaultedMap60.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj74 = defaultedMap60.put((java.lang.Object) defaultedMap72, (java.lang.Object) "");
        boolean b75 = defaultedMap56.containsKey(obj74);
        defaultedMap56.clear();
        boolean b78 = defaultedMap56.containsKey((java.lang.Object) false);
        java.util.Collection collection79 = defaultedMap56.values();
        boolean b80 = fixedOrderComparator52.add((java.lang.Object) collection79);
        boolean b81 = fixedOrderComparator52.isLocked();
        java.lang.Object obj83 = defaultedMap16.put((java.lang.Object) b81, (java.lang.Object) 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        boolean b20 = defaultedMap13.equals((java.lang.Object) defaultedMap16);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        boolean b37 = defaultedMap30.equals((java.lang.Object) defaultedMap33);
        defaultedMap25.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap52, (java.lang.Object) "");
        java.lang.Object obj55 = defaultedMap25.remove((java.lang.Object) defaultedMap52);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { obj55, predicate56, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        int i60 = fixedOrderComparator59.getUnknownObjectBehavior();
        fixedOrderComparator59.setUnknownObjectBehavior(2);
        java.lang.Object obj63 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator59);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(i60 == 2);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        java.util.Set set39 = defaultedMap37.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        boolean b53 = defaultedMap46.equals((java.lang.Object) defaultedMap49);
        defaultedMap41.putAll((java.util.Map) defaultedMap49);
        defaultedMap41.clear();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap41);
        boolean b57 = fixedOrderComparator35.add((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.lang.Object obj60 = defaultedMap41.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b63 = defaultedMap62.isEmpty();
        boolean b65 = defaultedMap62.equals((java.lang.Object) "");
        boolean b67 = defaultedMap62.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj69 = defaultedMap62.remove((java.lang.Object) 10.0d);
        java.util.Collection collection70 = defaultedMap62.values();
        java.lang.Object obj71 = defaultedMap41.get((java.lang.Object) collection70);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) -1 + "'", obj71.equals((short) -1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) true);
        defaultedMap28.clear();
        java.util.Set set35 = defaultedMap28.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.equals((java.lang.Object) "");
        boolean b30 = defaultedMap23.equals((java.lang.Object) defaultedMap26);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        boolean b32 = defaultedMap26.isEmpty();
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap26.equals(obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Set set38 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap52, (java.lang.Object) "");
        boolean b55 = defaultedMap36.containsKey(obj54);
        defaultedMap36.clear();
        defaultedMap36.clear();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate58, predicate60);
        collections.Predicate predicate62 = null;
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate58, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj68 = defaultedMap65.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set69 = defaultedMap65.entrySet();
        java.lang.String str70 = defaultedMap65.toString();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap65);
        java.lang.Object obj72 = defaultedMap1.get((java.lang.Object) map71);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{-1.0=1}" + "'", str70.equals("{-1.0=1}"));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "" + "'", obj72.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj13 = null;
        try {
            int i14 = fixedOrderComparator11.compare((java.lang.Object) 10, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        java.lang.String str21 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b15 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "");
        boolean b21 = defaultedMap14.equals((java.lang.Object) defaultedMap17);
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap24.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj38 = defaultedMap24.put((java.lang.Object) defaultedMap36, (java.lang.Object) "");
        java.lang.Object obj39 = defaultedMap9.remove((java.lang.Object) defaultedMap36);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { obj39, predicate40, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) i44);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b41 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.equals((java.lang.Object) "");
        boolean b47 = defaultedMap40.equals((java.lang.Object) defaultedMap43);
        defaultedMap35.putAll((java.util.Map) defaultedMap43);
        java.lang.String str49 = defaultedMap35.toString();
        java.lang.Object obj50 = defaultedMap28.remove((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 1.0f);
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap52.remove(obj56);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap52.get(obj58);
        java.lang.Object obj60 = defaultedMap28.get(obj59);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) -1 + "'", obj59.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Set set12 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) defaultedMap26, (java.lang.Object) "");
        boolean b29 = defaultedMap10.containsKey(obj28);
        defaultedMap10.clear();
        defaultedMap10.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate32, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate34, predicate36);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{true=1}" + "'", str8.equals("{true=1}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b4 = defaultedMap3.isEmpty();
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap7.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) defaultedMap19, (java.lang.Object) "");
        boolean b22 = defaultedMap3.containsKey(obj21);
        defaultedMap3.clear();
        defaultedMap3.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate25, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        java.lang.Object obj36 = defaultedMap30.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate37, predicate38);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) predicate27, (java.lang.Object) defaultedMap30);
        java.lang.String str41 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap9.remove(obj13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap9.get(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate25, predicate28);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap32.isEmpty();
        java.util.Set set34 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap48, (java.lang.Object) "");
        boolean b51 = defaultedMap32.containsKey(obj50);
        defaultedMap32.clear();
        boolean b54 = defaultedMap32.containsKey((java.lang.Object) false);
        java.lang.String str55 = defaultedMap32.toString();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) str55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj68 = defaultedMap58.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap58.put((java.lang.Object) defaultedMap70, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "");
        boolean b79 = defaultedMap74.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj81 = defaultedMap74.remove((java.lang.Object) 10.0d);
        java.lang.String str82 = defaultedMap74.toString();
        java.lang.Object[] obj_array83 = new java.lang.Object[] { defaultedMap74 };
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        java.lang.Object obj85 = defaultedMap58.remove((java.lang.Object) obj_array83);
        boolean b86 = defaultedMap1.containsKey((java.lang.Object) obj_array83);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) -1 + "'", obj16.equals((short) -1));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) -1 + "'", obj56.equals((short) -1));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Set set11 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) defaultedMap25, (java.lang.Object) "");
        boolean b28 = defaultedMap9.containsKey(obj27);
        int i29 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b42 = defaultedMap39.equals((java.lang.Object) "");
        boolean b43 = defaultedMap36.equals((java.lang.Object) defaultedMap39);
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) defaultedMap58, (java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap31.remove((java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) true);
        defaultedMap58.clear();
        boolean b65 = defaultedMap9.containsValue((java.lang.Object) defaultedMap58);
        boolean b66 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.Factory factory67 = null;
        try {
            java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) -1 + "'", obj63.equals((short) -1));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection44 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        java.util.Set set48 = defaultedMap46.entrySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b51 = defaultedMap50.isEmpty();
        boolean b53 = defaultedMap50.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) "");
        boolean b62 = defaultedMap55.equals((java.lang.Object) defaultedMap58);
        defaultedMap50.putAll((java.util.Map) defaultedMap58);
        defaultedMap50.clear();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap50);
        defaultedMap33.putAll((java.util.Map) defaultedMap46);
        collections.Factory factory67 = null;
        try {
            java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, factory67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        boolean b20 = defaultedMap13.equals((java.lang.Object) defaultedMap16);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) defaultedMap50, (java.lang.Object) "");
        java.lang.Object obj53 = defaultedMap23.remove((java.lang.Object) defaultedMap50);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { obj53, predicate54, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        java.lang.Object obj59 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) "");
        boolean b66 = defaultedMap61.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj68 = defaultedMap61.remove((java.lang.Object) 10.0d);
        java.util.Collection collection69 = defaultedMap61.values();
        boolean b70 = fixedOrderComparator57.add((java.lang.Object) collection69);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator57);
        java.util.Collection collection72 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{-1.0=1}" + "'", str6.equals("{-1.0=1}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(collection72);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) "");
        boolean b8 = defaultedMap3.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) 10.0d);
        java.lang.String str11 = defaultedMap3.toString();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { defaultedMap3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        int i14 = fixedOrderComparator13.getUnknownObjectBehavior();
        int i15 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) "");
        boolean b29 = defaultedMap22.equals((java.lang.Object) defaultedMap25);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b35 = defaultedMap32.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b43 = defaultedMap40.equals((java.lang.Object) "");
        boolean b44 = defaultedMap37.equals((java.lang.Object) defaultedMap40);
        defaultedMap32.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap47.put((java.lang.Object) defaultedMap59, (java.lang.Object) "");
        java.lang.Object obj62 = defaultedMap32.remove((java.lang.Object) defaultedMap59);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { obj62, predicate63, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        int i67 = fixedOrderComparator66.getUnknownObjectBehavior();
        java.lang.Object obj68 = defaultedMap17.remove((java.lang.Object) fixedOrderComparator66);
        boolean b69 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator66);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b69);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(i67 == 2);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        java.util.Set set16 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        boolean b37 = defaultedMap30.equals((java.lang.Object) defaultedMap33);
        defaultedMap25.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap52, (java.lang.Object) "");
        java.lang.Object obj55 = defaultedMap25.remove((java.lang.Object) defaultedMap52);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { obj55, predicate56, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        int i60 = fixedOrderComparator59.getUnknownObjectBehavior();
        int i61 = fixedOrderComparator59.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        java.util.Set set65 = defaultedMap63.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj70 = defaultedMap67.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj75 = defaultedMap72.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj77 = defaultedMap67.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj81 = defaultedMap67.put((java.lang.Object) defaultedMap79, (java.lang.Object) "");
        boolean b82 = defaultedMap63.containsKey(obj81);
        defaultedMap63.clear();
        boolean b85 = defaultedMap63.containsKey((java.lang.Object) false);
        java.util.Collection collection86 = defaultedMap63.values();
        boolean b87 = fixedOrderComparator59.add((java.lang.Object) collection86);
        java.lang.Object obj88 = defaultedMap13.put((java.lang.Object) (byte) -1, (java.lang.Object) collection86);
        java.lang.String str89 = defaultedMap13.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(i60 == 2);
        org.junit.Assert.assertTrue(i61 == 2);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "{-1=[]}" + "'", str89.equals("{-1=[]}"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicate6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Set set11 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) defaultedMap25, (java.lang.Object) "");
        boolean b28 = defaultedMap9.containsKey(obj27);
        int i29 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b42 = defaultedMap39.equals((java.lang.Object) "");
        boolean b43 = defaultedMap36.equals((java.lang.Object) defaultedMap39);
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) defaultedMap58, (java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap31.remove((java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) true);
        defaultedMap58.clear();
        boolean b65 = defaultedMap9.containsValue((java.lang.Object) defaultedMap58);
        boolean b66 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.Transformer transformer67 = null;
        try {
            java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) -1 + "'", obj63.equals((short) -1));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b49 = defaultedMap46.equals((java.lang.Object) "");
        boolean b50 = defaultedMap43.equals((java.lang.Object) defaultedMap46);
        defaultedMap38.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) defaultedMap65, (java.lang.Object) "");
        java.lang.Object obj68 = defaultedMap38.remove((java.lang.Object) defaultedMap65);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) true);
        boolean b71 = fixedOrderComparator35.add((java.lang.Object) true);
        boolean b72 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "");
        defaultedMap74.clear();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate79, predicate80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator83.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator();
        boolean b87 = fixedOrderComparator83.add((java.lang.Object) fixedOrderComparator86);
        try {
            int i88 = fixedOrderComparator35.compare((java.lang.Object) predicate79, (java.lang.Object) fixedOrderComparator83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) -1 + "'", obj70.equals((short) -1));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b87 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap33.clear();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) (short) 0);
        int i40 = defaultedMap33.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap33);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap33.remove(obj42);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) -1 + "'", obj39.equals((short) -1));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) defaultedMap43, (java.lang.Object) "");
        java.lang.Object obj46 = defaultedMap16.remove((java.lang.Object) defaultedMap43);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { obj46, predicate47, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        int i51 = fixedOrderComparator50.getUnknownObjectBehavior();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator50);
        boolean b53 = fixedOrderComparator50.isLocked();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        boolean b58 = defaultedMap55.equals((java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.lang.String str67 = defaultedMap66.toString();
        try {
            boolean b68 = fixedOrderComparator50.addAsEqual((java.lang.Object) predicate62, (java.lang.Object) str67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        java.util.Collection collection16 = defaultedMap1.values();
        defaultedMap1.clear();
        java.util.Set set18 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior(1);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (short) 1);
        try {
            fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.String str37 = defaultedMap23.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        java.util.Set set39 = defaultedMap23.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Set set18 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap25.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap20.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) defaultedMap32, (java.lang.Object) "");
        boolean b35 = defaultedMap16.containsKey(obj34);
        int i36 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b49 = defaultedMap46.equals((java.lang.Object) "");
        boolean b50 = defaultedMap43.equals((java.lang.Object) defaultedMap46);
        defaultedMap38.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) defaultedMap65, (java.lang.Object) "");
        java.lang.Object obj68 = defaultedMap38.remove((java.lang.Object) defaultedMap65);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) true);
        defaultedMap65.clear();
        boolean b72 = defaultedMap16.containsValue((java.lang.Object) defaultedMap65);
        java.util.Set set73 = defaultedMap65.entrySet();
        boolean b74 = defaultedMap9.equals((java.lang.Object) defaultedMap65);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) -1 + "'", obj70.equals((short) -1));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap34, (java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap7.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        java.util.Collection collection39 = defaultedMap1.values();
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap34, (java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap7.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        java.lang.String str39 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set51 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b59 = defaultedMap58.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) "");
        boolean b65 = defaultedMap58.equals((java.lang.Object) defaultedMap61);
        defaultedMap53.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj71 = defaultedMap68.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj78 = defaultedMap68.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj82 = defaultedMap68.put((java.lang.Object) defaultedMap80, (java.lang.Object) "");
        java.lang.Object obj83 = defaultedMap53.remove((java.lang.Object) defaultedMap80);
        boolean b84 = defaultedMap47.containsKey((java.lang.Object) defaultedMap80);
        java.lang.Object obj85 = defaultedMap41.get((java.lang.Object) defaultedMap47);
        defaultedMap47.clear();
        boolean b87 = defaultedMap34.containsKey((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (short) -1 + "'", obj85.equals((short) -1));
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        boolean b16 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "");
        java.lang.Object obj35 = defaultedMap29.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) predicate25, (java.lang.Object) map38);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate(map38, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Set set41 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap55, (java.lang.Object) "");
        boolean b58 = defaultedMap39.containsKey(obj57);
        defaultedMap39.clear();
        boolean b61 = defaultedMap39.containsKey((java.lang.Object) false);
        java.util.Collection collection62 = defaultedMap39.values();
        boolean b63 = fixedOrderComparator35.add((java.lang.Object) collection62);
        boolean b64 = fixedOrderComparator35.isLocked();
        int i65 = fixedOrderComparator35.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap9.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicate14);
        boolean b16 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.equals((java.lang.Object) "");
        boolean b30 = defaultedMap23.equals((java.lang.Object) defaultedMap26);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap33.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) defaultedMap45, (java.lang.Object) "");
        java.lang.Object obj48 = defaultedMap18.remove((java.lang.Object) defaultedMap45);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { obj48, predicate49, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap54.isEmpty();
        java.util.Set set56 = defaultedMap54.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b67 = defaultedMap66.isEmpty();
        boolean b69 = defaultedMap66.equals((java.lang.Object) "");
        boolean b70 = defaultedMap63.equals((java.lang.Object) defaultedMap66);
        defaultedMap58.putAll((java.util.Map) defaultedMap66);
        defaultedMap58.clear();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) defaultedMap58);
        boolean b74 = fixedOrderComparator52.add((java.lang.Object) defaultedMap58);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) false);
        boolean b77 = defaultedMap9.containsKey((java.lang.Object) map76);
        java.lang.Object obj78 = defaultedMap1.remove((java.lang.Object) b77);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) -1 + "'", obj15.equals((short) -1));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate25);
        java.util.Collection collection27 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set18 = defaultedMap14.entrySet();
        java.lang.String str19 = defaultedMap14.toString();
        java.lang.Object obj20 = defaultedMap7.get((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{-1.0=1}" + "'", str19.equals("{-1.0=1}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        boolean b20 = defaultedMap13.equals((java.lang.Object) defaultedMap16);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        java.lang.String str22 = defaultedMap8.toString();
        java.util.Set set23 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) "");
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = defaultedMap25.remove((java.lang.Object) 10.0d);
        java.util.Collection collection33 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "");
        defaultedMap35.clear();
        java.lang.Object obj41 = defaultedMap25.put((java.lang.Object) defaultedMap35, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        java.util.Set set45 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap47.put((java.lang.Object) defaultedMap59, (java.lang.Object) "");
        boolean b62 = defaultedMap43.containsKey(obj61);
        defaultedMap43.clear();
        defaultedMap43.clear();
        defaultedMap25.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj66 = defaultedMap1.put((java.lang.Object) set23, (java.lang.Object) defaultedMap25);
        boolean b67 = defaultedMap25.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{-1.0=1}" + "'", str6.equals("{-1.0=1}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        boolean b27 = defaultedMap20.equals((java.lang.Object) defaultedMap23);
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        boolean b42 = defaultedMap35.equals((java.lang.Object) defaultedMap38);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj55 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) defaultedMap57, (java.lang.Object) "");
        java.lang.Object obj60 = defaultedMap30.remove((java.lang.Object) defaultedMap57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { obj60, predicate61, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        java.lang.Object obj66 = defaultedMap15.remove((java.lang.Object) fixedOrderComparator64);
        boolean b67 = fixedOrderComparator11.add((java.lang.Object) fixedOrderComparator64);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b70 = defaultedMap69.isEmpty();
        boolean b72 = defaultedMap69.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b75 = defaultedMap74.isEmpty();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b78 = defaultedMap77.isEmpty();
        boolean b80 = defaultedMap77.equals((java.lang.Object) "");
        boolean b81 = defaultedMap74.equals((java.lang.Object) defaultedMap77);
        defaultedMap69.putAll((java.util.Map) defaultedMap77);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b85 = defaultedMap84.isEmpty();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b88 = defaultedMap87.isEmpty();
        boolean b90 = defaultedMap87.equals((java.lang.Object) "");
        boolean b91 = defaultedMap84.equals((java.lang.Object) defaultedMap87);
        try {
            boolean b92 = fixedOrderComparator64.addAsEqual((java.lang.Object) defaultedMap77, (java.lang.Object) defaultedMap84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        boolean b20 = defaultedMap13.equals((java.lang.Object) defaultedMap16);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 'a');
        boolean b28 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        boolean b16 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.equals((java.lang.Object) "");
        boolean b30 = defaultedMap23.equals((java.lang.Object) defaultedMap26);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.equals((java.lang.Object) "");
        boolean b45 = defaultedMap38.equals((java.lang.Object) defaultedMap41);
        defaultedMap33.putAll((java.util.Map) defaultedMap41);
        boolean b47 = defaultedMap41.isEmpty();
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap41.equals(obj48);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) b49);
        java.lang.String str51 = defaultedMap18.toString();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        defaultedMap18.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 1.0f);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap38.remove(obj42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap38.get(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b50 = defaultedMap47.equals((java.lang.Object) "");
        java.lang.Object obj53 = defaultedMap47.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate54, predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b61 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "");
        boolean b67 = defaultedMap60.equals((java.lang.Object) defaultedMap63);
        try {
            boolean b68 = fixedOrderComparator35.addAsEqual((java.lang.Object) map58, (java.lang.Object) b67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) "");
        boolean b23 = defaultedMap16.equals((java.lang.Object) defaultedMap19);
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        boolean b25 = defaultedMap19.isEmpty();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap19.equals(obj26);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        boolean b42 = defaultedMap35.equals((java.lang.Object) defaultedMap38);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection44 = defaultedMap38.values();
        java.lang.String str45 = defaultedMap38.toString();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { defaultedMap38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b60 = defaultedMap57.equals((java.lang.Object) "");
        boolean b61 = defaultedMap54.equals((java.lang.Object) defaultedMap57);
        defaultedMap49.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj74 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap64.put((java.lang.Object) defaultedMap76, (java.lang.Object) "");
        java.lang.Object obj79 = defaultedMap49.remove((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b82 = defaultedMap81.isEmpty();
        boolean b84 = defaultedMap81.equals((java.lang.Object) "");
        java.lang.Object obj87 = defaultedMap81.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate88, predicate89);
        java.lang.Object obj91 = defaultedMap76.get((java.lang.Object) defaultedMap81);
        java.lang.Object obj92 = defaultedMap19.put((java.lang.Object) fixedOrderComparator47, (java.lang.Object) defaultedMap81);
        defaultedMap81.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) -1 + "'", obj91.equals((short) -1));
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection44 = defaultedMap33.values();
        java.util.Collection collection45 = defaultedMap33.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap22.isEmpty();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1.0f);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap22.remove(obj26);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap22.get(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate38, predicate41);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) map42);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) -1 + "'", obj29.equals((short) -1));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior(1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) defaultedMap51, (java.lang.Object) "");
        boolean b54 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b67 = defaultedMap64.equals((java.lang.Object) "");
        boolean b68 = defaultedMap61.equals((java.lang.Object) defaultedMap64);
        defaultedMap56.putAll((java.util.Map) defaultedMap64);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b72 = defaultedMap71.isEmpty();
        boolean b74 = defaultedMap71.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b77 = defaultedMap76.isEmpty();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b80 = defaultedMap79.isEmpty();
        boolean b82 = defaultedMap79.equals((java.lang.Object) "");
        boolean b83 = defaultedMap76.equals((java.lang.Object) defaultedMap79);
        defaultedMap71.putAll((java.util.Map) defaultedMap79);
        boolean b85 = defaultedMap79.isEmpty();
        java.lang.Object obj86 = null;
        boolean b87 = defaultedMap79.equals(obj86);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) b87);
        java.lang.String str89 = defaultedMap56.toString();
        java.lang.Object obj90 = defaultedMap39.remove((java.lang.Object) defaultedMap56);
        java.lang.Object obj91 = new java.lang.Object();
        int i92 = fixedOrderComparator35.compare((java.lang.Object) defaultedMap39, obj91);
        int i93 = fixedOrderComparator35.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "{}" + "'", str89.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + "" + "'", obj90.equals(""));
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertTrue(i93 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        boolean b27 = defaultedMap20.equals((java.lang.Object) defaultedMap23);
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        boolean b42 = defaultedMap35.equals((java.lang.Object) defaultedMap38);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj55 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) defaultedMap57, (java.lang.Object) "");
        java.lang.Object obj60 = defaultedMap30.remove((java.lang.Object) defaultedMap57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { obj60, predicate61, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        java.lang.Object obj66 = defaultedMap15.remove((java.lang.Object) fixedOrderComparator64);
        boolean b67 = fixedOrderComparator11.add((java.lang.Object) fixedOrderComparator64);
        boolean b68 = fixedOrderComparator11.isLocked();
        int i69 = fixedOrderComparator11.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i69 == 2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        java.util.Set set40 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap42.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap42.put((java.lang.Object) defaultedMap54, (java.lang.Object) "");
        boolean b57 = defaultedMap38.containsKey(obj56);
        defaultedMap38.clear();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) "");
        boolean b66 = defaultedMap61.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj68 = defaultedMap61.remove((java.lang.Object) 10.0d);
        java.util.Collection collection69 = defaultedMap61.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b72 = defaultedMap71.isEmpty();
        boolean b74 = defaultedMap71.equals((java.lang.Object) "");
        defaultedMap71.clear();
        java.lang.Object obj77 = defaultedMap61.put((java.lang.Object) defaultedMap71, (java.lang.Object) true);
        java.lang.Object obj78 = defaultedMap38.get((java.lang.Object) defaultedMap71);
        java.util.Set set79 = defaultedMap38.keySet();
        try {
            boolean b81 = fixedOrderComparator35.addAsEqual((java.lang.Object) defaultedMap38, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (short) -1 + "'", obj78.equals((short) -1));
        org.junit.Assert.assertNotNull(set79);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 10.0d);
        java.lang.String str17 = defaultedMap9.toString();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { defaultedMap9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        int i21 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b49 = defaultedMap46.equals((java.lang.Object) "");
        boolean b50 = defaultedMap43.equals((java.lang.Object) defaultedMap46);
        defaultedMap38.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) defaultedMap65, (java.lang.Object) "");
        java.lang.Object obj68 = defaultedMap38.remove((java.lang.Object) defaultedMap65);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array71 = new java.lang.Object[] { obj68, predicate69, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        int i73 = fixedOrderComparator72.getUnknownObjectBehavior();
        java.lang.Object obj74 = defaultedMap23.remove((java.lang.Object) fixedOrderComparator72);
        boolean b75 = fixedOrderComparator19.add((java.lang.Object) fixedOrderComparator72);
        java.lang.Object obj77 = defaultedMap1.put((java.lang.Object) fixedOrderComparator19, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) '#');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        boolean b8 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "");
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) defaultedMap33, (java.lang.Object) "");
        boolean b36 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        java.lang.Object obj55 = defaultedMap49.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate56, predicate57);
        java.lang.Object obj59 = defaultedMap21.put((java.lang.Object) predicate45, (java.lang.Object) map58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate45);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        boolean b20 = defaultedMap13.equals((java.lang.Object) defaultedMap16);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 'a');
        boolean b28 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        java.util.Set set32 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap34.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) defaultedMap46, (java.lang.Object) "");
        boolean b49 = defaultedMap30.containsKey(obj48);
        defaultedMap30.clear();
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.equals((java.lang.Object) "");
        boolean b58 = defaultedMap53.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj60 = defaultedMap53.remove((java.lang.Object) 10.0d);
        java.util.Collection collection61 = defaultedMap53.values();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "");
        defaultedMap63.clear();
        java.lang.Object obj69 = defaultedMap53.put((java.lang.Object) defaultedMap63, (java.lang.Object) true);
        java.lang.Object obj70 = defaultedMap30.get((java.lang.Object) defaultedMap63);
        java.util.Set set71 = defaultedMap30.keySet();
        java.lang.Object obj72 = defaultedMap25.get((java.lang.Object) set71);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) -1 + "'", obj70.equals((short) -1));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + ' ' + "'", obj72.equals(' '));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{-1.0=1}" + "'", str6.equals("{-1.0=1}"));
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap9.remove(obj13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap9.get(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate25, predicate28);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap32.isEmpty();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 1.0f);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap32.remove(obj36);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap32.get(obj38);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap32.equals(obj40);
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap32);
        java.util.Set set43 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) -1 + "'", obj16.equals((short) -1));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) -1 + "'", obj39.equals((short) -1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) -1 + "'", obj42.equals((short) -1));
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap34, (java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap7.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        java.lang.String str39 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Set set44 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) defaultedMap58, (java.lang.Object) "");
        boolean b61 = defaultedMap42.containsKey(obj60);
        defaultedMap42.clear();
        defaultedMap42.clear();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate64, predicate66);
        java.lang.Object obj68 = defaultedMap34.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap42);
        collections.Factory factory69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, factory69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        defaultedMap11.clear();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) true);
        int i18 = defaultedMap11.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = defaultedMap18.remove((java.lang.Object) 10.0d);
        java.util.Collection collection26 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b31 = defaultedMap28.equals((java.lang.Object) "");
        defaultedMap28.clear();
        java.lang.Object obj34 = defaultedMap18.put((java.lang.Object) defaultedMap28, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Set set38 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap52, (java.lang.Object) "");
        boolean b55 = defaultedMap36.containsKey(obj54);
        defaultedMap36.clear();
        defaultedMap36.clear();
        defaultedMap18.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Set set60 = defaultedMap18.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        defaultedMap9.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.equals((java.lang.Object) "");
        boolean b17 = defaultedMap10.equals((java.lang.Object) defaultedMap13);
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        defaultedMap5.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) map20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 1.0f);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap23.remove(obj27);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap23.get(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b35 = defaultedMap32.equals((java.lang.Object) "");
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate39, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b48 = defaultedMap45.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b51 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.equals((java.lang.Object) "");
        boolean b57 = defaultedMap50.equals((java.lang.Object) defaultedMap53);
        defaultedMap45.putAll((java.util.Map) defaultedMap53);
        boolean b59 = defaultedMap53.isEmpty();
        java.lang.Object obj60 = null;
        boolean b61 = defaultedMap53.equals(obj60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        java.util.Set set65 = defaultedMap63.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj70 = defaultedMap67.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj75 = defaultedMap72.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj77 = defaultedMap67.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj81 = defaultedMap67.put((java.lang.Object) defaultedMap79, (java.lang.Object) "");
        boolean b82 = defaultedMap63.containsKey(obj81);
        defaultedMap63.clear();
        defaultedMap63.clear();
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate85, predicate87);
        collections.Predicate predicate89 = null;
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate85, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate39, predicate89);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set26 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b31 = defaultedMap28.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        boolean b39 = defaultedMap36.equals((java.lang.Object) "");
        boolean b40 = defaultedMap33.equals((java.lang.Object) defaultedMap36);
        defaultedMap28.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap55, (java.lang.Object) "");
        java.lang.Object obj58 = defaultedMap28.remove((java.lang.Object) defaultedMap55);
        boolean b59 = defaultedMap22.containsKey((java.lang.Object) defaultedMap55);
        java.lang.String str60 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        java.util.Set set65 = defaultedMap63.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj70 = defaultedMap67.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj75 = defaultedMap72.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj77 = defaultedMap67.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj81 = defaultedMap67.put((java.lang.Object) defaultedMap79, (java.lang.Object) "");
        boolean b82 = defaultedMap63.containsKey(obj81);
        defaultedMap63.clear();
        defaultedMap63.clear();
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate85, predicate87);
        java.lang.Object obj89 = defaultedMap55.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap63);
        java.lang.Object obj90 = defaultedMap1.get((java.lang.Object) defaultedMap63);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + (short) -1 + "'", obj90.equals((short) -1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        boolean b16 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "");
        java.lang.Object obj35 = defaultedMap29.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) predicate25, (java.lang.Object) map38);
        java.util.Set set40 = defaultedMap1.entrySet();
        collections.Factory factory41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap10.remove(obj14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap10.get(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) "");
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate26, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b35 = defaultedMap32.equals((java.lang.Object) "");
        java.lang.Object obj38 = defaultedMap32.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate29, predicate39);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) predicate39);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) -1 + "'", obj17.equals((short) -1));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 1 + "'", obj43.equals((byte) 1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) true);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Set set38 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap52, (java.lang.Object) "");
        boolean b55 = defaultedMap36.containsKey(obj54);
        defaultedMap36.clear();
        boolean b57 = defaultedMap28.equals((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b62 = defaultedMap59.equals((java.lang.Object) "");
        defaultedMap59.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b66 = defaultedMap65.isEmpty();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 1.0f);
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap65.remove(obj69);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap65.get(obj71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "");
        java.lang.Object obj80 = defaultedMap74.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate81, predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate81, predicate84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b88 = defaultedMap87.isEmpty();
        boolean b90 = defaultedMap87.equals((java.lang.Object) "");
        java.lang.Object obj93 = defaultedMap87.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate94, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate84, predicate94);
        java.lang.Object obj98 = defaultedMap28.get((java.lang.Object) predicate84);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (short) -1 + "'", obj72.equals((short) -1));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + (short) -1 + "'", obj98.equals((short) -1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) "");
        boolean b8 = defaultedMap3.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) 10.0d);
        java.util.Collection collection11 = defaultedMap3.values();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap14.remove(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "");
        boolean b33 = defaultedMap26.equals((java.lang.Object) defaultedMap29);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection35 = defaultedMap29.values();
        boolean b36 = defaultedMap14.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj37 = defaultedMap1.remove((java.lang.Object) defaultedMap29);
        int i38 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.String str15 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) str15);
        boolean b17 = defaultedMap16.isEmpty();
        int i18 = defaultedMap16.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.equals((java.lang.Object) "{true=1}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) predicate12);
        boolean b14 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) defaultedMap43, (java.lang.Object) "");
        java.lang.Object obj46 = defaultedMap16.remove((java.lang.Object) defaultedMap43);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { obj46, predicate47, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Set set54 = defaultedMap52.entrySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b67 = defaultedMap64.equals((java.lang.Object) "");
        boolean b68 = defaultedMap61.equals((java.lang.Object) defaultedMap64);
        defaultedMap56.putAll((java.util.Map) defaultedMap64);
        defaultedMap56.clear();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap56);
        boolean b72 = fixedOrderComparator50.add((java.lang.Object) defaultedMap56);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) false);
        boolean b75 = defaultedMap7.containsKey((java.lang.Object) map74);
        boolean b76 = defaultedMap1.containsKey((java.lang.Object) b75);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) -1 + "'", obj13.equals((short) -1));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        boolean b9 = defaultedMap6.equals((java.lang.Object) "");
        java.lang.Object obj12 = defaultedMap6.put((java.lang.Object) true, (java.lang.Object) 1L);
        java.lang.String str13 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set19 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "");
        boolean b33 = defaultedMap26.equals((java.lang.Object) defaultedMap29);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap36.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap48, (java.lang.Object) "");
        java.lang.Object obj51 = defaultedMap21.remove((java.lang.Object) defaultedMap48);
        boolean b52 = defaultedMap15.containsKey((java.lang.Object) defaultedMap48);
        java.util.Collection collection53 = defaultedMap15.values();
        try {
            int i54 = fixedOrderComparator3.compare((java.lang.Object) str13, (java.lang.Object) defaultedMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{true=1}" + "'", str13.equals("{true=1}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) defaultedMap26, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        java.lang.Object obj32 = defaultedMap14.get((java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        boolean b40 = defaultedMap37.equals((java.lang.Object) "");
        boolean b41 = defaultedMap34.equals((java.lang.Object) defaultedMap37);
        boolean b42 = defaultedMap14.containsValue((java.lang.Object) b41);
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Set set49 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj61 = defaultedMap51.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj65 = defaultedMap51.put((java.lang.Object) defaultedMap63, (java.lang.Object) "");
        boolean b66 = defaultedMap47.containsKey(obj65);
        defaultedMap47.clear();
        defaultedMap47.clear();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate69, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "");
        java.lang.Object obj80 = defaultedMap74.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate81, predicate82);
        java.lang.Object obj84 = defaultedMap45.put((java.lang.Object) predicate71, (java.lang.Object) defaultedMap74);
        boolean b85 = defaultedMap14.containsKey((java.lang.Object) defaultedMap74);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) -1 + "'", obj32.equals((short) -1));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Set set20 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        boolean b34 = defaultedMap27.equals((java.lang.Object) defaultedMap30);
        defaultedMap22.putAll((java.util.Map) defaultedMap30);
        defaultedMap22.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap22);
        boolean b38 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap46.clear();
        boolean b51 = defaultedMap40.equals((java.lang.Object) defaultedMap46);
        java.lang.Object obj52 = defaultedMap22.remove((java.lang.Object) defaultedMap46);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        boolean b58 = defaultedMap55.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b61 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "");
        boolean b67 = defaultedMap60.equals((java.lang.Object) defaultedMap63);
        defaultedMap55.putAll((java.util.Map) defaultedMap63);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj73 = defaultedMap70.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap75.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap70.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj84 = defaultedMap70.put((java.lang.Object) defaultedMap82, (java.lang.Object) "");
        java.lang.Object obj85 = defaultedMap55.remove((java.lang.Object) defaultedMap82);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array88 = new java.lang.Object[] { obj85, predicate86, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array88);
        int i90 = fixedOrderComparator89.getUnknownObjectBehavior();
        int i91 = fixedOrderComparator89.getUnknownObjectBehavior();
        boolean b92 = defaultedMap22.equals((java.lang.Object) i91);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(obj_array88);
        org.junit.Assert.assertTrue(i90 == 2);
        org.junit.Assert.assertTrue(i91 == 2);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Set set20 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        boolean b34 = defaultedMap27.equals((java.lang.Object) defaultedMap30);
        defaultedMap22.putAll((java.util.Map) defaultedMap30);
        defaultedMap22.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap22);
        boolean b38 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap46.clear();
        boolean b51 = defaultedMap40.equals((java.lang.Object) defaultedMap46);
        java.lang.Object obj52 = defaultedMap22.remove((java.lang.Object) defaultedMap46);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        int i54 = defaultedMap16.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(i54 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap34, (java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap7.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        java.lang.Object obj39 = null;
        boolean b40 = defaultedMap1.containsValue(obj39);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) 10.0d);
        java.util.Collection collection32 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "");
        defaultedMap34.clear();
        java.lang.Object obj40 = defaultedMap24.put((java.lang.Object) defaultedMap34, (java.lang.Object) true);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b45 = defaultedMap44.isEmpty();
        boolean b47 = defaultedMap44.equals((java.lang.Object) "");
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str50 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 1.0f);
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap52.remove(obj56);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap52.get(obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) "");
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate68, predicate71);
        boolean b73 = defaultedMap44.containsValue((java.lang.Object) defaultedMap52);
        java.lang.Object obj74 = defaultedMap34.put(obj42, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b77 = defaultedMap76.isEmpty();
        java.util.Set set78 = defaultedMap76.entrySet();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj83 = defaultedMap80.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj88 = defaultedMap85.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj90 = defaultedMap80.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj94 = defaultedMap80.put((java.lang.Object) defaultedMap92, (java.lang.Object) "");
        boolean b95 = defaultedMap76.containsKey(obj94);
        int i96 = defaultedMap76.size();
        java.util.Collection collection97 = defaultedMap76.values();
        java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) collection97);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) -1 + "'", obj59.equals((short) -1));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(i96 == 0);
        org.junit.Assert.assertNotNull(collection97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        int i5 = defaultedMap1.size();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 10.0d);
        java.util.Collection collection17 = defaultedMap9.values();
        boolean b18 = defaultedMap7.equals((java.lang.Object) defaultedMap9);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "");
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) predicate28);
        java.lang.String str32 = defaultedMap7.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b15 = defaultedMap9.isEmpty();
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap9.equals(obj16);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap34, (java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap7.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        java.util.Collection collection39 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1.0f);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap42.remove(obj46);
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap42.get(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap57.clear();
        boolean b62 = defaultedMap51.equals((java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj74 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap64.put((java.lang.Object) defaultedMap76, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b81 = defaultedMap80.isEmpty();
        java.lang.Object obj82 = defaultedMap64.get((java.lang.Object) b81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b85 = defaultedMap84.isEmpty();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b88 = defaultedMap87.isEmpty();
        boolean b90 = defaultedMap87.equals((java.lang.Object) "");
        boolean b91 = defaultedMap84.equals((java.lang.Object) defaultedMap87);
        boolean b92 = defaultedMap64.containsValue((java.lang.Object) b91);
        boolean b93 = defaultedMap51.containsKey((java.lang.Object) defaultedMap64);
        java.util.Set set94 = defaultedMap64.entrySet();
        java.lang.Object obj95 = defaultedMap42.get((java.lang.Object) set94);
        java.lang.Object obj96 = defaultedMap1.remove(obj95);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) -1 + "'", obj49.equals((short) -1));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) -1 + "'", obj82.equals((short) -1));
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + (short) -1 + "'", obj95.equals((short) -1));
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        defaultedMap5.clear();
        java.util.Collection collection7 = defaultedMap5.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior(1);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (short) 1);
        boolean b40 = fixedOrderComparator35.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) defaultedMap43, (java.lang.Object) "");
        java.lang.Object obj46 = defaultedMap16.remove((java.lang.Object) defaultedMap43);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { obj46, predicate47, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        int i51 = fixedOrderComparator50.getUnknownObjectBehavior();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator50);
        boolean b53 = fixedOrderComparator50.isLocked();
        boolean b54 = fixedOrderComparator50.isLocked();
        boolean b55 = fixedOrderComparator50.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b41 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.equals((java.lang.Object) "");
        boolean b47 = defaultedMap40.equals((java.lang.Object) defaultedMap43);
        defaultedMap35.putAll((java.util.Map) defaultedMap43);
        java.lang.String str49 = defaultedMap35.toString();
        java.lang.Object obj50 = defaultedMap28.remove((java.lang.Object) defaultedMap35);
        java.lang.String str51 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.equals((java.lang.Object) "");
        java.lang.Object obj59 = defaultedMap53.put((java.lang.Object) true, (java.lang.Object) 1L);
        java.lang.String str60 = defaultedMap53.toString();
        defaultedMap53.clear();
        java.lang.Object obj62 = defaultedMap35.remove((java.lang.Object) defaultedMap53);
        java.util.Collection collection63 = defaultedMap35.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{true=1}" + "'", str60.equals("{true=1}"));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        defaultedMap11.clear();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) defaultedMap35, (java.lang.Object) "");
        boolean b38 = defaultedMap19.containsKey(obj37);
        defaultedMap19.clear();
        defaultedMap19.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set47 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b60 = defaultedMap57.equals((java.lang.Object) "");
        boolean b61 = defaultedMap54.equals((java.lang.Object) defaultedMap57);
        defaultedMap49.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj74 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap64.put((java.lang.Object) defaultedMap76, (java.lang.Object) "");
        java.lang.Object obj79 = defaultedMap49.remove((java.lang.Object) defaultedMap76);
        boolean b80 = defaultedMap43.containsKey((java.lang.Object) defaultedMap76);
        java.util.Collection collection81 = defaultedMap43.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap43);
        boolean b83 = defaultedMap43.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) "");
        boolean b23 = defaultedMap16.equals((java.lang.Object) defaultedMap19);
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        boolean b25 = defaultedMap19.isEmpty();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap19.equals(obj26);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        java.util.Set set29 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b42 = defaultedMap39.equals((java.lang.Object) "");
        boolean b43 = defaultedMap36.equals((java.lang.Object) defaultedMap39);
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) defaultedMap58, (java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap31.remove((java.lang.Object) defaultedMap58);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array64 = new java.lang.Object[] { obj61, predicate62, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        int i66 = fixedOrderComparator65.getUnknownObjectBehavior();
        java.lang.Object obj67 = defaultedMap19.get((java.lang.Object) fixedOrderComparator65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b70 = defaultedMap69.isEmpty();
        boolean b72 = defaultedMap69.equals((java.lang.Object) "");
        java.lang.Object obj75 = defaultedMap69.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b81 = defaultedMap80.isEmpty();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b84 = defaultedMap83.isEmpty();
        boolean b86 = defaultedMap83.equals((java.lang.Object) "");
        boolean b87 = defaultedMap80.equals((java.lang.Object) defaultedMap83);
        boolean b88 = defaultedMap69.containsKey((java.lang.Object) defaultedMap80);
        java.lang.Object obj89 = null;
        try {
            int i90 = fixedOrderComparator65.compare((java.lang.Object) defaultedMap69, obj89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i66 == 2);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (short) -1 + "'", obj67.equals((short) -1));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) defaultedMap50, (java.lang.Object) "");
        java.lang.Object obj53 = defaultedMap23.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap50.get((java.lang.Object) true);
        defaultedMap50.clear();
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap50);
        java.util.Set set58 = defaultedMap50.entrySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b63 = defaultedMap60.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b66 = defaultedMap65.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b69 = defaultedMap68.isEmpty();
        boolean b71 = defaultedMap68.equals((java.lang.Object) "");
        boolean b72 = defaultedMap65.equals((java.lang.Object) defaultedMap68);
        defaultedMap60.putAll((java.util.Map) defaultedMap68);
        java.lang.String str74 = defaultedMap60.toString();
        java.util.Set set75 = defaultedMap60.entrySet();
        java.util.Set set76 = defaultedMap60.entrySet();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b79 = defaultedMap78.isEmpty();
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) 1.0f);
        java.lang.Object obj82 = null;
        java.lang.Object obj83 = defaultedMap78.remove(obj82);
        java.util.Set set84 = defaultedMap78.keySet();
        boolean b85 = defaultedMap60.containsValue((java.lang.Object) defaultedMap78);
        boolean b86 = defaultedMap50.equals((java.lang.Object) defaultedMap60);
        int i87 = defaultedMap50.size();
        collections.Transformer transformer88 = null;
        try {
            java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, transformer88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(i87 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection44 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        java.util.Set set48 = defaultedMap46.entrySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b51 = defaultedMap50.isEmpty();
        boolean b53 = defaultedMap50.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) "");
        boolean b62 = defaultedMap55.equals((java.lang.Object) defaultedMap58);
        defaultedMap50.putAll((java.util.Map) defaultedMap58);
        defaultedMap50.clear();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap50);
        defaultedMap33.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection67 = defaultedMap33.values();
        java.util.Set set68 = defaultedMap33.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set68);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        int i5 = defaultedMap1.size();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 10.0d);
        java.util.Collection collection17 = defaultedMap9.values();
        boolean b18 = defaultedMap7.equals((java.lang.Object) defaultedMap9);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b24 = defaultedMap21.equals((java.lang.Object) "");
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.equals((java.lang.Object) "");
        boolean b45 = defaultedMap38.equals((java.lang.Object) defaultedMap41);
        defaultedMap33.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b49 = defaultedMap48.isEmpty();
        boolean b51 = defaultedMap48.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b54 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) "");
        boolean b60 = defaultedMap53.equals((java.lang.Object) defaultedMap56);
        defaultedMap48.putAll((java.util.Map) defaultedMap56);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj71 = defaultedMap68.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj73 = defaultedMap63.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj77 = defaultedMap63.put((java.lang.Object) defaultedMap75, (java.lang.Object) "");
        java.lang.Object obj78 = defaultedMap48.remove((java.lang.Object) defaultedMap75);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array81 = new java.lang.Object[] { obj78, predicate79, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        int i83 = fixedOrderComparator82.getUnknownObjectBehavior();
        java.lang.Object obj84 = defaultedMap33.remove((java.lang.Object) fixedOrderComparator82);
        boolean b85 = defaultedMap7.containsValue(obj84);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertTrue(i83 == 2);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap8.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) defaultedMap20, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b26 = defaultedMap25.isEmpty();
        java.util.Set set27 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        boolean b40 = defaultedMap37.equals((java.lang.Object) "");
        boolean b41 = defaultedMap34.equals((java.lang.Object) defaultedMap37);
        defaultedMap29.putAll((java.util.Map) defaultedMap37);
        defaultedMap29.clear();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap29);
        boolean b45 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap53.clear();
        boolean b58 = defaultedMap47.equals((java.lang.Object) defaultedMap53);
        java.lang.Object obj59 = defaultedMap29.remove((java.lang.Object) defaultedMap53);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        java.lang.String str61 = defaultedMap23.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection63 = defaultedMap23.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{-1.0=1}" + "'", str6.equals("{-1.0=1}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i14 = fixedOrderComparator11.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        boolean b20 = defaultedMap13.equals((java.lang.Object) defaultedMap16);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        java.lang.String str22 = defaultedMap8.toString();
        java.util.Set set23 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) "");
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = defaultedMap25.remove((java.lang.Object) 10.0d);
        java.util.Collection collection33 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "");
        defaultedMap35.clear();
        java.lang.Object obj41 = defaultedMap25.put((java.lang.Object) defaultedMap35, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        java.util.Set set45 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap47.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap47.put((java.lang.Object) defaultedMap59, (java.lang.Object) "");
        boolean b62 = defaultedMap43.containsKey(obj61);
        defaultedMap43.clear();
        defaultedMap43.clear();
        defaultedMap25.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj66 = defaultedMap1.put((java.lang.Object) set23, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b69 = defaultedMap68.isEmpty();
        boolean b71 = defaultedMap68.equals((java.lang.Object) "");
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate75, predicate76);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) map77);
        collections.Transformer transformer79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate(map78, transformer79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{-1.0=1}" + "'", str6.equals("{-1.0=1}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 10.0d);
        java.lang.String str17 = defaultedMap9.toString();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { defaultedMap9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        int i21 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b49 = defaultedMap46.equals((java.lang.Object) "");
        boolean b50 = defaultedMap43.equals((java.lang.Object) defaultedMap46);
        defaultedMap38.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) defaultedMap65, (java.lang.Object) "");
        java.lang.Object obj68 = defaultedMap38.remove((java.lang.Object) defaultedMap65);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array71 = new java.lang.Object[] { obj68, predicate69, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        int i73 = fixedOrderComparator72.getUnknownObjectBehavior();
        java.lang.Object obj74 = defaultedMap23.remove((java.lang.Object) fixedOrderComparator72);
        boolean b75 = fixedOrderComparator19.add((java.lang.Object) fixedOrderComparator72);
        java.lang.Object obj77 = defaultedMap1.put((java.lang.Object) fixedOrderComparator19, (java.lang.Object) '#');
        java.util.Collection collection78 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(collection78);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap3.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) defaultedMap22, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Set set29 = defaultedMap27.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b42 = defaultedMap39.equals((java.lang.Object) "");
        boolean b43 = defaultedMap36.equals((java.lang.Object) defaultedMap39);
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        defaultedMap31.clear();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap31);
        boolean b47 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap49.clear();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap55.clear();
        boolean b60 = defaultedMap49.equals((java.lang.Object) defaultedMap55);
        java.lang.Object obj61 = defaultedMap31.remove((java.lang.Object) defaultedMap55);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.lang.String str63 = defaultedMap25.toString();
        defaultedMap3.putAll((java.util.Map) defaultedMap25);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{-1.0=1}" + "'", str8.equals("{-1.0=1}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator3);
        fixedOrderComparator3.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator3.isLocked();
        boolean b8 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior(1);
        int i38 = fixedOrderComparator35.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i38 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) collection15);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        boolean b8 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        java.util.Set set9 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Set set41 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap55, (java.lang.Object) "");
        boolean b58 = defaultedMap39.containsKey(obj57);
        defaultedMap39.clear();
        boolean b61 = defaultedMap39.containsKey((java.lang.Object) false);
        java.util.Collection collection62 = defaultedMap39.values();
        boolean b63 = fixedOrderComparator35.add((java.lang.Object) collection62);
        boolean b64 = fixedOrderComparator35.isLocked();
        fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 0);
        try {
            fixedOrderComparator35.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.String str15 = defaultedMap1.toString();
        java.util.Set set16 = defaultedMap1.entrySet();
        java.util.Set set17 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 1.0f);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap19.remove(obj23);
        java.util.Set set25 = defaultedMap19.keySet();
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        int i27 = defaultedMap19.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.String str16 = defaultedMap9.toString();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { defaultedMap9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array17);
        try {
            fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        boolean b8 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "");
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) defaultedMap33, (java.lang.Object) "");
        boolean b36 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        java.lang.Object obj55 = defaultedMap49.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate56, predicate57);
        java.lang.Object obj59 = defaultedMap21.put((java.lang.Object) predicate45, (java.lang.Object) map58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate45);
        java.util.Set set61 = defaultedMap1.entrySet();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b65 = defaultedMap64.isEmpty();
        java.util.Set set66 = defaultedMap64.entrySet();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj71 = defaultedMap68.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj78 = defaultedMap68.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj82 = defaultedMap68.put((java.lang.Object) defaultedMap80, (java.lang.Object) "");
        boolean b83 = defaultedMap64.containsKey(obj82);
        defaultedMap64.clear();
        defaultedMap64.clear();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate86, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate62, predicate88);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set33 = defaultedMap32.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        boolean b16 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b32 = defaultedMap29.equals((java.lang.Object) "");
        java.lang.Object obj35 = defaultedMap29.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) predicate25, (java.lang.Object) map38);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.String str37 = defaultedMap23.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        int i44 = defaultedMap40.size();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b49 = defaultedMap48.isEmpty();
        boolean b51 = defaultedMap48.equals((java.lang.Object) "");
        boolean b53 = defaultedMap48.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj55 = defaultedMap48.remove((java.lang.Object) 10.0d);
        java.util.Collection collection56 = defaultedMap48.values();
        boolean b57 = defaultedMap46.equals((java.lang.Object) defaultedMap48);
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b63 = defaultedMap60.equals((java.lang.Object) "");
        java.lang.Object obj66 = defaultedMap60.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate67, predicate68);
        java.lang.Object obj70 = defaultedMap40.put((java.lang.Object) defaultedMap46, (java.lang.Object) predicate67);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate67, predicate71);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        boolean b16 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b29 = defaultedMap26.equals((java.lang.Object) "");
        boolean b30 = defaultedMap23.equals((java.lang.Object) defaultedMap26);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.equals((java.lang.Object) "");
        boolean b45 = defaultedMap38.equals((java.lang.Object) defaultedMap41);
        defaultedMap33.putAll((java.util.Map) defaultedMap41);
        boolean b47 = defaultedMap41.isEmpty();
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap41.equals(obj48);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) b49);
        java.lang.String str51 = defaultedMap18.toString();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap54.isEmpty();
        boolean b57 = defaultedMap54.equals((java.lang.Object) "");
        boolean b59 = defaultedMap54.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = defaultedMap54.remove((java.lang.Object) 10.0d);
        java.util.Collection collection62 = defaultedMap54.values();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b67 = defaultedMap64.equals((java.lang.Object) "");
        defaultedMap64.clear();
        java.lang.Object obj70 = defaultedMap54.put((java.lang.Object) defaultedMap64, (java.lang.Object) true);
        java.lang.Object obj71 = defaultedMap18.get((java.lang.Object) defaultedMap64);
        java.lang.String str72 = defaultedMap18.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) -1 + "'", obj71.equals((short) -1));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) defaultedMap22, (java.lang.Object) "");
        boolean b25 = defaultedMap6.containsKey(obj24);
        int i26 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b31 = defaultedMap28.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        boolean b39 = defaultedMap36.equals((java.lang.Object) "");
        boolean b40 = defaultedMap33.equals((java.lang.Object) defaultedMap36);
        defaultedMap28.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap55, (java.lang.Object) "");
        java.lang.Object obj58 = defaultedMap28.remove((java.lang.Object) defaultedMap55);
        java.lang.Object obj60 = defaultedMap55.get((java.lang.Object) true);
        defaultedMap55.clear();
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) defaultedMap55);
        boolean b63 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.util.Set set64 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b67 = defaultedMap66.isEmpty();
        java.util.Set set68 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj73 = defaultedMap70.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap75.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap70.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj84 = defaultedMap70.put((java.lang.Object) defaultedMap82, (java.lang.Object) "");
        boolean b85 = defaultedMap66.containsKey(obj84);
        int i86 = defaultedMap66.size();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap66);
        boolean b88 = defaultedMap6.containsKey((java.lang.Object) defaultedMap87);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) defaultedMap50, (java.lang.Object) "");
        java.lang.Object obj53 = defaultedMap23.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap50.get((java.lang.Object) true);
        defaultedMap50.clear();
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap50);
        boolean b58 = defaultedMap50.isEmpty();
        boolean b60 = defaultedMap50.containsValue((java.lang.Object) 100L);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b41 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.equals((java.lang.Object) "");
        boolean b47 = defaultedMap40.equals((java.lang.Object) defaultedMap43);
        defaultedMap35.putAll((java.util.Map) defaultedMap43);
        java.lang.String str49 = defaultedMap35.toString();
        java.lang.Object obj50 = defaultedMap28.remove((java.lang.Object) defaultedMap35);
        java.lang.String str51 = defaultedMap35.toString();
        java.util.Collection collection52 = defaultedMap35.values();
        int i53 = defaultedMap35.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(i53 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) 10.0d);
        java.util.Collection collection32 = defaultedMap24.values();
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap24);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap36.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap42.clear();
        boolean b47 = defaultedMap36.equals((java.lang.Object) defaultedMap42);
        java.util.Set set48 = defaultedMap42.keySet();
        boolean b49 = defaultedMap22.containsKey((java.lang.Object) defaultedMap42);
        boolean b50 = defaultedMap12.containsKey((java.lang.Object) b49);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap34, (java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap7.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Set set42 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap44.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap44.put((java.lang.Object) defaultedMap56, (java.lang.Object) "");
        boolean b59 = defaultedMap40.containsKey(obj58);
        defaultedMap40.clear();
        defaultedMap40.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate62, predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b68 = defaultedMap67.isEmpty();
        boolean b70 = defaultedMap67.equals((java.lang.Object) "");
        java.lang.Object obj73 = defaultedMap67.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate64, predicate75);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b22 = defaultedMap19.equals((java.lang.Object) "");
        boolean b23 = defaultedMap16.equals((java.lang.Object) defaultedMap19);
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        boolean b25 = defaultedMap19.isEmpty();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap19.equals(obj26);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        boolean b42 = defaultedMap35.equals((java.lang.Object) defaultedMap38);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection44 = defaultedMap38.values();
        java.lang.String str45 = defaultedMap38.toString();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { defaultedMap38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b60 = defaultedMap57.equals((java.lang.Object) "");
        boolean b61 = defaultedMap54.equals((java.lang.Object) defaultedMap57);
        defaultedMap49.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj74 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap64.put((java.lang.Object) defaultedMap76, (java.lang.Object) "");
        java.lang.Object obj79 = defaultedMap49.remove((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b82 = defaultedMap81.isEmpty();
        boolean b84 = defaultedMap81.equals((java.lang.Object) "");
        java.lang.Object obj87 = defaultedMap81.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate88, predicate89);
        java.lang.Object obj91 = defaultedMap76.get((java.lang.Object) defaultedMap81);
        java.lang.Object obj92 = defaultedMap19.put((java.lang.Object) fixedOrderComparator47, (java.lang.Object) defaultedMap81);
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        int i95 = defaultedMap94.size();
        java.util.Collection collection96 = defaultedMap94.values();
        java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) collection96);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) -1 + "'", obj91.equals((short) -1));
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertNotNull(collection96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        boolean b22 = defaultedMap15.equals((java.lang.Object) defaultedMap18);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap25.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap25.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap25.put((java.lang.Object) defaultedMap37, (java.lang.Object) "");
        java.lang.Object obj40 = defaultedMap10.remove((java.lang.Object) defaultedMap37);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { obj40, predicate41, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) fixedOrderComparator44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b49 = defaultedMap48.isEmpty();
        boolean b51 = defaultedMap48.equals((java.lang.Object) "");
        boolean b53 = defaultedMap48.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj55 = defaultedMap48.remove((java.lang.Object) 10.0d);
        java.util.Collection collection56 = defaultedMap48.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) "");
        defaultedMap58.clear();
        java.lang.Object obj64 = defaultedMap48.put((java.lang.Object) defaultedMap58, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b67 = defaultedMap66.isEmpty();
        java.util.Set set68 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj73 = defaultedMap70.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap75.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap70.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj84 = defaultedMap70.put((java.lang.Object) defaultedMap82, (java.lang.Object) "");
        boolean b85 = defaultedMap66.containsKey(obj84);
        defaultedMap66.clear();
        defaultedMap66.clear();
        defaultedMap48.putAll((java.util.Map) defaultedMap66);
        java.util.Set set89 = defaultedMap66.keySet();
        boolean b90 = fixedOrderComparator44.add((java.lang.Object) set89);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 1 + "'", obj46.equals((byte) 1));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Set set41 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap55, (java.lang.Object) "");
        boolean b58 = defaultedMap39.containsKey(obj57);
        defaultedMap39.clear();
        boolean b61 = defaultedMap39.containsKey((java.lang.Object) false);
        java.util.Collection collection62 = defaultedMap39.values();
        boolean b63 = fixedOrderComparator35.add((java.lang.Object) collection62);
        boolean b64 = fixedOrderComparator35.isLocked();
        fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 0);
        boolean b67 = fixedOrderComparator35.isLocked();
        boolean b68 = fixedOrderComparator35.isLocked();
        int i69 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i70 = fixedOrderComparator35.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        defaultedMap11.clear();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) defaultedMap35, (java.lang.Object) "");
        boolean b38 = defaultedMap19.containsKey(obj37);
        defaultedMap19.clear();
        defaultedMap19.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set47 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b60 = defaultedMap57.equals((java.lang.Object) "");
        boolean b61 = defaultedMap54.equals((java.lang.Object) defaultedMap57);
        defaultedMap49.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj74 = defaultedMap64.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap64.put((java.lang.Object) defaultedMap76, (java.lang.Object) "");
        java.lang.Object obj79 = defaultedMap49.remove((java.lang.Object) defaultedMap76);
        boolean b80 = defaultedMap43.containsKey((java.lang.Object) defaultedMap76);
        java.util.Collection collection81 = defaultedMap43.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj87 = defaultedMap84.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj88 = defaultedMap43.get(obj87);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + (short) -1 + "'", obj88.equals((short) -1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(2);
        try {
            fixedOrderComparator35.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b41 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.equals((java.lang.Object) "");
        boolean b47 = defaultedMap40.equals((java.lang.Object) defaultedMap43);
        defaultedMap35.putAll((java.util.Map) defaultedMap43);
        java.lang.String str49 = defaultedMap35.toString();
        java.lang.Object obj50 = defaultedMap28.remove((java.lang.Object) defaultedMap35);
        java.lang.String str51 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b56 = defaultedMap53.equals((java.lang.Object) "");
        java.lang.Object obj59 = defaultedMap53.put((java.lang.Object) true, (java.lang.Object) 1L);
        java.lang.String str60 = defaultedMap53.toString();
        defaultedMap53.clear();
        java.lang.Object obj62 = defaultedMap35.remove((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b67 = defaultedMap64.equals((java.lang.Object) "");
        boolean b69 = defaultedMap64.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj71 = defaultedMap64.remove((java.lang.Object) 10.0d);
        java.lang.String str72 = defaultedMap64.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b77 = defaultedMap74.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b80 = defaultedMap79.isEmpty();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b83 = defaultedMap82.isEmpty();
        boolean b85 = defaultedMap82.equals((java.lang.Object) "");
        boolean b86 = defaultedMap79.equals((java.lang.Object) defaultedMap82);
        defaultedMap74.putAll((java.util.Map) defaultedMap82);
        boolean b88 = defaultedMap82.isEmpty();
        java.lang.Object obj89 = null;
        boolean b90 = defaultedMap82.equals(obj89);
        boolean b91 = defaultedMap64.containsValue((java.lang.Object) defaultedMap82);
        defaultedMap35.putAll((java.util.Map) defaultedMap64);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{true=1}" + "'", str60.equals("{true=1}"));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap10.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) defaultedMap22, (java.lang.Object) "");
        boolean b25 = defaultedMap6.containsKey(obj24);
        int i26 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b31 = defaultedMap28.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        boolean b39 = defaultedMap36.equals((java.lang.Object) "");
        boolean b40 = defaultedMap33.equals((java.lang.Object) defaultedMap36);
        defaultedMap28.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap55, (java.lang.Object) "");
        java.lang.Object obj58 = defaultedMap28.remove((java.lang.Object) defaultedMap55);
        java.lang.Object obj60 = defaultedMap55.get((java.lang.Object) true);
        defaultedMap55.clear();
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) defaultedMap55);
        boolean b63 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b68 = defaultedMap67.isEmpty();
        boolean b70 = defaultedMap67.equals((java.lang.Object) "");
        boolean b72 = defaultedMap67.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj74 = defaultedMap67.remove((java.lang.Object) 10.0d);
        java.util.Collection collection75 = defaultedMap67.values();
        boolean b76 = defaultedMap65.equals((java.lang.Object) defaultedMap67);
        boolean b77 = defaultedMap6.containsKey((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1.0f);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap9.remove(obj13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap9.get(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.equals((java.lang.Object) "");
        java.lang.Object obj24 = defaultedMap18.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate25, predicate28);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap32.isEmpty();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 1.0f);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap32.remove(obj36);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap32.get(obj38);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap32.equals(obj40);
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap32);
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) -1 + "'", obj16.equals((short) -1));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) -1 + "'", obj39.equals((short) -1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) -1 + "'", obj42.equals((short) -1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.equals((java.lang.Object) "");
        boolean b17 = defaultedMap10.equals((java.lang.Object) defaultedMap13);
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        defaultedMap5.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        boolean b21 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap29.clear();
        boolean b34 = defaultedMap23.equals((java.lang.Object) defaultedMap29);
        java.lang.Object obj35 = defaultedMap5.remove((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        boolean b40 = defaultedMap37.equals((java.lang.Object) "");
        boolean b42 = defaultedMap37.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap44.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap44.put((java.lang.Object) defaultedMap56, (java.lang.Object) "");
        boolean b59 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) "");
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate68, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b73 = defaultedMap72.isEmpty();
        boolean b75 = defaultedMap72.equals((java.lang.Object) "");
        java.lang.Object obj78 = defaultedMap72.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate79, predicate80);
        java.lang.Object obj82 = defaultedMap44.put((java.lang.Object) predicate68, (java.lang.Object) map81);
        boolean b83 = defaultedMap37.equals((java.lang.Object) map81);
        java.lang.Object obj84 = defaultedMap5.remove((java.lang.Object) map81);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Set set11 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap13.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) defaultedMap25, (java.lang.Object) "");
        boolean b28 = defaultedMap9.containsKey(obj27);
        int i29 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b42 = defaultedMap39.equals((java.lang.Object) "");
        boolean b43 = defaultedMap36.equals((java.lang.Object) defaultedMap39);
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) defaultedMap58, (java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap31.remove((java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) true);
        defaultedMap58.clear();
        boolean b65 = defaultedMap9.containsValue((java.lang.Object) defaultedMap58);
        boolean b66 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b70 = defaultedMap69.isEmpty();
        java.util.Set set71 = defaultedMap69.entrySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj81 = defaultedMap78.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj83 = defaultedMap73.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj87 = defaultedMap73.put((java.lang.Object) defaultedMap85, (java.lang.Object) "");
        boolean b88 = defaultedMap69.containsKey(obj87);
        defaultedMap69.clear();
        boolean b91 = defaultedMap69.containsKey((java.lang.Object) false);
        java.lang.Object obj92 = defaultedMap9.get((java.lang.Object) b91);
        java.lang.Object obj93 = null;
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj93);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) -1 + "'", obj7.equals((short) -1));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) -1 + "'", obj63.equals((short) -1));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (short) -1 + "'", obj92.equals((short) -1));
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) b28);
        java.util.Set set30 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) -1 + "'", obj19.equals((short) -1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b42 = defaultedMap39.equals((java.lang.Object) "");
        boolean b43 = defaultedMap36.equals((java.lang.Object) defaultedMap39);
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap46.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) defaultedMap58, (java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap31.remove((java.lang.Object) defaultedMap58);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array64 = new java.lang.Object[] { obj61, predicate62, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        int i66 = fixedOrderComparator65.getUnknownObjectBehavior();
        java.lang.Object obj67 = defaultedMap16.remove((java.lang.Object) fixedOrderComparator65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b70 = defaultedMap69.isEmpty();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 1.0f);
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = defaultedMap69.remove(obj73);
        java.util.Set set75 = defaultedMap69.keySet();
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) fixedOrderComparator65, (java.lang.Object) set75);
        boolean b77 = fixedOrderComparator65.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i66 == 2);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) 10.0d);
        java.util.Collection collection32 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "");
        defaultedMap34.clear();
        java.lang.Object obj40 = defaultedMap24.put((java.lang.Object) defaultedMap34, (java.lang.Object) true);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b45 = defaultedMap44.isEmpty();
        boolean b47 = defaultedMap44.equals((java.lang.Object) "");
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str50 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b53 = defaultedMap52.isEmpty();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 1.0f);
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap52.remove(obj56);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap52.get(obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) "");
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate68, predicate71);
        boolean b73 = defaultedMap44.containsValue((java.lang.Object) defaultedMap52);
        java.lang.Object obj74 = defaultedMap34.put(obj42, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b77 = defaultedMap76.isEmpty();
        boolean b79 = defaultedMap76.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b82 = defaultedMap81.isEmpty();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b85 = defaultedMap84.isEmpty();
        boolean b87 = defaultedMap84.equals((java.lang.Object) "");
        boolean b88 = defaultedMap81.equals((java.lang.Object) defaultedMap84);
        defaultedMap76.putAll((java.util.Map) defaultedMap84);
        defaultedMap76.clear();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap76);
        java.lang.String str92 = defaultedMap76.toString();
        boolean b93 = defaultedMap76.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) -1 + "'", obj59.equals((short) -1));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "{}" + "'", str92.equals("{}"));
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b30 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b35 = defaultedMap32.equals((java.lang.Object) "");
        boolean b36 = defaultedMap29.equals((java.lang.Object) defaultedMap32);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) defaultedMap51, (java.lang.Object) "");
        java.lang.Object obj54 = defaultedMap24.remove((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b59 = defaultedMap56.equals((java.lang.Object) "");
        java.lang.Object obj62 = defaultedMap56.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate63, predicate64);
        java.lang.Object obj66 = defaultedMap51.get((java.lang.Object) defaultedMap56);
        java.util.Collection collection67 = defaultedMap56.values();
        boolean b68 = defaultedMap1.equals((java.lang.Object) collection67);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) -1 + "'", obj66.equals((short) -1));
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        java.lang.String str8 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap17.clear();
        boolean b22 = defaultedMap11.equals((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap24.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj38 = defaultedMap24.put((java.lang.Object) defaultedMap36, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b41 = defaultedMap40.isEmpty();
        java.lang.Object obj42 = defaultedMap24.get((java.lang.Object) b41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b45 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b50 = defaultedMap47.equals((java.lang.Object) "");
        boolean b51 = defaultedMap44.equals((java.lang.Object) defaultedMap47);
        boolean b52 = defaultedMap24.containsValue((java.lang.Object) b51);
        boolean b53 = defaultedMap11.containsKey((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap55.clear();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj61 = defaultedMap55.get((java.lang.Object) predicate60);
        java.lang.Object obj63 = defaultedMap11.put(obj61, (java.lang.Object) "");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{true=1}" + "'", str8.equals("{true=1}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) -1 + "'", obj42.equals((short) -1));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.String str15 = defaultedMap1.toString();
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) 10.0d);
        java.util.Collection collection32 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "");
        defaultedMap34.clear();
        java.lang.Object obj40 = defaultedMap24.put((java.lang.Object) defaultedMap34, (java.lang.Object) true);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        java.util.Set set45 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b50 = defaultedMap47.equals((java.lang.Object) "");
        boolean b52 = defaultedMap47.containsKey((java.lang.Object) (byte) -1);
        java.lang.String str53 = defaultedMap47.toString();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) str53);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) map54);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        boolean b8 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "");
        boolean b15 = defaultedMap10.equals((java.lang.Object) '#');
        java.util.Set set16 = defaultedMap10.keySet();
        java.util.Set set17 = defaultedMap10.entrySet();
        boolean b18 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "");
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) 10.0d);
        java.lang.String str25 = defaultedMap17.toString();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { defaultedMap17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) obj_array26);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap1.remove(obj29);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "");
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) 10.0d);
        java.lang.String str25 = defaultedMap17.toString();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { defaultedMap17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) obj_array26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        boolean b42 = defaultedMap35.equals((java.lang.Object) defaultedMap38);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection44 = defaultedMap38.values();
        java.lang.String str45 = defaultedMap38.toString();
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) str45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj58 = defaultedMap48.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) defaultedMap60, (java.lang.Object) "");
        boolean b63 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b66 = defaultedMap65.isEmpty();
        boolean b68 = defaultedMap65.equals((java.lang.Object) "");
        java.lang.Object obj71 = defaultedMap65.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b77 = defaultedMap76.isEmpty();
        boolean b79 = defaultedMap76.equals((java.lang.Object) "");
        java.lang.Object obj82 = defaultedMap76.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate83, predicate84);
        java.lang.Object obj86 = defaultedMap48.put((java.lang.Object) predicate72, (java.lang.Object) map85);
        java.util.Set set87 = defaultedMap48.entrySet();
        boolean b88 = defaultedMap1.equals((java.lang.Object) defaultedMap48);
        java.util.Set set89 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(set89);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b40 = defaultedMap39.isEmpty();
        java.util.Set set41 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap43.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap55, (java.lang.Object) "");
        boolean b58 = defaultedMap39.containsKey(obj57);
        defaultedMap39.clear();
        boolean b61 = defaultedMap39.containsKey((java.lang.Object) false);
        java.util.Collection collection62 = defaultedMap39.values();
        boolean b63 = fixedOrderComparator35.add((java.lang.Object) collection62);
        boolean b64 = fixedOrderComparator35.isLocked();
        fixedOrderComparator35.setUnknownObjectBehavior(1);
        fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator18);
        try {
            int i20 = fixedOrderComparator11.compare((java.lang.Object) predicate14, (java.lang.Object) fixedOrderComparator15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) defaultedMap26, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        java.lang.Object obj32 = defaultedMap14.get((java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        boolean b40 = defaultedMap37.equals((java.lang.Object) "");
        boolean b41 = defaultedMap34.equals((java.lang.Object) defaultedMap37);
        boolean b42 = defaultedMap14.containsValue((java.lang.Object) b41);
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        java.util.Set set44 = defaultedMap14.entrySet();
        java.util.Set set45 = defaultedMap14.keySet();
        int i46 = defaultedMap14.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) -1 + "'", obj32.equals((short) -1));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(i46 == 3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b49 = defaultedMap46.equals((java.lang.Object) "");
        boolean b50 = defaultedMap43.equals((java.lang.Object) defaultedMap46);
        defaultedMap38.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap53.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) defaultedMap65, (java.lang.Object) "");
        java.lang.Object obj68 = defaultedMap38.remove((java.lang.Object) defaultedMap65);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) true);
        boolean b71 = fixedOrderComparator35.add((java.lang.Object) true);
        boolean b72 = fixedOrderComparator35.isLocked();
        int i73 = fixedOrderComparator35.getUnknownObjectBehavior();
        try {
            fixedOrderComparator35.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) -1 + "'", obj70.equals((short) -1));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i73 == 2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap17.clear();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap17.isEmpty();
        boolean b25 = defaultedMap9.containsValue((java.lang.Object) b24);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) -1 + "'", obj23.equals((short) -1));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) defaultedMap43, (java.lang.Object) "");
        java.lang.Object obj46 = defaultedMap16.remove((java.lang.Object) defaultedMap43);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { obj46, predicate47, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        int i51 = fixedOrderComparator50.getUnknownObjectBehavior();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator50);
        boolean b53 = fixedOrderComparator50.isLocked();
        int i54 = fixedOrderComparator50.getUnknownObjectBehavior();
        boolean b55 = fixedOrderComparator50.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.String str16 = defaultedMap9.toString();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { defaultedMap9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        try {
            fixedOrderComparator19.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.util.Collection collection21 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.String str37 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) str37);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b40 = defaultedMap12.containsKey((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b43 = defaultedMap42.isEmpty();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1.0f);
        boolean b46 = defaultedMap12.containsKey((java.lang.Object) map45);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator3);
        fixedOrderComparator3.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Set set10 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap12.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) defaultedMap24, (java.lang.Object) "");
        boolean b27 = defaultedMap8.containsKey(obj26);
        defaultedMap8.clear();
        defaultedMap8.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate30, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        int i39 = defaultedMap35.size();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b46 = defaultedMap43.equals((java.lang.Object) "");
        boolean b48 = defaultedMap43.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj50 = defaultedMap43.remove((java.lang.Object) 10.0d);
        java.util.Collection collection51 = defaultedMap43.values();
        boolean b52 = defaultedMap41.equals((java.lang.Object) defaultedMap43);
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        boolean b58 = defaultedMap55.equals((java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap55.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate63);
        java.lang.Object obj65 = defaultedMap35.put((java.lang.Object) defaultedMap41, (java.lang.Object) predicate62);
        try {
            boolean b66 = fixedOrderComparator3.addAsEqual((java.lang.Object) defaultedMap8, (java.lang.Object) predicate62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b22 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b28 = defaultedMap21.equals((java.lang.Object) defaultedMap24);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) defaultedMap43, (java.lang.Object) "");
        java.lang.Object obj46 = defaultedMap16.remove((java.lang.Object) defaultedMap43);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { obj46, predicate47, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        int i51 = fixedOrderComparator50.getUnknownObjectBehavior();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator50);
        int i53 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        boolean b58 = defaultedMap55.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b61 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b66 = defaultedMap63.equals((java.lang.Object) "");
        boolean b67 = defaultedMap60.equals((java.lang.Object) defaultedMap63);
        defaultedMap55.putAll((java.util.Map) defaultedMap63);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj73 = defaultedMap70.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj78 = defaultedMap75.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap70.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj84 = defaultedMap70.put((java.lang.Object) defaultedMap82, (java.lang.Object) "");
        java.lang.Object obj85 = defaultedMap55.remove((java.lang.Object) defaultedMap82);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b88 = defaultedMap87.isEmpty();
        boolean b90 = defaultedMap87.equals((java.lang.Object) "");
        java.lang.Object obj93 = defaultedMap87.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate94, predicate95);
        java.lang.Object obj97 = defaultedMap82.get((java.lang.Object) defaultedMap87);
        boolean b98 = defaultedMap1.containsValue((java.lang.Object) defaultedMap82);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + (short) -1 + "'", obj97.equals((short) -1));
        org.junit.Assert.assertTrue(b98 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Set set13 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) defaultedMap27, (java.lang.Object) "");
        boolean b30 = defaultedMap11.containsKey(obj29);
        defaultedMap11.clear();
        boolean b33 = defaultedMap11.containsKey((java.lang.Object) false);
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) b33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b37 = defaultedMap36.isEmpty();
        java.util.Set set38 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap40.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap52, (java.lang.Object) "");
        boolean b55 = defaultedMap36.containsKey(obj54);
        defaultedMap36.clear();
        defaultedMap36.clear();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate58, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate58, predicate62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b67 = defaultedMap66.isEmpty();
        boolean b69 = defaultedMap66.equals((java.lang.Object) "");
        defaultedMap66.clear();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b77 = defaultedMap76.isEmpty();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 1.0f);
        java.lang.Object obj80 = null;
        java.lang.Object obj81 = defaultedMap76.remove(obj80);
        java.lang.Object obj82 = null;
        java.lang.Object obj83 = defaultedMap76.get(obj82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b86 = defaultedMap85.isEmpty();
        boolean b88 = defaultedMap85.equals((java.lang.Object) "");
        java.lang.Object obj91 = defaultedMap85.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate92, predicate93);
        collections.Predicate predicate95 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate92, predicate95);
        java.lang.Object obj97 = defaultedMap1.put((java.lang.Object) map74, (java.lang.Object) defaultedMap76);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) -1 + "'", obj83.equals((short) -1));
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap7.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b13 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        boolean b19 = defaultedMap12.equals((java.lang.Object) defaultedMap15);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap22.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap34, (java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap7.remove((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        java.util.Set set39 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1.0f);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap15.remove(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        boolean b34 = defaultedMap27.equals((java.lang.Object) defaultedMap30);
        defaultedMap22.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection36 = defaultedMap30.values();
        boolean b37 = defaultedMap15.equals((java.lang.Object) defaultedMap30);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) "");
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b3 = defaultedMap2.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        boolean b9 = defaultedMap2.equals((java.lang.Object) defaultedMap5);
        boolean b10 = fixedOrderComparator0.add((java.lang.Object) b9);
        boolean b11 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.String str16 = defaultedMap9.toString();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { defaultedMap9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array17);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b15 = defaultedMap14.isEmpty();
        boolean b17 = defaultedMap14.equals((java.lang.Object) "");
        boolean b19 = defaultedMap14.equals((java.lang.Object) '#');
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        boolean b37 = defaultedMap31.isEmpty();
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap31.equals(obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap41.isEmpty();
        java.util.Set set43 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj55 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) defaultedMap57, (java.lang.Object) "");
        boolean b60 = defaultedMap41.containsKey(obj59);
        defaultedMap41.clear();
        defaultedMap41.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate63, predicate65);
        collections.Predicate predicate67 = null;
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate63, predicate67);
        collections.Predicate predicate69 = null;
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate63, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b73 = defaultedMap72.isEmpty();
        java.util.Set set74 = defaultedMap72.entrySet();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj79 = defaultedMap76.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj84 = defaultedMap81.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj86 = defaultedMap76.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj90 = defaultedMap76.put((java.lang.Object) defaultedMap88, (java.lang.Object) "");
        boolean b91 = defaultedMap72.containsKey(obj90);
        defaultedMap72.clear();
        defaultedMap72.clear();
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) predicate94);
        collections.Predicate predicate96 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate94, predicate96);
        try {
            int i98 = fixedOrderComparator11.compare((java.lang.Object) defaultedMap14, (java.lang.Object) predicate96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) "");
        boolean b8 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b13 = defaultedMap10.equals((java.lang.Object) "");
        java.lang.Object obj16 = defaultedMap10.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap21.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) defaultedMap33, (java.lang.Object) "");
        boolean b36 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        java.lang.Object obj44 = defaultedMap38.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        java.lang.Object obj55 = defaultedMap49.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate56, predicate57);
        java.lang.Object obj59 = defaultedMap21.put((java.lang.Object) predicate45, (java.lang.Object) map58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate45);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b63 = defaultedMap62.isEmpty();
        java.util.Set set64 = defaultedMap62.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj74 = defaultedMap71.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj76 = defaultedMap66.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj80 = defaultedMap66.put((java.lang.Object) defaultedMap78, (java.lang.Object) "");
        boolean b81 = defaultedMap62.containsKey(obj80);
        defaultedMap62.clear();
        int i83 = defaultedMap62.size();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap62);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "");
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) 10.0d);
        java.lang.String str25 = defaultedMap17.toString();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { defaultedMap17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array26);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b28 = defaultedMap25.equals((java.lang.Object) "");
        boolean b29 = defaultedMap22.equals((java.lang.Object) defaultedMap25);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap32.put((java.lang.Object) defaultedMap44, (java.lang.Object) "");
        java.lang.Object obj47 = defaultedMap17.remove((java.lang.Object) defaultedMap44);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { obj47, predicate48, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        int i52 = fixedOrderComparator51.getUnknownObjectBehavior();
        int i53 = fixedOrderComparator51.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        java.util.Set set57 = defaultedMap55.entrySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj62 = defaultedMap59.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap59.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj73 = defaultedMap59.put((java.lang.Object) defaultedMap71, (java.lang.Object) "");
        boolean b74 = defaultedMap55.containsKey(obj73);
        defaultedMap55.clear();
        boolean b77 = defaultedMap55.containsKey((java.lang.Object) false);
        java.util.Collection collection78 = defaultedMap55.values();
        boolean b79 = fixedOrderComparator51.add((java.lang.Object) collection78);
        boolean b80 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator51);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b14 = defaultedMap11.equals((java.lang.Object) "");
        defaultedMap11.clear();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) collection20);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b21 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        boolean b27 = defaultedMap20.equals((java.lang.Object) defaultedMap23);
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        boolean b42 = defaultedMap35.equals((java.lang.Object) defaultedMap38);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj55 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) defaultedMap57, (java.lang.Object) "");
        java.lang.Object obj60 = defaultedMap30.remove((java.lang.Object) defaultedMap57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { obj60, predicate61, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        java.lang.Object obj66 = defaultedMap15.remove((java.lang.Object) fixedOrderComparator64);
        boolean b67 = fixedOrderComparator11.add((java.lang.Object) fixedOrderComparator64);
        int i68 = fixedOrderComparator11.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i68 == 2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(2);
        boolean b39 = fixedOrderComparator35.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator35.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap39.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) defaultedMap51, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.util.Set set55 = defaultedMap51.entrySet();
        java.lang.Object obj56 = null;
        try {
            boolean b57 = fixedOrderComparator35.addAsEqual((java.lang.Object) defaultedMap51, obj56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.equals((java.lang.Object) "");
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = defaultedMap24.remove((java.lang.Object) 10.0d);
        java.util.Collection collection32 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b37 = defaultedMap34.equals((java.lang.Object) "");
        defaultedMap34.clear();
        java.lang.Object obj40 = defaultedMap24.put((java.lang.Object) defaultedMap34, (java.lang.Object) true);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) defaultedMap34);
        defaultedMap1.clear();
        java.lang.Object obj43 = null;
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj43);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b16 = defaultedMap15.isEmpty();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1.0f);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap15.remove(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b25 = defaultedMap22.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b28 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        boolean b34 = defaultedMap27.equals((java.lang.Object) defaultedMap30);
        defaultedMap22.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection36 = defaultedMap30.values();
        boolean b37 = defaultedMap15.equals((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 'a');
        boolean b42 = defaultedMap15.equals((java.lang.Object) defaultedMap39);
        boolean b43 = fixedOrderComparator11.add((java.lang.Object) b42);
        int i44 = fixedOrderComparator11.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i44 == 2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) 1L);
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{true=1}" + "'", str8.equals("{true=1}"));
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b29 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b34 = defaultedMap31.equals((java.lang.Object) "");
        boolean b35 = defaultedMap28.equals((java.lang.Object) defaultedMap31);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap38.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) defaultedMap50, (java.lang.Object) "");
        java.lang.Object obj53 = defaultedMap23.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap50.get((java.lang.Object) true);
        defaultedMap50.clear();
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap50);
        boolean b58 = defaultedMap50.isEmpty();
        collections.Predicate predicate59 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap61.clear();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap61.get((java.lang.Object) predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate59, predicate66);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (short) -1 + "'", obj67.equals((short) -1));
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) b18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b26 = defaultedMap23.equals((java.lang.Object) "");
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = defaultedMap23.remove((java.lang.Object) 10.0d);
        java.util.Collection collection31 = defaultedMap23.values();
        boolean b32 = defaultedMap21.equals((java.lang.Object) defaultedMap23);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap41.clear();
        boolean b46 = defaultedMap35.equals((java.lang.Object) defaultedMap41);
        java.util.Set set47 = defaultedMap41.keySet();
        boolean b48 = defaultedMap21.containsKey((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b51 = defaultedMap50.isEmpty();
        boolean b53 = defaultedMap50.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b61 = defaultedMap58.equals((java.lang.Object) "");
        boolean b62 = defaultedMap55.equals((java.lang.Object) defaultedMap58);
        defaultedMap50.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj68 = defaultedMap65.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj73 = defaultedMap70.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj75 = defaultedMap65.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj79 = defaultedMap65.put((java.lang.Object) defaultedMap77, (java.lang.Object) "");
        java.lang.Object obj80 = defaultedMap50.remove((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b83 = defaultedMap82.isEmpty();
        boolean b85 = defaultedMap82.equals((java.lang.Object) "");
        java.lang.Object obj88 = defaultedMap82.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate89, predicate90);
        java.lang.Object obj92 = defaultedMap77.get((java.lang.Object) defaultedMap82);
        defaultedMap41.putAll((java.util.Map) defaultedMap77);
        boolean b94 = defaultedMap1.containsValue((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) -1 + "'", obj19.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (short) -1 + "'", obj92.equals((short) -1));
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator3);
        boolean b5 = fixedOrderComparator0.isLocked();
        boolean b6 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b16 = defaultedMap13.equals((java.lang.Object) "");
        boolean b17 = defaultedMap10.equals((java.lang.Object) defaultedMap13);
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        defaultedMap5.clear();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap28.clear();
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap28);
        java.util.Set set34 = defaultedMap28.keySet();
        java.util.Collection collection35 = defaultedMap28.values();
        boolean b36 = defaultedMap5.equals((java.lang.Object) defaultedMap28);
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b11 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b19 = defaultedMap16.equals((java.lang.Object) "");
        boolean b20 = defaultedMap13.equals((java.lang.Object) defaultedMap16);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap23.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) defaultedMap35, (java.lang.Object) "");
        java.lang.Object obj38 = defaultedMap8.remove((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap40.clear();
        java.lang.Object obj46 = defaultedMap40.get((java.lang.Object) (short) 0);
        int i47 = defaultedMap40.size();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap40);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj61 = defaultedMap51.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj65 = defaultedMap51.put((java.lang.Object) defaultedMap63, (java.lang.Object) "");
        boolean b66 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b69 = defaultedMap68.isEmpty();
        boolean b71 = defaultedMap68.equals((java.lang.Object) "");
        java.lang.Object obj74 = defaultedMap68.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate75, predicate76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b80 = defaultedMap79.isEmpty();
        boolean b82 = defaultedMap79.equals((java.lang.Object) "");
        java.lang.Object obj85 = defaultedMap79.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate86, predicate87);
        java.lang.Object obj89 = defaultedMap51.put((java.lang.Object) predicate75, (java.lang.Object) map88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate49, predicate75);
        try {
            boolean b91 = fixedOrderComparator3.addAsEqual((java.lang.Object) (short) -1, (java.lang.Object) predicate75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) -1 + "'", obj46.equals((short) -1));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b6 = defaultedMap3.equals((java.lang.Object) "");
        boolean b8 = defaultedMap3.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) 10.0d);
        java.lang.String str11 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b14 = defaultedMap13.isEmpty();
        java.util.Set set15 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) defaultedMap29, (java.lang.Object) "");
        boolean b32 = defaultedMap13.containsKey(obj31);
        defaultedMap13.clear();
        boolean b35 = defaultedMap13.containsKey((java.lang.Object) false);
        java.lang.Object obj36 = defaultedMap3.remove((java.lang.Object) b35);
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) b35);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap17, (java.lang.Object) "");
        boolean b20 = defaultedMap1.containsKey(obj19);
        int i21 = defaultedMap1.size();
        int i22 = defaultedMap1.size();
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b20 = defaultedMap17.equals((java.lang.Object) "");
        boolean b22 = defaultedMap17.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) 10.0d);
        java.lang.String str25 = defaultedMap17.toString();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { defaultedMap17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) obj_array26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b33 = defaultedMap30.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b36 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b41 = defaultedMap38.equals((java.lang.Object) "");
        boolean b42 = defaultedMap35.equals((java.lang.Object) defaultedMap38);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection44 = defaultedMap38.values();
        java.lang.String str45 = defaultedMap38.toString();
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) str45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj58 = defaultedMap48.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) defaultedMap60, (java.lang.Object) "");
        boolean b63 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b66 = defaultedMap65.isEmpty();
        boolean b68 = defaultedMap65.equals((java.lang.Object) "");
        java.lang.Object obj71 = defaultedMap65.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b77 = defaultedMap76.isEmpty();
        boolean b79 = defaultedMap76.equals((java.lang.Object) "");
        java.lang.Object obj82 = defaultedMap76.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate83, predicate84);
        java.lang.Object obj86 = defaultedMap48.put((java.lang.Object) predicate72, (java.lang.Object) map85);
        java.util.Set set87 = defaultedMap48.entrySet();
        boolean b88 = defaultedMap1.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b91 = defaultedMap90.isEmpty();
        boolean b93 = defaultedMap90.equals((java.lang.Object) "");
        boolean b95 = defaultedMap90.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj96 = defaultedMap48.remove((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { obj31, predicate32, 'a' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        java.util.Set set39 = defaultedMap37.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b44 = defaultedMap41.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b47 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b52 = defaultedMap49.equals((java.lang.Object) "");
        boolean b53 = defaultedMap46.equals((java.lang.Object) defaultedMap49);
        defaultedMap41.putAll((java.util.Map) defaultedMap49);
        defaultedMap41.clear();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap41);
        boolean b57 = fixedOrderComparator35.add((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
        java.lang.Object obj60 = defaultedMap41.get((java.lang.Object) (byte) 1);
        java.util.Collection collection61 = defaultedMap41.values();
        boolean b62 = defaultedMap41.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap7.clear();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap14.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) defaultedMap26, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap30.isEmpty();
        java.lang.Object obj32 = defaultedMap14.get((java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b35 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b38 = defaultedMap37.isEmpty();
        boolean b40 = defaultedMap37.equals((java.lang.Object) "");
        boolean b41 = defaultedMap34.equals((java.lang.Object) defaultedMap37);
        boolean b42 = defaultedMap14.containsValue((java.lang.Object) b41);
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        java.util.Set set44 = defaultedMap14.entrySet();
        java.util.Set set45 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b50 = defaultedMap47.equals((java.lang.Object) "");
        boolean b52 = defaultedMap47.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj54 = defaultedMap47.remove((java.lang.Object) 10.0d);
        java.lang.String str55 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b60 = defaultedMap57.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b63 = defaultedMap62.isEmpty();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b66 = defaultedMap65.isEmpty();
        boolean b68 = defaultedMap65.equals((java.lang.Object) "");
        boolean b69 = defaultedMap62.equals((java.lang.Object) defaultedMap65);
        defaultedMap57.putAll((java.util.Map) defaultedMap65);
        boolean b71 = defaultedMap65.isEmpty();
        java.lang.Object obj72 = null;
        boolean b73 = defaultedMap65.equals(obj72);
        boolean b74 = defaultedMap47.containsValue((java.lang.Object) defaultedMap65);
        java.lang.Object obj75 = defaultedMap14.remove((java.lang.Object) defaultedMap47);
        boolean b76 = defaultedMap47.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) -1 + "'", obj32.equals((short) -1));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "" + "'", obj75.equals(""));
        org.junit.Assert.assertTrue(b76 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator11.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        defaultedMap33.clear();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) (short) 0);
        int i40 = defaultedMap33.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap33);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap44.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap44.put((java.lang.Object) defaultedMap56, (java.lang.Object) "");
        boolean b59 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b64 = defaultedMap61.equals((java.lang.Object) "");
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate68, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b73 = defaultedMap72.isEmpty();
        boolean b75 = defaultedMap72.equals((java.lang.Object) "");
        java.lang.Object obj78 = defaultedMap72.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate79, predicate80);
        java.lang.Object obj82 = defaultedMap44.put((java.lang.Object) predicate68, (java.lang.Object) map81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate42, predicate68);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) map83);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) -1 + "'", obj39.equals((short) -1));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b12 = defaultedMap9.equals((java.lang.Object) "");
        boolean b13 = defaultedMap6.equals((java.lang.Object) defaultedMap9);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap16.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) defaultedMap28, (java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b36 = defaultedMap33.equals((java.lang.Object) "");
        java.lang.Object obj39 = defaultedMap33.put((java.lang.Object) true, (java.lang.Object) 1L);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 1);
        java.lang.Object obj55 = defaultedMap45.put((java.lang.Object) (short) 1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) defaultedMap57, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b62 = defaultedMap61.isEmpty();
        java.lang.Object obj63 = defaultedMap45.get((java.lang.Object) b62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b66 = defaultedMap65.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        boolean b69 = defaultedMap68.isEmpty();
        boolean b71 = defaultedMap68.equals((java.lang.Object) "");
        boolean b72 = defaultedMap65.equals((java.lang.Object) defaultedMap68);
        boolean b73 = defaultedMap45.containsValue((java.lang.Object) b72);
        java.lang.String str74 = defaultedMap45.toString();
        boolean b75 = defaultedMap28.equals((java.lang.Object) str74);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) -1 + "'", obj63.equals((short) -1));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{-1.0=1, {}=, 1=}" + "'", str74.equals("{-1.0=1, {}=, 1=}"));
        org.junit.Assert.assertTrue(b75 == false);
    }
}

